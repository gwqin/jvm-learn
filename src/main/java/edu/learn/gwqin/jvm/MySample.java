package edu.learn.gwqin.jvm;

/**
 * @author: gwqin
 * @date: 2019/8/2 19:19
 * @descrption:
 */
public class MySample
{
    public MySample()
    {
        System.out.println("MySample is loaded by : " + this.getClass().getClassLoader());
        new MyCat();
        System.out.println("form MySample :" + MyCat.class);
    }
}
