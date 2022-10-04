package com.lgy.leetcode;

/**
 * @author LGY
 * @create 2022-03-31 18:59
 */
public class Finds_the_first_and_last_positions_of_an_element_in_a_sorted_array_34 {

    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1,-1};
        if (nums == null){
            return res;
        }

        boolean flag = true;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] == target && flag ==true){
                res[0] = i;
                res[1] = i;
                flag = false;
            }
            if(res[0] != -1 && nums[i] == target){
                res[1] = i;
            }
            if (res[0] != -1 && nums[i] > target){
                res[1] = i-1;
                break;
            }
        }

        return res;

    }

    public int[] searchRange_1(int[] nums, int target) {
        int[] res = new int[]{-1,-1};
        if (nums == null){
            return res;
        }

        boolean flag = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target && flag == true){
                res[0] = i;
                res[1] = i;
                flag = false;

            }
            if (nums[i] == target){
                res[1] = i;
            }
            if(nums[i]> target){
                break;
            }
        }

        return res;
    }


    /**
     * 二刷
     * @param nums
     * @param target
     * @return
     */
    public int[] searchRange_2(int[] nums, int target) {

        int index = -1;

        int left = 0;
        int right = nums.length-1;

        while(left <= right){
            int temp = left + (right - left)/2;
            if(nums[temp] == target){
                index = temp;
                break;
            }else if(nums[temp] < target){
                left = temp+1;
            }else{
                right = temp-1;
            }
        }

        if(index == -1){
            return new int[]{-1,-1};
        }
        left = index;
        right = index;

        while(left >= 0 && nums[left] == target){
            left--;
        }
        left++;
        while(right < nums.length && nums[right] == target){
            right++;
        }
        right--;
        return new int[]{left,right};
    }
}
