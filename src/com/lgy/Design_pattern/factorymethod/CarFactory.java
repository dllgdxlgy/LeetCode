package com.lgy.Design_pattern.factorymethod;

import com.lgy.Design_pattern.factorymethod.bean.Car;

/**
 * 除了简单工厂以外，我们还可以创建每个类的工厂
 */
public class CarFactory {

    public Car createCar(){
        //这里就像是添加了日志
        System.out.println("a car create ....");
        return new Car();
    }

}
