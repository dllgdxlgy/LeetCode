package com.lgy.Design_mode.Singleton;

/**
 * 静态内部类的写法，比方法一完美，最完美的。
 *
 * 当一个类被加载的时候，它的静态内部类是不会被加载的。当调用的时候才会加载。
 *
 * @author LGY
 * @create 2022-03-16 15:00
 */
public class Singleton_07 {

    private Singleton_07(){}

    // 静态内部类
    private static class Singleton_07Holder{
        private final static Singleton_07 INSTANCE = new Singleton_07();
    }

    public static Singleton_07 getInstance(){
        return Singleton_07Holder.INSTANCE;
    }

}
