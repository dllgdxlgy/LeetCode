package com.lgy.leetcode;

/**
 * 两数之和II————输入有序数组
 *
 * @author LGY
 * @create 2022-02-12 21:07
 */
public class Sum_of_two_numbers_167 {

    public int[] twoSum(int[] numbers, int target) {

        int left = 1;
        int right = numbers.length-1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum < target) {
                left++;
            }else if (sum>target){
                right--;
            }else {
                return new int[]{left+1,right+1};
            }
        }
        return null;
    }

}
