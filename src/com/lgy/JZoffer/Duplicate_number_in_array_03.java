package com.lgy.JZoffer;


import com.lgy.company.leetcodecom.T;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author LGY
 * @create 2022-01-02 18:28
 */
public class Duplicate_number_in_array_03 {

//    public int findRepeatNumber1(int[] nums) {
//
//        Set<Integer> set = new HashSet<>();
//        for (int num :nums){
//            if (set.contains(num))return num;
//            set.add(num);
//        }
//        return -1;
//    }
//
//    public int findRepeatNumber2(int[] nums) {
//
//        int index = 0;
//        while (index < nums.length){
//
//            // 1. 先判断索引和值是不是相等，相等就可以继续加了
//            if (nums[index] == index){
//                index++;
//                continue;
//            }
//            // 2. 如果两个值相等，那就是重复值，可以返回了。
//            if (nums[nums[index]] == nums[index]){
//                return nums[index];
//            }
//            // 3. 要不就交换
//            int tmp = nums[index];
//            nums[index] = nums[tmp];
//            nums[tmp] = tmp;
//        }
//        return -1;
//    }

    public int findRepeatNumber(int[] nums) {

        Arrays.sort(nums);
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                return nums[i];
            }
            map.put(nums[i],1);
        }
        return 0;
    }
}
