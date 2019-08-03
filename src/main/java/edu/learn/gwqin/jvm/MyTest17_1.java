package edu.learn.gwqin.jvm;

/**
 * @author: gwqin
 * @date: 2019/8/2 19:20
 * @descrption:
 */
public class MyTest17_1
{
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException
    {
        MyTest16 loader1 = new MyTest16("loader1");
        loader1.setPath("C:\\Users\\xk\\Desktop\\");
        Class<?> aClass = loader1.loadClass("edu.learn.gwqin.jvm.MySample");
        System.out.println("class: " + aClass.hashCode());
        /**
         * 如果注释掉下面这行，那么并不会实例化MySample对象，即MySample构造方法不会被调用
         * 因此不会实例化MyCat对象，既没有对MyCat进行主动使用，这里就不会加载MyCat class
         */
        Object o = aClass.newInstance();
    }
}
