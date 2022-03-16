package com.lgy.Design_mode.Singleton;

/**
 *  单例模式 有 8 种写法
 *
 * @author LGY
 * @create 2022-03-16 14:22
 */
public class Singleton_01 {

    // 类加载到内存中，static 保证只加载一次， 线程安全的。
    private static final Singleton_01 INSTANCE = new Singleton_01();

    // 1. 构造器被私有化,让别人没办法调用
    private Singleton_01(){};

    // 2. getInstance() 只能到的一个实例
    public static Singleton_01 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        Singleton_01 singleton_01 = Singleton_01.getInstance();
        Singleton_01 singleton_02 = Singleton_01.getInstance();
        System.out.println(singleton_01 == singleton_02);

    }
}
