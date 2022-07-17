package com.lgy.CodeTop_100;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LGY
 * @create 2022-07-16 14:13
 */
public class T46 {

    List<List<Integer>> res = new ArrayList<>();
    ArrayList<Integer> list = new ArrayList<>();


    public List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length];
        dfs(nums,used);
        return res;
    }

    public void dfs(int[] arr,boolean[] used){
        if(list.size() == arr.length){
            res.add(new ArrayList(list));
            return;
        }

        for(int i = 0; i< arr.length;i++){
            if(used[i]){continue;}

            used[i] = true;
            list.add(arr[i]);

            dfs(arr,used);

            used[i] = false;
            list.remove(list.size()-1);
        }

    }
}
