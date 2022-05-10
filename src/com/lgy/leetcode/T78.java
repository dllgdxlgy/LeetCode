package com.lgy.leetcode;

import java.util.*;

public class T78 {
//    List<List<Integer>> res = new LinkedList<>();
//
//    LinkedList<Integer> list = new LinkedList<>();
//    public List<List<Integer>> subsets(int[] nums) {
//        backtrace(nums,0);
//        return res;
//    }
//
//    public void backtrace(int[] nums, int start) {
//        res.add(new LinkedList<>(list));
//        for (int j = start; j < nums.length; j++) {
//            list.add(nums[j]);
//
//            backtrace(nums,j+1);
//
//            list.removeLast();
//        }
//    }

    /**
     * []
     * [1]
     * [1, 2]
     * [1, 2, 3]
     * [1, 3]
     * [2]
     * [2, 3]
     * [3]
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        T78 t78 = new T78();
        List<List<Integer>> rr =t78.subsets(arr);
        for (List<Integer> l: rr) {
            System.out.println(l);
        }

    }

    List<List<Integer>> lists = new LinkedList<>();
    LinkedList<Integer> list = new LinkedList<>();
    public List<List<Integer>> subsets(int[] nums) {


        dfs(nums,0);
        return lists;

    }

    public void dfs(int[] nums,int index){
        lists.add(new LinkedList<>(list));
        for (int i = index; i < nums.length; i++) {

            list.add(nums[i]);
            dfs(nums,i+1);
            list.removeLast();

        }

    }
}
