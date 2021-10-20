package com.lgy.Design_pattern.singleton;

/**
 * 饿汉式
 * 类加载到内存中，就实例化一个单例，JVM保证线程安全(每一个Class只会加载一次
 * static类型的变量实在类加载后马上进行初始化，也保证初始化一次) 推荐使用！
 *
 * 唯一缺点：不管用到与否，类加载的时候就完成实例化
 *
 *
 */
public class Mgr01 {

    //创建对象
    private static final Mgr01 INSTANCE = new Mgr01();

    //私有构造方法
    private Mgr01(){};

    //获取实例的唯一方法
    public static Mgr01 getInstance(){

        return INSTANCE;
    }

    //该类中其他方法
    public void add(){
        System.out.println("add...........");
    }

    public static void main(String[] args) {
        Mgr01 mgr01 = Mgr01.getInstance();
        Mgr01 mgr02 = Mgr01.getInstance();
        System.out.println(mgr01==mgr02);
    }
}
