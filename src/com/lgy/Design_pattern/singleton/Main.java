package com.lgy.Design_pattern.singleton;

public class Main {

    //无法通过外部进行创建对象
    //Mgr01 mgr01 = new Mgr01();

    public static void main(String[] args) {

        //无法通过外部进行创建对象
        //Mgr01 mgr01 = new Mgr01();
        //尽可以通过此种方法进行创建
        Mgr01 instance = Mgr01.getInstance();


    }
}
