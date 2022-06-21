package com.lgy.Design_pattern.factory.desion_factory;

/**
 * @author LGY
 * @create 2022-06-21 16:45
 */
public class Consumer {

    public static void main(String[] args) {

        // 注意：这里是我们自己造出来的，如果我们是自己直
        // 接在工厂里买，反正我们不花钱，但是我们能拿到对象。
//        Car car = new WuLing();
//        Car car1 = new Tesla();

        //现在不用管五菱这个车是怎么来的，也就是对象是不用管怎么来的。
        Car car = CarFactory.getCar("五菱");
        Car car1 = CarFactory.getCar("特斯拉");
        car.name();
        car1.name();



    }
}
