package com.lgy.Design_pattern.abstract_factory;

/**
 * 小米手机
 * @author LGY
 * @create 2022-06-21 18:13
 */
public class xiaomiPhone implements IphoneProduct{
    @Override
    public void start() {
        System.out.println("开启小米手机");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭小米手机");
    }

    @Override
    public void callup() {
        System.out.println("小米手机打电话");
    }

    @Override
    public void sentSMS() {
        System.out.println("小米手机发送短信");
    }
}
