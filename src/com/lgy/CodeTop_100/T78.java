package com.lgy.CodeTop_100;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LGY
 * @create 2022-07-24 16:19
 */
public class T78 {

    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {

        dfs(nums,0);
        return res;
    }

    public void dfs(int[] arr, int index){

        res.add(new ArrayList(list));

        for(int i = index;i < arr.length; i++){

            list.add(arr[i]);

            dfs(arr,i+1);

            list.remove(list.size()-1);
        }
    }
}
