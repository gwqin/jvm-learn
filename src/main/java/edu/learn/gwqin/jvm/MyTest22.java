package edu.learn.gwqin.jvm;

/**
 * @author: gwqin
 * @date: 2019/8/3 16:50
 * @descrption:
 */
public class MyTest22
{
    static
    {
        System.out.println("MyTest22 initializer");
    }
    public static void main(String[] args)
    {
        System.out.println(MyTest22.class.getClassLoader());
        System.out.println(MyTest1.class.getClassLoader());
    }
}
