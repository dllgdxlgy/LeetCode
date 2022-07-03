package com.lgy.Hot_xiu_108.Binary_search;

/**
 * T10 .数字在升序数组中出现的次数
 https://www.nowcoder.com/practice/70610bf967994b22bb1c26f9ae901fa2?tpId=19
 0&&tqId=35372&rp=1&ru=/activity/oj&qru=/ta/job-code-high-rd/question-ranking
 * @author LGY
 * @create 2022-07-02 18:46
 */
public class T10 {

    public int GetNumberOfK(int [] array , int k) {
        int left = 0;
        int right = array.length-1;
        int res = 0;
        int index = 0;
        while(left <= right){
            int temp = (left+right)/2;
            if(array[temp] == k){
                index = temp;
                res++;
                break;
            }
            if(array[temp] >= k){
                right = temp-1;
            }else{
                left = temp+1;
            }
        }
        left = index-1;
        right = index+1;
        while(left >= 0 && array[left] == k){
            res++;
            left--;
        }
        while(right < array.length && array[right] == k){
            res++;
            right++;
        }
        return res;
    }
}
