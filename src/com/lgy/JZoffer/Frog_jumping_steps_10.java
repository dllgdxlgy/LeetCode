package com.lgy.JZoffer;

/**
 * 青蛙跳台阶问题
 */
public class Frog_jumping_steps_10 {


    /**
     *
     * @param n
     * @return
     */
    public int numWays(int n) {

        int a = 1;
        int b = 2;
        int sum;
        for (int i = 1; i < n; i++) {
            sum = (a+b)%1000000007;
            a=b;
            b= sum;

        }
        return a;
    }
}
