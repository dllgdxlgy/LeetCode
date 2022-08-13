package com.lgy.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * T491 递增子序列
 * @author LGY
 * @create 2022-08-13 16:30
 */
public class T491 {

    List<List<Integer>> res = new ArrayList<>();

    List<Integer> list = new ArrayList<>();

    public List<List<Integer>> findSubsequences(int[] nums) {

        backTracking(nums, 0);
        return res;
    }

    public void backTracking(int[] arr, int index) {

        if (list.size() >= 2) {
            res.add(new ArrayList<>(list));
        }

        //应用于 每一层
        Set<Integer> set = new HashSet<>();

        for (int i = index; i < arr.length; i++) {
            if (!list.isEmpty() && list.get(list.size() - 1) > arr[i] || set.contains(arr[i])) {
                continue;
            }
            list.add(arr[i]);
            set.add(arr[i]);

            backTracking(arr, i + 1);

            list.remove(list.size() - 1);
        }
    }
}
