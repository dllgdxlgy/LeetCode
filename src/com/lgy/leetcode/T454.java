package com.lgy.leetcode;

import java.util.HashMap;

/**
 * @author LGY
 * @create 2022-10-07 15:56
 */
public class T454 {


    /**
     * T454、四数相加 II
     * @param nums1
     * @param nums2
     * @param nums3
     * @param nums4
     * @return
     */
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i : nums1){
            for(int j : nums2){
                int temp = i+j;
                map.put(temp,map.getOrDefault(temp,0)+1);
            }
        }

        for(int i :nums3){
            for(int j:nums4){
                int temp = 0-i-j;
                if(map.containsKey(temp)){
                    count += map.get(temp);
                }
            }
        }
        return count;
    }
}
