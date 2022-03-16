package com.lgy.Design_mode.Singleton;

/**
 * 枚举单例
 *
 * @author LGY
 * @create 2022-03-16 15:05
 */
public enum  Singleton_08 {
    INSTANCE;


    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Singleton_08.INSTANCE.hashCode());
                }
            }).start();
        }
    }
}
