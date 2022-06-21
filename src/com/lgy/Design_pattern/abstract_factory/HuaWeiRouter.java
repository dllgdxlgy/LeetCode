package com.lgy.Design_pattern.abstract_factory;

/**
 * 小米路由器
 * @author LGY
 * @create 2022-06-21 18:30
 */
public class HuaWeiRouter implements IRouterProduct {
    @Override
    public void start() {
        System.out.println("华为路由器开启");
    }

    @Override
    public void shutdown() {
        System.out.println("华为路由器关闭");
    }

    @Override
    public void openwifi() {
        System.out.println("华为路由器开启wifi");
    }

    @Override
    public void seting() {
        System.out.println("华为路由器开启设置");
    }
}
