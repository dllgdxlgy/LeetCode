package com.lgy.company.bolekeji;

import java.util.HashMap;

/**
 * @author LGY
 * @create 2022-09-18 19:42
 */
public class T3 {

    public int maximumBonuses(int[] bonuses, long k) {
        // write code here

        int[] dp = new int[bonuses.length];
        dp[0] = bonuses[0];

        for (int i = 1; i < bonuses.length; i++) {
            if (bonuses[i] > dp[i - 1]) {
                dp[i] = dp[i - 1];
            } else {
                dp[i] = bonuses[i];
            }
        }

//        long left = 0;
//        long right = k-1;
//
//        while(right<bonuses.length){
//            if(dp[(int) left] == dp[(int) right]){
//                return dp[(int) left];
//            }else {
//                left++;
//                right++;
//            }
//        }

//        int num = 0;
//        int value = bonuses[0];
//        int left = 0;
//        int right = 0;
//        for (int i = right; i < bonuses.length; i++) {
//            if(num == k){
//                return value;
//            }
//            if(dp[left] == right){
//
//            }
//        }

        return 0;
    }
}
