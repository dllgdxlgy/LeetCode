package com.lgy.leetcode;

import java.util.*;

public class T46 {
    // 创建返回的结果
//    List<List<Integer>> res = new LinkedList<>();
//
//    public List<List<Integer>> permute(int[] nums) {
//        // 记录路径
//        LinkedList<Integer> track = new LinkedList<>();
//        // 已经使用的标记为 true，避免重复使用。初始化全为false
//        boolean[] used = new boolean[nums.length];
//        backtrack(nums,track,used);
//        return res;
//    }
//
//    public void backtrack(int[] nums, LinkedList<Integer> track, boolean[] used) {
//
//        if (track.size() == nums.length){
//            res.add(new LinkedList<>(track));
//            return;
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if (used[i]){
//                continue;
//            }
//            track.add(nums[i]);
//            used[i] = true;
//            backtrack(nums,track,used);
//            track.removeLast();
//            used[i] = false;
//        }
//
//    }

//    public static void main(String[] args) {
//        T46 t46 = new T46();
//        int[] num = new int[]{1,2,3};
//        t46.permute(num);
//        System.out.println(1);
//    }


    // 创建链表
    List<List<Integer>> lists = new LinkedList<>();

    public List<List<Integer>> permute(int[] nums) {

        LinkedList<Integer> list = new LinkedList<>();
        boolean[] used = new boolean[nums.length];
        dfs(nums,list,used);

        return lists;
    }

    /**
     * 树的深度遍历
     * @param nums
     * @param list
     * @param used
     */
    public void dfs (int[] nums, LinkedList<Integer> list, boolean[] used){

        if (list.size() == nums.length){
            lists.add(new LinkedList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]){
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
        T46 t46 = new T46();
        int[] num = new int[]{1,2,3};
        t46.permute(num);
        System.out.println(1);
    }


}
