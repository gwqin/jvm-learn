package edu.learn.gwqin.jvm;

import sun.management.snmp.jvminstr.JvmRuntimeImpl;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: gwqin
 * @date: 2019/8/1 20:04
 * @descrption:
 */
public class MyTest16 extends ClassLoader
{
    private String path;

    private String classLoaderName;

    private final String fileExtension = ".class";

    public void setPath(String path)
    {
        this.path = path;
    }

    public MyTest16(String classLoaderName)
    {
        //super(); // 将系统类加载器作为该类加载器的父类加载器
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
        System.out.println("自定义类加载器生效。");
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
            name = name.replace(".", "\\");
            is = new FileInputStream(new File(this.path + name + this.fileExtension));
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

    public static void main(String[] args) throws Exception
    {
        MyTest16 loader1 = new MyTest16("loader1");
        loader1.setPath("C:\\Users\\xk\\Desktop\\"); // C.class复制一份到桌面上，classpath下的C.class已经被删除

        Class<?> clazz = loader1.loadClass("edu.learn.gwqin.jvm.C");
        System.out.println("class：" + clazz.hashCode());
        Object object = clazz.newInstance();
        System.out.println(object);

        System.out.println("--------------------------");

        loader1 = null;
        clazz = null;
        object = null;

        List<Object> cs = new ArrayList<>();
        for (int i = 0; i < 80000000; i++)
        {
            cs.add(new Object());
        }
        System.gc();

        Thread.sleep(100000);

        loader1 = new MyTest16("loader1");
        loader1.setPath("C:\\Users\\xk\\Desktop\\"); // C.class复制一份到桌面上，classpath下的C.class已经被删除

        clazz = loader1.loadClass("edu.learn.gwqin.jvm.C");
        System.out.println("class：" + clazz.hashCode());
        object = clazz.newInstance();
        System.out.println(object);

//        MyTest16 loader2 = new MyTest16(loader1, "loader2"); // 将loader1作为loader2的父类传入
//        loader2.setPath("C:\\Users\\xk\\Desktop\\");
//
//        Class<?> clazz2 = loader2.loadClass("edu.learn.gwqin.jvm.C");
//        System.out.println("class：" + clazz2.hashCode());
//        Object object2 = clazz2.newInstance();
//        System.out.println(object2);
//
//        System.out.println("--------------------------");
//
//        MyTest16 loader3 = new MyTest16("loader3"); // 将loader1作为loader2的父类传入
//        loader3.setPath("C:\\Users\\xk\\Desktop\\");
//
//        Class<?> clazz3 = loader3.loadClass("edu.learn.gwqin.jvm.C");
//        System.out.println("class：" + clazz3.hashCode());
//        Object object3 = clazz3.newInstance();
//        System.out.println(object3);

    }
}
