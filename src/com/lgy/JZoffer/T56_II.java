package com.lgy.JZoffer;

import java.util.*;

/**
 * @author LGY
 * @create 2022-05-25 15:52
 */
public class T56_II {
    public int singleNumber(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        Set<Integer> set = map.keySet();
        for (Integer a: set) {
            if (map.get(a) == 1){
                return a;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,4,3,3};
        T56_II t56_ii = new T56_II();
        t56_ii.singleNumber(arr);

    }
}
