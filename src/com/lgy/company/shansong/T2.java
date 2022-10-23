package com.lgy.company.shansong;

import java.util.HashMap;

/**
 * @author LGY
 * @create 2022-10-23 20:01
 */
public class T2 {
    public int singleNumber (int[] nums) {
        // write code here
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for (int a: map.keySet()) {
            if(map.get(a) == 1){
                return  a;
            }
        }
        return  0;
    }
}
