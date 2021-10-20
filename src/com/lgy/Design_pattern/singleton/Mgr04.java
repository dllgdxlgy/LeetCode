package com.lgy.Design_pattern.singleton;

/**
 * 懒汉式
 * 虽然是达到了初始化的目的，但却带来了线程不安全的问题
 * 可以通过synchronized解决，但是这样做效率会下降
 *
 */
public class Mgr04 {
    private static Mgr04 INSTANCE;
    private Mgr04(){}

    public static synchronized Mgr04 getInstance(){
        if (INSTANCE == null){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            INSTANCE = new Mgr04();
        }
        return INSTANCE;
    }
    //该类中其他方法
    public void add(){
        System.out.println("add...........");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Mgr04.getInstance().hashCode());
                }
            }).start();

        }
    }

}
