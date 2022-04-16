package com.lgy.leetcode;

import java.util.LinkedList;
import java.util.List;

public class T39 {
    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> list = new LinkedList<>();

    int tracknum = 0;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        traceback(candidates,0,target);
        return res;
    }

     void traceback(int[] candidates,int start,int target) {


        if (tracknum == target){
            res.add(new LinkedList<>(list));
            return;
        }
        if (tracknum > target){
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            tracknum += candidates[i];
            list.add(candidates[i]);

            traceback(candidates,i,target);

            tracknum -= candidates[i];
            list.removeLast();


        }
    }

}
