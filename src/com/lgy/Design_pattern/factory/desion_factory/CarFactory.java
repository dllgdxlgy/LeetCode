package com.lgy.Design_pattern.factory.desion_factory;


/**
 * 静态工厂模式/简单工厂模式
 *
 * @author LGY
 * @create 2022-06-21 16:49
 */
public class CarFactory {

    /**
     * 虽然直接可以使用参数来创建对象，但是如果要是创建的类型多了，
     * 比如这个时候又有了其他的车，那我们要修改这个类，还是不方便。
     * @param car
     * @return
     */
    public static Car getCar(String car){
        if (car.equals("五菱")){
            return new WuLing();
        }else if(car.equals("特斯拉")){
            return new Tesla();
        }else {
            return null;
        }
    }
}
