package com.lgy.leetcode;

import com.lgy.company.leetcodecom.T;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class T128 {

    public int longestConsecutive(int[] nums) {

        if(nums.length == 0){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        Integer[] objects = set.toArray(new Integer[set.size()]);
        int[] arr = new int[objects.length];
        for (int i = 0; i < objects.length; i++) {
            arr[i] = objects[i];
        }
        // 对数组进行排序
        Arrays.sort(arr);
        //记录长度
        int len = 1;

        int left = 0;
        int right = 1;
        int i = 1;
        int temp = 1;
        while (right < arr.length){
            int res = arr[right]- arr[left];
            if (res == i){
                temp++;
                i++;
            }else {
                len = Math.max(len,temp);
                left = right;
                temp = 1;
                i=1;
            }
            right++;

        }
        return Math.max(len,temp);

    }

    public static void main(String[] args) {
        T128 t128 = new T128();
        int[] arr = new int[]{1,2,0,1};
        //int[] arr = new int[]{0,3,7,2,5,8,4,6,0,1};
        int i = t128.longestConsecutive(arr);
        System.out.println(i);
    }

}
