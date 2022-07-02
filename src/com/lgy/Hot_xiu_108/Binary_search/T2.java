package com.lgy.Hot_xiu_108.Binary_search;

/**
 * T2. 在转动过的有序数组中寻找目标值
 *
 https://www.nowcoder.com/practice/7cd13986c79d4d3a8d928d490db5d707?tpId=190&&tqId=35352&rp=1&ru=/a
 ctivity/oj&qru=/ta/job-code-high-rd/question-ranking
 * @author LGY
 * @create 2022-07-02 16:08
 */
public class T2 {

    /**
     *
     * @param A
     * @param target
     * @return
     */
    public int search (int[] A, int target) {
        // write code here
        int left = 0;
        int right = A.length-1;

        while(left <= right){
            int temp = (left + right)/2;
            if(A[temp] == target){
                return temp;
            }
            // 左边有序
            if(A[temp] >= A[left]){
                if(target < A[temp] && A[left] <=target){
                    right = temp-1;
                }else{
                    left = temp+1;
                }
            }else{//右边有序
                if(A[temp] < target && target <= A[right]){
                    left++;
                }else{
                    right = temp-1;
                }
            }
        }
        return -1;
    }
}
