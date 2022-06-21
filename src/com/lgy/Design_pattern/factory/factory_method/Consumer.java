package com.lgy.Design_pattern.factory.factory_method;

import com.lgy.Design_pattern.factory.desion_factory.CarFactory;

/**
 * @author LGY
 * @create 2022-06-21 16:45
 */
public class Consumer {

    public static void main(String[] args) {

        Car car = new WuLingFactory().getCar();
        Car car1 = new TeslaFactory().getCar();
        car.name();
        car1.name();
        Car car2 = new MobaiFactory().getCar();
        car2.name();

    }
}
