package edu.learn.gwqin.jvm;

/**
 * @author: gwqin
 * @date: 2019/7/31 10:37
 * @descrption: 常量在编译阶段会被存入到调用这个常量的方法所在类的常量池中，
 * 本质上，调用类并没有直接引用到定义常量的类，因此不会触发定义常量类的初始化。
 * 注意：这里指的是将常量存放到了MyTest2的常量池中，之后MyTest2与MyParent2就没有关系了，
 * 甚至，可以将MyParent2的class文件删除。
 */
public class MyTest2
{
    public static void main(String[] args)
    {
        System.out.println(MyParent2.str);
    }
}

class MyParent2
{
    public final static String str = "hello world"; // final

    static
    {
        System.out.println("MyParent2 static block");
    }
}
