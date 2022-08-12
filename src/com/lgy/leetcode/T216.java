package com.lgy.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LGY
 * @create 2022-08-12 10:40
 */
public class T216 {

    List<List<Integer>> res = new ArrayList<>();

    List<Integer> list = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {

        backtracking(k,n,1);

        return res;
    }

    public void backtracking(int k,int n,int index){


        if(list.size() == k){
            int sum = 0;
            for(int i = 0;i<k;i++){
                sum += list.get(i);
            }
            if(sum == n){
                res.add(new ArrayList<>(list));
            }
            return;
        }
        for(int i = index; i <= 9 ;i++){

            list.add(i);
            backtracking(k,n,i+1);
            list.remove(list.size()-1);
        }
    }
}
