package edu.learn.gwqin.jvm;

/**
 * @author: gwqin
 * @date: 2019/8/1 19:32
 * @descrption:
 */
public class MyTest15
{
    public static void main(String[] args)
    {
        String[] strings = new String[2];
        System.out.println(strings.getClass().getClassLoader()); // 根加载器

        System.out.println("=============");

        MyTest15[] myTest15s = new MyTest15[2];
        System.out.println(myTest15s.getClass().getClassLoader()); // 系统类加载器

        System.out.println("=============");

        int[] ints = new int[2];
        System.out.println(ints.getClass().getClassLoader()); // 原生类型，没有加载器
    }
}
