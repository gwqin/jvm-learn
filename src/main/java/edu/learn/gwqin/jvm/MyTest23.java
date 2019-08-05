package edu.learn.gwqin.jvm;

import sun.misc.Launcher;

/**
 * @author: gwqin
 * @date: 2019/8/3 14:12
 * @descrption:
 */
public class MyTest23
{
    public static void main(String[] args)
    {
        System.out.println(System.getProperty("sun.boot.class.path"));
        System.out.println(System.getProperty("java.ext.dirs"));
        System.out.println(System.getProperty("java.class.path"));

        System.out.println("-------------------");
        System.out.println(ClassLoader.class.getClassLoader());

        System.out.println("-------------------");
        System.out.println(Launcher.class.getClassLoader());

        System.out.println("-------------------");
        System.out.println(System.getProperty("java.system.class.loader"));

        System.out.println(MyTest23.class.getClassLoader());
        System.out.println(MyTest16.class.getClassLoader());

        System.out.println(ClassLoader.getSystemClassLoader());
    }
}
