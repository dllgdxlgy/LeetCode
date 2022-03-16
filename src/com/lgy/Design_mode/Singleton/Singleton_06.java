package com.lgy.Design_mode.Singleton;

/**
 * 双重检查,不能避免反序列化
 *
 * @author LGY
 * @create 2022-03-16 14:55
 */
public class Singleton_06 {

    private static volatile Singleton_06 INSTANCE;

    private Singleton_06(){};

    public static Singleton_06 getInstance(){


        if (INSTANCE == null){
            synchronized (Singleton_06.class){
                if (INSTANCE == null){
                    INSTANCE = new Singleton_06();
                }
            }
        }
        return INSTANCE;
    }
}
