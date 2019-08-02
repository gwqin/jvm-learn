package edu.learn.gwqin.jvm;

/**
 * @author: gwqin
 * @date: 2019/8/2 19:19
 * @descrption:
 */
public class MyCat
{
    public MyCat()
    {
        System.out.println("MyCat is loaded by : " + this.getClass().getClassLoader());
    }
}
