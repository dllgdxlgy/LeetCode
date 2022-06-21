package com.lgy.Design_pattern.factory.factory_method;

/**
 * @author LGY
 * @create 2022-06-21 17:17
 */
public class TeslaFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Tesla();
    }
}
