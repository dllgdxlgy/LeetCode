package com.lgy.Design_pattern.singleton;

//完美，比Mgr07还玩完美
//不仅可以解决线程同步，还可以防止反序列化。
public enum Mgr08 {

    INSTANCE;

    public void add(){
        System.out.println("add...........");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Mgr08.INSTANCE.hashCode());
                }
            }).start();

        }
    }

}
