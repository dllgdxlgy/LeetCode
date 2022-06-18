package com.lgy.Hot_xiu_108.DP;

/**
 * 3. 子数组的最大累加和问题
 * @author LGY
 * @create 2022-06-18 15:12
 */
public class T3 {

    public int maxsumofSubarray (int[] arr) {
        // write code here
        int res = Integer.MIN_VALUE;
        for(int i = 1; i < arr.length;i++){
            arr[i] = Math.max(arr[i],arr[i]+arr[i-1]);
            res = Math.max(res,arr[i]);
        }
        res = Math.max(res,arr[0]);
        return res;
    }
}
