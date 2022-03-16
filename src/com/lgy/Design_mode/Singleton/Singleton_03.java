package com.lgy.Design_mode.Singleton;

/**
 *
 * 第三种：懒汉式
 *
 *  懒汉式：什么时候我用的时候，我才进行初始化。
 *
 *  存在的问题：多线程访问的时候，会有影响。在判断是不是null的时候，可能会两个线程创建一个对象
 *  那这个时候就会出现问题
 *
 * @author LGY
 * @create 2022-03-16 14:38
 */
public class Singleton_03 {

    private static Singleton_03 INSTANCE;

    private Singleton_03(){ }

    public static Singleton_03 getInstance(){
        if (INSTANCE == null){
            INSTANCE = new Singleton_03();
        }
        return INSTANCE;
    }
}
