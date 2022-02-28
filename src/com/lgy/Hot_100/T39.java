package com.lgy.Hot_100;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class T39 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int len = candidates.length;
        List<List<Integer>> listList = new ArrayList<>();

        if (len == 0){
            return listList;
        }

        // 创建了一个队列
        Deque<Integer> path = new ArrayDeque<>();
        dfs(candidates,0,len,target,path,listList);

        return listList;
    }


    /**
     *
     * @param candidates
     * @param begin
     * @param len
     * @param target
     * @param path
     * @param res
     */
    public void dfs(int[] candidates, int begin, int len, int target, Deque<Integer> path, List<List<Integer>> res){
        if (target<0){
            return;
        }
        if (target == 0){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = begin; i < len; i++) {
            path.addLast(candidates[i]);
            dfs(candidates,i,len,target-candidates[i],path,res);
            path.removeLast();

        }

    }

    public static void main(String[] args) {
        int[] candidates = new int[]{2,3,6,7};
        int target = 7;
        T39 t39 = new T39();
        List<List<Integer>> listList = t39.combinationSum(candidates,target);
        System.out.println(listList);
    }
}
