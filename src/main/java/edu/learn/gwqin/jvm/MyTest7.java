package edu.learn.gwqin.jvm;

/**
 * @author: gwqin
 * @date: 2019/8/1 12:53
 * @descrption:
 */
public class MyTest7
{
    public static void main(String[] args) throws ClassNotFoundException
    {
        Class<?> clazz = Class.forName("java.lang.String");
        System.out.println(clazz.getClassLoader());

        Class<?> clazz2 = Class.forName("edu.learn.gwqin.jvm.CC");
        System.out.println(clazz2.getClassLoader());
    }
}
class CC
{

}
