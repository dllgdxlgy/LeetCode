package com.lgy.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author LGY
 * @create 2022-05-11 09:57
 */
public class T77 {

    List<List<Integer>> lists = new LinkedList<>();

    LinkedList<Integer> list = new LinkedList<>();
    public List<List<Integer>> combine(int n, int k) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        dfs(arr,k,0);
        return lists;
    }

    private void dfs(int[] arr, int k,int index) {
        if (list.size() == k){
            lists.add(new LinkedList<>(list));
        }

        for (int i = index; i < arr.length; i++) {
            list.add(arr[i]);
            dfs(arr,k,i+1);
            list.removeLast();
        }
    }

}
