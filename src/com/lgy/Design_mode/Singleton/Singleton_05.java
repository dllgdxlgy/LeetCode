package com.lgy.Design_mode.Singleton;

/**
 * 只在需要的时候加锁,但是 new 出来的可能不是一个对象，存在线程问题。相当于没有加锁
 *
 * @author LGY
 * @create 2022-03-16 14:51
 */
public class Singleton_05 {

    private static Singleton_05 INSTANCE;

    private Singleton_05(){};

    public static Singleton_05 getInstance(){

        if (INSTANCE == null){

            synchronized (Singleton_05.class){
                INSTANCE = new Singleton_05();
            }
        }
        return INSTANCE;
    }
}
