package com.lgy.Design_pattern.factorymethod.abstractfactory;

public class ModernFactory extends AbastractFactory{


    @Override
    Food createFood() {
        return new Bread();
    }

    @Override
    Vehicle createeVehicle() {
        return new Car();
    }

    @Override
    weapon createWeapon() {
        return new AK47();
    }
}
