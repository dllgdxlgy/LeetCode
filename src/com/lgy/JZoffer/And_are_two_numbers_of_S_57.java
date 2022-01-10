package com.lgy.JZoffer;

/**
 * 和为s 的两个数字
 *
 * @author LGY
 * @create 2022-01-10 17:13
 */
public class And_are_two_numbers_of_S_57 {

    /**
     * 超时
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        int s = 0;
        while (nums[s] <= target && s < nums.length-1) {
            s++;
        }
        for (int i = 0; i <= s - 1; i++) {
            for (int j = i+1; j <= s; j++) {
                if (nums[i]+nums[j] == target){
                    arr[0] = nums[i];
                    arr[1] = nums[j];
                }
            }
        }

        return arr;
    }


    public int[] twoSum_1(int[] nums, int target) {

        int i = 0;
        int j = nums.length-1;
        int[] arr = new int[2];
        while (i < j){
            int sum = nums[i]+nums[j];
            if (sum < target){
                i++;
            } else if  (sum > target){
                j--;
            }else {
                return new int[]{nums[i],nums[j]};
            }
        }

        return new int[0];
    }
}
