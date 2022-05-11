package com.lgy.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author LGY
 * @create 2022-05-11 10:13
 */
public class T40 {

    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> list = new LinkedList<>();
    int sum = 0;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);
        dfs(candidates, target,0);

        return res;
    }

    public void dfs(int[] candidates,  int target,int index ){
        if (sum == target){
            res.add(new LinkedList<>(list));
        }
        if (sum>target){
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (i>index && candidates[i] == candidates[i-1]){
                continue;
            }
            sum += candidates[i];
            list.add(candidates[i]);

            dfs(candidates,target,i+1);

            sum-=candidates[i];
            list.removeLast();
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10,1,2,7,6,1,5};
        Arrays.sort(arr);

        T40 t40 = new T40();

        List<List<Integer>> lists = t40.combinationSum2(arr, 8);

        for (List<Integer> l: lists) {
            System.out.println(l);
        }
    }
}
