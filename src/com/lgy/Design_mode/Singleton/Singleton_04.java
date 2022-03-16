package com.lgy.Design_mode.Singleton;

/**
 *
 * // 方式四，加锁来解决问题，效率会降低。
 *
 * @author LGY
 * @create 2022-03-16 14:48
 */
public class Singleton_04 {

    private static Singleton_04 INSTANCE;

    private Singleton_04(){};

    // 加锁的方式来解决方式三存在的问题
    public static synchronized Singleton_04 getInstance(){
        if (INSTANCE == null){
            INSTANCE = new Singleton_04();
        }
        return INSTANCE;
    }
}
