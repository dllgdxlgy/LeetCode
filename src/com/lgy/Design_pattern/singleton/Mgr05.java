package com.lgy.Design_pattern.singleton;

public class Mgr05 {
    private static Mgr05 INSTANCE;
    private Mgr05(){}

    public static Mgr05 getInstance() {
        if (INSTANCE == null) {
            //不能保持只有一个实例
            synchronized (Mgr05.class) {

                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new Mgr05();
            }

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
                    System.out.println(Mgr05.getInstance().hashCode());
                }
            }).start();

        }
    }




}
