package com.lgy.Design_mode.Singleton;

/**
 * @author LGY
 * @create 2022-08-21 14:10
 */
public class precise {

    public static volatile precise INSTANCE ;

    private precise(){};

    public static precise getInstance(){

        if(INSTANCE == null){
            synchronized(precise.class){
                if(INSTANCE == null){
                    INSTANCE = new precise();
                }
            }
        }
        return INSTANCE;
    }


}
