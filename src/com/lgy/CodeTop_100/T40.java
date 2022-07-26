package com.lgy.CodeTop_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author LGY
 * @create 2022-07-24 22:07
 */
public class T40 {

    List<List<Integer>> res = new ArrayList<>();

    List<Integer> list = new ArrayList<>();
    int sum = 0;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);
        backtracking(candidates,0,target);
        return res;

    }
    public void backtracking(int[] arr, int index, int target){
        if(sum == target){
            res.add(new ArrayList(list));
            return;
        }
        if(sum > target){
            return;
        }

        for(int i = index; i<arr.length;i++){

            if(i>index && arr[i] == arr[i-1]){
                continue;
            }
            sum += arr[i];
            list.add(arr[i]);

            backtracking(arr,i+1,target);
            sum -= arr[i];
            list.remove(list.size()-1);
        }
    }
}
