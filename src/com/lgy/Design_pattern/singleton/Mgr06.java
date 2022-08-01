package com.lgy.Design_pattern.singleton;

/**
 *
 */
public class Mgr06 {
    private static Mgr06 INSTANCE;
    private Mgr06(){}

    public static Mgr06 getInstance() {
        if (INSTANCE == null) {
            //不能保持只有一个实例
            synchronized (Mgr06.class) {
                if (INSTANCE == null) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Mgr06();
                }
            }
        }
        return INSTANCE;
    }

//    //该类中其他方法
//    public void add(){
//        System.out.println("add...........");
//    }
//
//    public static void main(String[] args) {
//        for (int i = 0; i < 100; i++) {
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println(Mgr06.getInstance().hashCode());
//                }
//            }).start();
//
//        }
//    }

}
