package edu.learn.gwqin.jvm;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

/**
 * @author: gwqin
 * @date: 2019/8/1 18:58
 * @descrption:
 */
public class MyTest14
{
    public static void main(String[] args) throws IOException
    {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(classLoader);

        String resourceName = "edu/learn/gwqin/jvm/MyTest13.class";
        Enumeration<URL> urls = classLoader.getResources(resourceName);

        while (urls.hasMoreElements())
        {
            URL url = urls.nextElement();
            System.out.println(url);
        }
    }
}
