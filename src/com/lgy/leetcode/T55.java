package com.lgy.leetcode;

import com.lgy.company.BIanLiFeng.T5;
import com.lgy.company.leetcodecom.T;

import java.util.Arrays;

public class T55 {


    /**
     *
     * @param nums
     * @return
     */
    public boolean canJump(int[] nums) {
        int cover = 0;
        if(nums.length == 1){
            return true;
        }
        for(int i = 0 ;i <= cover; i++){
            cover = Math.max(cover,i+nums[i]);
            if(cover >= nums.length-1){
                return true;
            }
        }
        return false;
    }


    public boolean canJump_1(int[] nums) {
        int length = nums.length;
        boolean[] res = new boolean[length];

        Arrays.fill(res,false);
        if (nums[0]==0 && length>1){
            return false;
        }else if(nums[0]==0&&length==1){
            return true;
        }
        res[0]=true;
        for (int i = 0; i < length-1; i++) {
            int temp =  nums[i];
            if (temp==0 && res[i+1] == true){
                continue;
            }else if(temp==0){
                return res[length-1];
            }
            for (int j = i; j <= i+temp; j++) {
                if (j>=length){
                    return res[length-1];
                }
                if (res[j] == false){
                    res[j] =true;
                }
            }
        }
        return res[length-1];
    }

    public static void main(String[] args) {
        T55 t55 = new T55();
        //int[] arr = new int[]{3,2,1,0,4};
        int[] arr = new int[]{3,0,8,2,0,0,1};
        boolean b = t55.canJump(arr);
    }
}
