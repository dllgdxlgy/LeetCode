package com.lgy.CodeTop_100;

import java.util.HashMap;

/**
 * @author LGY
 * @create 2022-07-15 14:31
 */
public class T1 {

    /**
     * HashSet
     * HashMap
     * map.containsKey() 这些都需要进行记忆。
     *
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int temp = target -nums[i];
            if(map.containsKey(temp)){
                return new int[]{map.get(temp),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
