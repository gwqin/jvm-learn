package edu.learn.gwqin.jvm;

import com.sun.crypto.provider.AESKeyGenerator;

/**
 * @author: gwqin
 * @date: 2019/8/3 15:05
 * @descrption:
 */
public class MyTest19
{
    public static void main(String[] args)
    {
        AESKeyGenerator aesKeyGenerator = new AESKeyGenerator();

        System.out.println(aesKeyGenerator.getClass().getClassLoader());
        System.out.println(MyTest19.class.getClassLoader());
    }
}
