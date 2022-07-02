package com.lgy.Hot_xiu_108.Binary_search;

/**
 * T3. 求平方根
 https://www.nowcoder.com/practice/09fbfb16140b40499951f55113f2166c?tpId=190&&tqId=
 35187&rp=1&ru=/activity/oj&qru=/ta/job-code-high-rd/question-ranking
 * @author LGY
 * @create 2022-07-02 16:23
 */
public class T3 {

    public int sqrt (int x) {
        // write code here

        int left = 1;
        int right = x;
        while(left <= right){
            int mid = (left +right)/2;
            if(mid <= x/mid && (mid+1) > x/(mid+1)){
                return mid;
            }
            if(mid <= x/mid){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return 0;
    }
}
