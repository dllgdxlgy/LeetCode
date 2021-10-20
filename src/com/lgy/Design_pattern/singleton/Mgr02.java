package com.lgy.Design_pattern.singleton;

/**
 * 是通过静态代码块进行创建的对象，和第一个没有区别。
 */
public class Mgr02 {

    //创建对象
    private static final Mgr02 INSTANCE;

    static {
        INSTANCE = new Mgr02();
    }

    //私有构造方法
    private Mgr02(){};

    //获取实例的唯一方法
    public static Mgr02 getInstance(){

        return INSTANCE;
    }

    //该类中其他方法
    public void add(){
        System.out.println("add...........");
    }

    public static void main(String[] args) {
        Mgr02 mgr = Mgr02.getInstance();
        Mgr02 mgr02 = Mgr02.getInstance();
        System.out.println(mgr==mgr02);
    }

}
