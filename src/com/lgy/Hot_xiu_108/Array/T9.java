package com.lgy.Hot_xiu_108.Array;

/**
 * 9. 在两个长度相等的排序数组中找到上中位数
 https://www.nowcoder.com//practice/6
 fbe70f3a51d44fa9395cfc49694404f?tpId=190&
 tqId=35216&rp=1&ru=/activity/oj&qru=/ta/job-
 code-high-rd/question-ranking
 * @author LGY
 * @create 2022-06-07 16:10
 */
public class T9 {

    /**
     * 自己做的
     * @param arr1
     * @param arr2
     * @return
     */
    public int findMedianinTwoSortedAray (int[] arr1, int[] arr2) {
        // write code here
        int len = arr1.length;

        int l_arr1 = 0;
        int r_arr1 = len-1;

        int l_arr2 = 0;
        int r_arr2 = len-1;

        int res = Math.min(arr1[0],arr2[0]);
        while(len > 0 && l_arr1 <= r_arr1 && l_arr2 <= r_arr2){
            if(arr1[l_arr1] <= arr2[l_arr2]){
                res = arr1[l_arr1];
                l_arr1++;
            }else{
                res = arr2[l_arr2];
                l_arr2++;
            }
            len--;
        }
        return res;
    }
}
