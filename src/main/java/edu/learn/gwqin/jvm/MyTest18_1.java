package edu.learn.gwqin.jvm;

/**
 * @author: gwqin
 * @date: 2019/8/3 14:12
 * @descrption:
 */
public class MyTest18_1
{
    public static void main(String[] args) throws ClassNotFoundException
    {
        MyTest16 loader1 = new MyTest16("loader1");
        loader1.setPath("C:\\Users\\xk\\Desktop\\");
        Class<?> clazz = loader1.loadClass("edu.learn.gwqin.jvm.C");
        System.out.println("class : " + clazz.hashCode());
        System.out.println("class loader :" + clazz.getClassLoader());
    }
}
