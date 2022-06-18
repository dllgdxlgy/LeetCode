package com.lgy.Hot_xiu_108.DP;

/**
 * 3. 子数组的最大累加和问题

 https://www.nowcoder.com/practice/554aa508dd5d4fefbf0f86e5fe953abd?tpId=188&&tqId=38297&rp=1&r
 u=/activity/oj&qru=/ta/job-code-high-week/question-ranking
 * @author LGY
 * @create 2022-06-18 15:12
 */
public class T3 {

    /**
     *  自己做的
     * @param arr
     * @return
     */
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

    /**
     * 改进
     * @param arr
     * @return
     */
    public int maxsumofSubarray_1 (int[] arr) {
        // write code here
        int res = arr[0];
        int temp = res;
        for(int i = 1; i < arr.length;i++){
            temp = temp >=0? temp+arr[i]:arr[i];
            res = Math.max(res,temp);
        }
        return res;
    }
}
