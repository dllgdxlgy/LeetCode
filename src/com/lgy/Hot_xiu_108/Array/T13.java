package com.lgy.Hot_xiu_108.Array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 13. 加起来和为目标值的组合(二)
 *

 https://www.nowcoder.com//practice/75e6cd5b85a
 b41c6a7c43359a74e869a?tpId=190&&tqId=35351&rp=1&ru=/
 activity/oj&qru=/ta/job-code-high-rd/question-ranking
 * @author LGY
 * @create 2022-06-09 16:20
 */
public class T13 {

    ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> res = new ArrayList<Integer>();
    int sum = 0;

    public ArrayList<ArrayList<Integer>> combinationSum2(int[] num, int target) {

        // 特殊条件判断
        if (num == null || num.length == 0 || target < 0) {
            return list;
        }
        //数组排序
        Arrays.sort(num);

        // 三个参数 1. 数组、2. 索引、3.目标值
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

            //剪枝操作
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
