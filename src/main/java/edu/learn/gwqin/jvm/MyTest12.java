package edu.learn.gwqin.jvm;

/**
 * @author: gwqin
 * @date: 2019/8/1 16:07
 * @descrption:
 *
 * 调用ClassLoader的loadClass方法加载一个类，并不是对类的主动使用，不会导致类的初始化。
 *
 */
public class MyTest12
{
    public static void main(String[] args) throws ClassNotFoundException
    {
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        Class<?> clazz = loader.loadClass("edu.learn.gwqin.jvm.CL");
        System.out.println(clazz);
        System.out.println("===================");
        clazz = Class.forName("edu.learn.gwqin.jvm.CL"); // 反射导致类的初始化
        System.out.println(clazz);
    }
}
class CL
{
    static
    {
        System.out.println("Class CL");
    }
}
