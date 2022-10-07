package com.lgy.leetcode;

import java.util.HashSet;

/**
 * @author LGY
 * @create 2022-10-07 10:15
 */
public class T349 {

    /**
     * T349、两个数组的交集
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums1.length; i++){
            set.add(nums1[i]);
        }

        HashSet<Integer> set_1 = new HashSet<>();
        for(int n : nums2){
            if(set.contains(n)){
                set_1.add(n);
            }
        }
//        return set_1.stream().mapToInt(Integer::intValue).toArray();

        return set_1.stream().mapToInt(Integer::intValue).toArray();
    }
}
