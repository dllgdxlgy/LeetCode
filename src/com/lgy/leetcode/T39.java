package com.lgy.leetcode;

import java.util.LinkedList;
import java.util.List;

public class T39 {
//    List<List<Integer>> res = new LinkedList<>();
//    LinkedList<Integer> list = new LinkedList<>();
//
//    int tracknum = 0;
//
//    public List<List<Integer>> combinationSum(int[] candidates, int target) {
//
//        traceback(candidates,0,target);
//        return res;
//    }
//
//     void traceback(int[] candidates,int start,int target) {
//
//
//        if (tracknum == target){
//            res.add(new LinkedList<>(list));
//            return;
//        }
//        if (tracknum > target){
//            return;
//        }
//
//        for (int i = start; i < candidates.length; i++) {
//            tracknum += candidates[i];
//            list.add(candidates[i]);
//
//            traceback(candidates,i,target);
//
//            tracknum -= candidates[i];
//            list.removeLast();
//
//
//        }
//    }


    // 元素无重可复选
    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> list = new LinkedList<>();
    int sum = 0;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        dfs(candidates, 0, target);
        return res;
    }

    public void dfs(int[] candidates, int index, int target) {

        if (sum == target){
            res.add(new LinkedList<>(list));
        }
        if (sum > target){
            return;
        }

        for (int i = index; i < candidates.length; i++) {

            sum += candidates[i];
            list.add(candidates[i]);

            dfs(candidates,i,target);

            sum -= candidates[i];
            list.removeLast();
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,3,5};
        T39 t39 = new T39();
        List<List<Integer>> lists = t39.combinationSum(arr, 8);

        for (List<Integer> i:lists) {
            System.out.println(i);
        }
    }
}
