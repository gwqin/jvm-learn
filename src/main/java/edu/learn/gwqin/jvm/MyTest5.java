package edu.learn.gwqin.jvm;

import java.util.Random;

/**
 * @author: gwqin
 * @date: 2019/7/31 12:25
 * @descrption:
 */
public class MyTest5
{
    public static void main(String[] args)
    {
        System.out.println(MyChild5.a);
    }
}

interface MyParent5
{
    public static int a = 2;
}

interface MyChild5 extends MyParent5
{
    public static int b = new Random().nextInt(4);
}