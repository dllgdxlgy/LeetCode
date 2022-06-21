package com.lgy.Design_pattern.abstract_factory;

/**
 * 小米手机
 * @author LGY
 * @create 2022-06-21 18:13
 */
public class HuaWeiPhone implements IphoneProduct{
    @Override
    public void start() {
        System.out.println("开启华为手机");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭华为手机");
    }

    @Override
    public void callup() {
        System.out.println("华为手机打电话");
    }

    @Override
    public void sentSMS() {
        System.out.println("华为手机发送短信");
    }
}
