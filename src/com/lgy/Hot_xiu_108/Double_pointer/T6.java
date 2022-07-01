package com.lgy.Hot_xiu_108.Double_pointer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * T6. 三数之和


 * @author LGY
 * @create 2022-07-01 18:21
 */
public class T6 {

    /**
     * 两数之和
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];

        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;

        while (left < right){
            int temp = nums[left] + nums[right];

            if (temp > target){
                right--;
            }else if(temp < target ){
                left++;
            }else {
                res[0] = left;
                res[1] = right;
                return res;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,2,4};
        T6 t6 = new T6();
        int[] ints = t6.twoSum(arr, 6);

    }

    public ArrayList<ArrayList<Integer>> threeSum(int[] nums) {
        ArrayList<ArrayList<Integer>> listList = new ArrayList<>();
        if (nums.length<3){
            return listList;
        }
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i-1]){
                int right = nums.length-1;
                int target = -nums[i];
                for (int j = i+1; j < nums.length; j++) {
                    if (j == i+1 || nums[j] != nums[j-1]){
                        while (j < right && nums[j] + nums[right]>target){
                            --right;
                        }
                        if (j == right){
                            break;
                        }
                        if (nums[j] + nums[right] == target){
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[right]);
                            listList.add(new ArrayList<>(list));
                            list.clear();
                        }
                    }
                }
            }
        }

        return listList;
    }

}
