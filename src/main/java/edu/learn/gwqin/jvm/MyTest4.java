package edu.learn.gwqin.jvm;

/**
 * @author: gwqin
 * @date: 2019/7/31 11:12
 * @descrption: 助记符：
 * anewarray：表示创建一个引用类型的（如类、接口、数组）数组，并将其引用压入栈顶
 * newarray：表示创建一个指定的原始类型（如int、float、char等）的数组，并将其引用压入栈顶
 */
public class MyTest4
{
    public static void main(String[] args)
    {
//        MyPsrent4 myPsrent4 = new MyPsrent4();
//        System.out.println("=================");
//        MyPsrent4 myPsrent5 = new MyPsrent4();
        MyPsrent4[] myPsrent4s = new MyPsrent4[1];
        System.out.println(myPsrent4s.getClass());

        MyPsrent4[][] myPsrent4s1 = new MyPsrent4[1][1];
        System.out.println(myPsrent4s1.getClass());

        System.out.println(myPsrent4s.getClass().getSuperclass());
        System.out.println(myPsrent4s1.getClass().getSuperclass());

        System.out.println("======");

        int[] ints = new int[1];
        System.out.println(ints.getClass());
        System.out.println(ints.getClass().getSuperclass());
    }
}

class MyPsrent4
{
    static
    {
        System.out.println("MyPsrent4 static block");
    }
}
