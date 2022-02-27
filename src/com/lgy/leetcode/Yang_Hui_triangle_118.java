package com.lgy.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * 杨辉三角
 *
 * @author LGY
 * @create 2022-01-24 21:59
 */
public class Yang_Hui_triangle_118 {


    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> lists = new LinkedList<>();


        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new LinkedList<>();

            for (int j = 0; j <= i; j++) {

                if (j == 0 || i == j) {
                    list.add(1);

                } else {

                    list.add(lists.get(i - 1).get(j - 1) + lists.get(i - 1).get(j));
                }
            }
            lists.add(list);

        }

        return lists;

    }
}
