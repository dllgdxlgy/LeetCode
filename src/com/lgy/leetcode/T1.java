package com.lgy.leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 两数之和
 */
public class T1 {


    /**
     * 推荐的做法
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum_2(int[] nums, int target) {

        int[] res = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)){
                res[0] = map.get(temp);
                res[1] = i;
                return res;
            }
            map.put(nums[i],i);
        }
        return res;
    }
    // 不符合题意
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        while (left < right){
            int sum = 0;
            sum = nums[left] +nums[right];
            if (sum == target){
                arr[0] = left;
                arr[1] = right;
                break;
            }else if (sum<target){
                left++;
            }else {
                right--;
            }
        }
        return arr;
    }

    // 暴力解法
    public int[] twoSum_1(int[] nums, int target) {
        int sum = 0;
        int[] res = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if (sum == target){
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        }
        return res;
    }

    /**
     * 第二遍——两数之和
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum_3(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int len = nums.length;

        for(int i = 0;i< len;i++){
            int temp = target-nums[i];
            if(map.containsKey(temp)){
                return new int[]{map.get(temp),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }


}
