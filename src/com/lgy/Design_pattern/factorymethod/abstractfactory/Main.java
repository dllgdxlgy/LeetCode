package com.lgy.Design_pattern.factorymethod.abstractfactory;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.go();
//        AK47 ak47 = new AK47();
//        ak47.shoot();
//        Bread bread = new Bread();
//        bread.printName();
        AbastractFactory factory = new ModernFactory();
        Vehicle vehicle = factory.createeVehicle();
        Food food = factory.createFood();
        weapon weapon = factory.createWeapon();

        vehicle.go();
        food.printName();
        weapon.shoot();



    }
}
