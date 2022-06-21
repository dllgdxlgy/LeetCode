package com.lgy.Design_pattern.abstract_factory;

/**
 * @author LGY
 * @create 2022-06-21 18:52
 */
public class HuaWeiFactory implements ProductFactory {
    @Override
    public IphoneProduct iphoneProduct() {
        return new HuaWeiPhone();
    }

    @Override
    public IRouterProduct iRouterProduct() {
        return new HuaWeiRouter();
    }
}
