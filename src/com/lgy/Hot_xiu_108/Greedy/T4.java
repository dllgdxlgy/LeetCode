package com.lgy.Hot_xiu_108.Greedy;

import java.util.Arrays;

/**
 * T4. 分发糖果
 https://leetcode.cn/problems/candy/
 * @author LGY
 * @create 2022-06-22 16:10
 */
public class T4 {

    /**
     * 记住吧。
     * @param ratings
     * @return
     */
    public int candy(int[] ratings) {

        int n = ratings.length;
        int[] arr = new int[n];
        int count = 0;
        Arrays.fill(arr,1);
        for(int i = 1; i < n; i++){
            if(ratings[i] > ratings[i-1]){
                arr[i] = arr[i-1]+1;
            }
        }
        for(int i = n-2; i >= 0;i--){
            if(ratings[i] > ratings[i+1]){
                arr[i] = Math.max(arr[i],arr[i+1]+1);
            }
        }
        for(int i = 0; i< n; i++){
            count += arr[i];
        }

        return count;

    }
}
