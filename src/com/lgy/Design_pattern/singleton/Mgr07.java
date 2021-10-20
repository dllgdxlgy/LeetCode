package com.lgy.Design_pattern.singleton;

//完美，比Mgr01还玩完美
//jvm保证单例
//加载内部类是不会加载内部类，这样可以实现懒加载
public class Mgr07 {


    //私有构造器
    private Mgr07(){}

    //静态内部类(外部类被加载的时候是不会加载内部类的)
    private static class Mgr07Holder{
        private final static Mgr07 INSTANCE = new Mgr07();
    }
    public static Mgr07 getInstance(){
        //只有在调用Mgr07Holder.INSTANCE时候，静态内部类才会加载
        return Mgr07Holder.INSTANCE;
    }

    public void add(){
        System.out.println("add...........");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Mgr07.getInstance().hashCode());
                }
            }).start();

        }
    }

}
