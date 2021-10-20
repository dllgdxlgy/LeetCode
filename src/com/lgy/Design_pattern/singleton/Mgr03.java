package com.lgy.Design_pattern.singleton;


/**
 * 懒汉式
 *
 * 缺点：线程不安全的、
 * 优点：什么时候用什么时候进行创建对象
 */
public class Mgr03 {
    private static Mgr03 INSTANCE;
    private Mgr03(){}

    public static Mgr03 getInstance(){
        if (INSTANCE == null){

            //测试线程不安全的
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            INSTANCE = new Mgr03();
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
                    System.out.println(Mgr03.getInstance().hashCode());
                }
            }).start();

        }
    }



}
