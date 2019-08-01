package edu.learn.gwqin.jvm;

/**
 * @author: gwqin
 * @date: 2019/7/31 9:59
 * @descrption: 对于静态字段来说，只有直接定义了该字段的类才会被初始化；
 * 当一个类被初始化时，要求其父类全部都已经被初始化完成了。
 * -XX:+TraceClassLoading，用于追踪类的加载信息并打印出来
 * <p>
 * -XX:+<option>，表示开启option选项
 * -XX:-<option>，表示关闭option选项
 * -XX:<option>=<value>，表示将option选项的值设置为value
 */
public class MyTest1
{
    public static void main(String[] args)
    {
        System.out.println(MyChild1.str2);
    }
}

class MyParent1
{
    public static String str = "hello world";

    static
    {
        System.out.println("MyParent1 static block");
    }
}

class MyChild1 extends MyParent1
{
    public static String str2 = "welcome";

    static
    {
        System.out.println("MyChild1 static block");
    }
}