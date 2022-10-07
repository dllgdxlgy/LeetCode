package com.lgy.leetcode;

import java.util.HashSet;

/**
 * @author LGY
 * @create 2022-10-07 15:22
 */
public class T202 {


    /**
     * T202、快乐数
     * @param n
     * @return
     */
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        while(!set.contains(n) && n != 1){
            set.add(n);
            n = getNextNum(n);
        }

        return n == 1;
    }

    public int getNextNum(int n){
        int res = 0;
        while(n > 0){
            int temp = n % 10;
            res += temp * temp;
            n = n / 10;
        }
        return res;
    }
}
