package edu.learn.gwqin.jvm;

/**
 * @author: gwqin
 * @date: 2019/8/1 18:55
 * @descrption:
 */
public class MyTest13
{
    public static void main(String[] args)
    {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        System.out.println(classLoader);

        while (classLoader != null)
        {
            classLoader = classLoader.getParent();
            System.out.println(classLoader);
        }
    }
}
