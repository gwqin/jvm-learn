package edu.learn.gwqin.jvm;

import java.util.Random;

/**
 * @author: gwqin
 * @date: 2019/8/1 15:03
 * @descrption:
 */
public class MyTest8
{
    public static void main(String[] args)
    {
        System.out.println(FinalTest.x);
    }
}

class FinalTest
{
    public static final int x = new Random().nextInt(4);

    static
    {
        System.out.println("FinalTest static block");
    }
}
