package com.lgy.Design_mode.Singleton;

/**
 * 第二种写法
 *
 * @author LGY
 * @create 2022-03-16 14:34
 */
public class Singleton_02 {

    // final 必须初始化
    private static final Singleton_02 INSTANCE;

    static {
        INSTANCE = new Singleton_02();
    }

    // 私有构造器
    private Singleton_02(){ }

    public static Singleton_02 getInstance(){
        return INSTANCE;
    }
}
