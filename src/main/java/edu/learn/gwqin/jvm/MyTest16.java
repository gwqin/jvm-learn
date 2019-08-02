package edu.learn.gwqin.jvm;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author: gwqin
 * @date: 2019/8/1 20:04
 * @descrption:
 */
public class MyTest16 extends ClassLoader
{
    private String classLoaderName;

    private final String fileExtension = ".class";

    public MyTest16(String classLoaderName)
    {
        super(); // 将系统类加载器作为该类加载器的父类加载器
        this.classLoaderName = classLoaderName;
    }

    public MyTest16(ClassLoader parent, String classLoaderName)
    {
        super(parent); // 显示指定该类加载器的父类加载器
        this.classLoaderName = classLoaderName;
    }

    @Override
    public String toString()
    {
        return "[" + classLoaderName + "]";
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException
    {
        byte[] data = this.loadClassData(name);
        return this.defineClass(name, data, 0, data.length);
    }


    private byte[] loadClassData(String name)
    {
        InputStream is = null;
        byte[] data = null;
        ByteArrayOutputStream baos = null;

        try
        {
            this.classLoaderName = this.classLoaderName.replace(".", "/");
            is = new FileInputStream(new File(name + this.fileExtension));
            baos = new ByteArrayOutputStream();
            int ch = 0;
            while (-1 != (ch = is.read()))
            {
                baos.write(ch);
            }
            data = baos.toByteArray();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if (is != null)
                {
                    is.close();
                }

                if (baos != null)
                {
                    baos.close();
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        return data;
    }

    public static void test(ClassLoader classLoader) throws Exception
    {
        Class<?> clazz = classLoader.loadClass("edu.learn.gwqin.jvm.MyTest15");
        Object o = clazz.newInstance();
        System.out.println(o);
    }

    public static void main(String[] args) throws Exception
    {
        MyTest16 myTest16 = new MyTest16(MyTest16.class.getClassLoader(),"myClassLoader");
        MyTest16.test(myTest16);
    }
}
