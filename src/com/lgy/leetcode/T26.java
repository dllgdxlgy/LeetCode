package com.lgy.leetcode;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author LGY
 * @create 2022-05-04 20:12
 */
public class T26 {

    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (length == 0){
            return 0;
        }

        int res = 0;

        int left = 0;
        int right = 0;
        boolean flag = true;

        while (right < length){
            if (nums[left] == nums[right] ){
                if (flag){
                    nums[res] = nums[left];
                    flag = false;
                    res++;
                }
                right++;
            }else {
                left = right;
                flag = true;
            }
        }
        nums = Arrays.copyOfRange(nums,0,res);
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0,0,1,1,1,2,2,2,2,3,4,5,5};
        T26 t26 = new T26();
        int i = t26.removeDuplicates(arr);
        System.out.println(i);
    }
}
