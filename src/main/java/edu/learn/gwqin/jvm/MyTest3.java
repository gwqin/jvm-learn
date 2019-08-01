package edu.learn.gwqin.jvm;

import java.util.UUID;

/**
 * @author: gwqin
 * @date: 2019/7/31 10:50
 * @descrption: 当一个常量的值并非在编译期间可以确定的，那么其值就不会被放到调用类的常量池中，
 * 这时在运行程序时，会导致主动使用这个常量所在的类，显然会导致这个类的初始化。
 */
public class MyTest3
{
    public static void main(String[] args)
    {
        System.out.println(MyParent3.str);
    }
}

class MyParent3
{
    public final static String str = UUID.randomUUID().toString();

    static
    {
        System.out.println("MyParent3 static block");
    }
}
