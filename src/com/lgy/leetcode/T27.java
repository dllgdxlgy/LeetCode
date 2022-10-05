package com.lgy.leetcode;

/**
 * @author LGY
 * @create 2022-05-04 20:51
 */
public class T27 {

    /**
     * 二刷
     * @param nums
     * @param val
     * @return
     */
    public int removeElement_1(int[] nums, int val) {

        int slow = 0;
        int fast = 0;

        while(fast < nums.length){
            if(nums[fast] != val){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        if (length == 0){
            return 0;
        }
        int res = 0;
        int right = 0;

        while (right < length){
            if (nums[right] == val){
            }else {
                nums[res] = nums[right];
                res++;
            }
            right++;
        }
        return res;
    }
}
