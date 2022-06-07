package com.lgy.Hot_xiu_108.Array;

/**
 *
 * 5. 在转动过的有序数组中寻找目标值

 https://www.nowcoder.com//practice/7
 cd13986c79d4d3a8d928d490db5d707?tpId=190&&tqId
 =35352&rp=1&ru=/activity/oj&qru=/ta/job-code-high-rd/question-ranking
 * @author LGY
 * @create 2022-06-07 13:40
 */
public class T5 {


    /**
     * 暴力解，不符合题意
     * @param A
     * @param target
     * @return
     */
    public int search (int[] A, int target) {
        // write code here
        int len = A.length;
        for(int i =0;i<len;i++){
            if(A[i] == target){
                return i;
            }
        }
        return -1;
    }

    /**
     * 推荐的算法，注意命名：中间使用mid，别使用temp
     * @param A
     * @param target
     * @return
     */
    public int search_1 (int[] A, int target) {
        // write code here
        int left = 0;
        int right = A.length-1;

        while(left <= right){
            int mid = (right + left) / 2;
            //int temp = left + (right - left) / 2;
            if(A[mid] == target)
                return mid;
            if(A[mid] >= A[left]){ // 左边是有序的
                if( target < A[mid] && A[left] <= target){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }else {
                if(A[mid] < target && target<= A[right]){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
        }
        return -1;
    }
}
