package com.lgy.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author LGY
 * @create 2022-05-10 20:58
 */
public class T90 {

    List<List<Integer>> lists = new LinkedList<>();
    LinkedList<Integer> list = new LinkedList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        // 先排序
        Arrays.sort(nums);
        dfs(nums, 0);
        return lists;
    }

    public void dfs(int[] nums, int index) {

        lists.add(new LinkedList<>(list));
        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }
            list.add(nums[i]);
            dfs(nums,i+1);
            list.removeLast();
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,2};
        T90 t90 = new T90();
        List<List<Integer>> rr =t90.subsetsWithDup(arr);
        for (List<Integer> l: rr) {
            System.out.println(l);
        }

    }
}
