package com.lgy.Design_pattern.factory.factory_method;

/**
 * @author LGY
 * @create 2022-06-21 17:20
 */
public class MobaiFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new MoBai();
    }
}
