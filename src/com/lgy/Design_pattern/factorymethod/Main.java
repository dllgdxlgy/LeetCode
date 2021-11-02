package com.lgy.Design_pattern.factorymethod;

import com.lgy.Design_pattern.factorymethod.bean.*;

public class Main {
    public static void main(String[] args) {

//        Car car = new Car();
//        car.go();
//        Plane plane = new Plane();
//        plane.go();
//        Train train = new Train();
//        train.go();
//        Moveable m = new Broom();
//        m.go();

        Moveable moveable = new CarFactory().createCar();
        moveable.go();

    }
}
