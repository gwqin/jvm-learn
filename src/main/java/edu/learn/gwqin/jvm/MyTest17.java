package edu.learn.gwqin.jvm;

/**
 * @author: gwqin
 * @date: 2019/8/2 19:20
 * @descrption:
 */
public class MyTest17
{
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException
    {
        MyTest16 loader1 = new MyTest16("loader1");
        Class<?> aClass = loader1.loadClass("edu.learn.gwqin.jvm.MySample");
        System.out.println("class: " + aClass.hashCode());
//        Object o = aClass.newInstance();
    }
}
