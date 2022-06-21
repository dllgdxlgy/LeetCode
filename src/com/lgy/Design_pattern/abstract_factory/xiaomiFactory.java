package com.lgy.Design_pattern.abstract_factory;

/**
 * @author LGY
 * @create 2022-06-21 18:52
 */
public class xiaomiFactory implements ProductFactory {
    @Override
    public IphoneProduct iphoneProduct() {
        return new xiaomiPhone();
    }

    @Override
    public IRouterProduct iRouterProduct() {
        return new xiaomiRouter();
    }
}
