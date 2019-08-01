package edu.learn.gwqin.jvm;

import java.util.Random;

/**
 * @author: gwqin
 * @date: 2019/7/31 12:25
 * @descrption:
 */
public class MyTest5_1
{
    public static void main(String[] args)
    {
        System.out.println(MyParent5_1.thread);
    }
}

interface MyParent5_1 extends MyGrandpa5_1
{
    public static int a = 4;

    public static Thread thread = new Thread()
    {
        // 实例化块，在构造方法之前执行，当Thread的匿名类初始化的时候，代码块会被执行（每new一个类代码块都会执行一次）
        {
            System.out.println("MyParent5_1 invoked!");
        }
    };
}

interface MyGrandpa5_1
{
    public static Thread thread = new Thread(){
        {
            System.out.println("MyGrandpa5_1 invoked!");
        }
    };
}