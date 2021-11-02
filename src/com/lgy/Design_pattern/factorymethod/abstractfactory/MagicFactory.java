package com.lgy.Design_pattern.factorymethod.abstractfactory;

public class MagicFactory extends AbastractFactory{


    @Override
    Food createFood() {
        return new MushRoom();
    }

    @Override
    Vehicle createeVehicle() {
        return new Broom();
    }

    @Override
    weapon createWeapon() {
        return new MagicStick();
    }
}
