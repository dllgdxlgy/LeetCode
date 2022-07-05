package com.lgy.leetcode;

/**
 * T50 实现Pow函数
 * @author LGY
 * @create 2022-07-04 20:59
 */
public class T50 {

    public double myPow(double x, int n) {
        if(x ==0.0f)
            return 0.0;

        long b = n;

        double res = 1.0;
        if (b < 0){
            x = 1 / x;
            b = -b;
        }
        while (b>0){
            if((b&1) == 1){
                res = res*x;
            }
            x = x*x;
            b >>= 1;
        }
        return res;
    }

}
