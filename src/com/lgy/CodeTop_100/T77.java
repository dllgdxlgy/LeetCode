package com.lgy.CodeTop_100;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LGY
 * @create 2022-07-24 16:50
 */
public class T77 {

    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {

        int[] arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = i+1;
        }
        dfs(arr,0,k);
        return res;
    }

    public void dfs(int[] arr, int index,int k){
        if(list.size() == k){
            res.add(new ArrayList(list));
            return;
        }

        for(int i = index; i < arr.length; i++){
            list.add(arr[i]);

            dfs(arr,i+1,k);

            list.remove(list.size()-1);
        }

    }
}
