package com.lgy.Hot_xiu_108.Array;

import java.util.ArrayList;

/**
 * 15. 集合的所有子集
 *
 * https://www.nowcoder.com//pract
 * ice/c333d551eb6243e0b4d92e37a06fbfc9?tpId=190&
 * &tqId=35344&rp=1&ru=/activity/oj&qru=/ta/job-code-hig
 * h-rd/question-ranking
 *
 * @author LGY
 * @create 2022-06-10 11:37
 */
public class T15 {

    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    ArrayList<Integer> res = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> subsets(int[] S) {

        dfs(S,0);
        return list;
    }

    public void dfs(int[] arr,int index){
        list.add(new ArrayList<>(res));

        for(int i = index;i<arr.length;i++){
            res.add(arr[i]);

            dfs(arr,i+1);
            res.remove(res.size()-1);
        }
    }
}
