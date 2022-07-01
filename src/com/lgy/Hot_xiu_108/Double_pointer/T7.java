package com.lgy.Hot_xiu_108.Double_pointer;

/**
 * T7.  接雨水问题
 https://www.nowcoder.com/practice/31c1aed01b394f0b8b7734de0324e00f?tpId=190&&tqI
 d=36005&rp=1&ru=/activity/oj&qru=/ta/job-code-high-rd/question-ranking
 * @author LGY
 * @create 2022-07-01 18:20
 */
public class T7 {

    public long maxWater (int[] arr) {
        // write code here
        if(arr.length == 0){
            return 0;
        }
        int left = 0;
        int right = arr.length - 1;

        int maxl = 0;
        int maxr = 0;
        long res = 0;
        while(left < right){
            maxl = Math.max(maxl,arr[left]);
            maxr = Math.max(maxr,arr[right]);
            if(maxr > maxl){
                res += maxl - arr[left];
                left++;
            }else{
                res += maxr - arr[right];
                right--;
            }
        }
        return res;
    }
}
