package edu.learn.gwqin.jvm;

import java.lang.reflect.Method;

/**
 * @author: gwqin
 * @date: 2019/8/3 15:20
 * @descrption:
 */
public class MyTest21
{
    public static void main(String[] args) throws Exception
    {
        MyTest16 loader1 = new MyTest16("loader1");
        MyTest16 loader2 = new MyTest16("loader2");

        loader1.setPath("C:\\Users\\xk\\Desktop\\");
        loader2.setPath("C:\\Users\\xk\\Desktop\\");

        Class<?> clazz1 = loader1.loadClass("edu.learn.gwqin.jvm.MyPerson");
        Class<?> clazz2 = loader2.loadClass("edu.learn.gwqin.jvm.MyPerson");

        System.out.println(clazz1 == clazz2);

        Object object1 = clazz1.newInstance();
        Object object2 = clazz2.newInstance();

        Method method = clazz1.getMethod("setMyPerson", Object.class);
        method.invoke(object1, object2);
    }
}
