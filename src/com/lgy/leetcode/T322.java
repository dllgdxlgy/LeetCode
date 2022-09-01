package com.lgy.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/**
 * T322 零钱兑换
 *
 * @author LGY
 * @create 2022-08-31 16:21
 */
public class T322 {

//    int res = Integer.MAX_VALUE;
//    List<Integer> list = new ArrayList<>();
//
//    public int coinChange(int[] coins, int amount) {
//        Arrays.sort(coins);
//
//        backTracking(coins, 0, amount, 0);
//
//        return res == Integer.MAX_VALUE ? -1:res;
//    }
//
//    public void backTracking(int[] arr, int index, int amount, int sum) {
//        if (sum == amount) {
//            res = Math.min(res,list.size());
//            return;
//        }
//        if(sum > amount){
//            return;
//        }
//
//        for (int i = index; i < arr.length; i++) {
//
//            sum += arr[i];
//            list.add(arr[i]);
//            backTracking(arr,i,amount,sum);
//            sum -= arr[i];
//            list.remove(list.size()-1);
//
//        }
//    }

    int res = Integer.MAX_VALUE;
    int t = 0;

    public int coinChange(int[] coins, int amount) {
        if(amount == 0){
            return 0;
        }
        Arrays.sort(coins);

        backTracking(coins, amount);

        return res == Integer.MAX_VALUE ? -1:res;
    }

    public void backTracking(int[] arr, int amount) {
        if (amount == 0) {
            res = Math.min(res,t);
            return;
        }
        if(amount < 0){
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > amount){
                break;
            }
            int temp = amount/arr[i];
            t+=temp;
            backTracking(arr,amount-temp*arr[i]);
            t-=temp;

        }
    }
    public static void main(String[] args) {
        T322 t322 = new T322();
//        int[] arr = new int[]{411,412,413,414,415,416,417,418,419,420,421,422};
        int[] arr = new int[]{1,2,5};
        int i = t322.coinChange(arr, 11);
        System.out.println(i);

    }
}
