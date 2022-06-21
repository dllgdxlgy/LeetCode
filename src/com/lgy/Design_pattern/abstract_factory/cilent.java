package com.lgy.Design_pattern.abstract_factory;

/**
 * @author LGY
 * @create 2022-06-21 18:55
 */
public class cilent {

    public static void main(String[] args) {
        System.out.println("=========小米产品=========");

        //小米工厂
        xiaomiFactory xiaomiFactory = new xiaomiFactory();
        IphoneProduct iphoneProduct = xiaomiFactory.iphoneProduct();
        iphoneProduct.callup();
        iphoneProduct.sentSMS();

        IRouterProduct iRouterProduct = xiaomiFactory.iRouterProduct();
        iRouterProduct.openwifi();

        System.out.println("=========华为产品=========");

        HuaWeiFactory huaWeiFactory = new HuaWeiFactory();
        IphoneProduct iphoneProduct1 = huaWeiFactory.iphoneProduct();
        iphoneProduct1.sentSMS();
        iphoneProduct1.callup();
    }
}
