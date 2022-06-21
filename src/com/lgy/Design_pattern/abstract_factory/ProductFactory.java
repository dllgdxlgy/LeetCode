package com.lgy.Design_pattern.abstract_factory;

/**
 * // 抽象产品工厂
 * @author LGY
 * @create 2022-06-21 18:49
 */
public interface ProductFactory {

    //生产手机
    IphoneProduct iphoneProduct();

    //生产路由器
    IRouterProduct iRouterProduct();
}
