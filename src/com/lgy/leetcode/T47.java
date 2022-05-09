package com.lgy.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author LGY
 * @create 2022-05-09 15:45
 */
public class T47 {

    List<List<Integer>> lists = new LinkedList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {

        // 先排序
        Arrays.sort(nums);

        LinkedList<Integer> list = new LinkedList<>();
        boolean[] used = new boolean[nums.length];
        dfs(nums,list,used);

        return lists;
    }

    private void dfs(int[] nums,LinkedList<Integer> list,boolean[] used) {

        if (nums.length == list.size()){
            lists.add(new LinkedList<>(list));
            return;
        }


        for (int i = 0; i < nums.length; i++) {
            if (used[i]){
                continue;
            }
            if (i > 0 && nums[i] == nums[i-1] && !used[i-1]){
                continue;
            }

            list.add(nums[i]);
            used[i] = true;
            dfs(nums,list,used);
            list.removeLast();
            used[i] = false;
        }
    }
    public static void main(String[] args) {
        T47 t47 = new T47();
        int[] num = new int[]{1,1,2};
        t47.permuteUnique(num);
        System.out.println(1);
    }
}
