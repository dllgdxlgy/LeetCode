package com.lgy.CodeTop_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author LGY
 * @create 2022-07-24 22:07
 */
public class T39 {

    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    int sum = 0;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        Arrays.sort(candidates);

        baktracing(candidates,target,0);

        return res;
    }

    public void baktracing(int[] candidates,int target,int index){

        if(sum == target){
            res.add(new ArrayList<>(list));
            return;
        }
        if(sum > target){
            return;
        }
        for(int i = index ; i < candidates.length;i++){

            if(i > index && candidates[i] == candidates[i-1]){
                continue;
            }
            list.add(candidates[i]);
            sum+=candidates[i];
            baktracing(candidates,target,i);
            sum-= candidates[i];
            list.remove(list.size()-1);
        }
    }
}
