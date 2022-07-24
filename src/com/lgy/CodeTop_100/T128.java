package com.lgy.CodeTop_100;

import java.util.HashSet;

/**
 * @author LGY
 * @create 2022-07-24 18:36
 */
public class T128 {

    /**
     * 只有这一种解法，时间复杂度为 O(n)
     * @param arr
     * @return
     */
    public int longestConsecutive (int[] arr) {

        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int res = 0;
        for (int num: set) {
            if(!set.contains(num-1)){

                int currentNum = num;
                int currentStraek = 1;
                while (set.contains(currentNum+1)){
                    currentNum++;
                    currentStraek++;
                }
                res = Math.max(res,currentStraek);
            }
        }
        return res;
    }
}
