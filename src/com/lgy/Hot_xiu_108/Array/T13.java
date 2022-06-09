package com.lgy.Hot_xiu_108.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author LGY
 * @create 2022-06-09 16:20
 */
public class T13 {

    ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> res = new ArrayList<Integer>();
    int sum = 0;

    public ArrayList<ArrayList<Integer>> combinationSum2(int[] num, int target) {

        if (num == null || num.length == 0 || target < 0) {
            return list;
        }
        Arrays.sort(num);

        dfs(num, 0, target);

        return list;
    }

    public void dfs(int[] num, int index, int target) {
        if (target < sum) {
            return;
        }
        if (target == sum) {
            list.add(new ArrayList<>(res));
            return;
        }

        for (int i = index; i < num.length; i++) {
            if (i > index && num[i] == num[i - 1]) {
                continue;
            }
            res.add(num[i]);
            sum += num[i];
            dfs(num, i + 1, target);
            res.remove(res.size() - 1);
            sum -= num[i];
        }
    }


}
