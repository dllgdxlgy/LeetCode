package com.lgy.Design_pattern.abstract_factory;

/**
 * 路由器产品接口
 * @author LGY
 * @create 2022-06-21 18:11
 */
public interface IRouterProduct {

    void start();
    void shutdown();
    void openwifi();
    void seting();
}
