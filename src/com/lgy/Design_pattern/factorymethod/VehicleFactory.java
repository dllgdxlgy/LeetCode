package com.lgy.Design_pattern.factorymethod;

import com.lgy.Design_pattern.factorymethod.bean.Broom;
import com.lgy.Design_pattern.factorymethod.bean.Car;
import com.lgy.Design_pattern.factorymethod.bean.Plane;

/**
 * 简单工厂
 * 缺点：可扩展性不好
 */

public class VehicleFactory {
    public Car createCar(){
        //在创建对象之前可以进行一些前置操作
        return new Car();
    }
    public Broom createBroom(){
        //在创建对象之前可以进行一些前置操作
        return new Broom();
    }
    public Plane createPlane(){
        //在创建对象之前可以进行一些前置操作
        return new Plane();
    }
}
