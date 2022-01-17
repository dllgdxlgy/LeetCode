package com.lgy.leetcode;

import java.util.List;

/**
 * 三角形的最小路径和
 *
 * @author LGY
 * @create 2022-01-17 11:35
 */
public class Triangle_minimum_path_sum_120 {

    /**
     * 法一：递归
     *  超出时间限制
     *
     * @param triangle
     * @return
     */
//    private static List<List<Integer>> lists = null;
//
//    public int minimumTotal(List<List<Integer>> triangle) {
//        this.lists = triangle;
//        int sum = traverse(0,0)+triangle.get(0).get(0);
//        return sum;
//
//    }
//
//    public static int traverse(int i, int j) {
//        int length = lists.size();
//        if (i >= length - 1) {
//            return 0;
//        }
//
//        int leftSum = traverse(i + 1, j) + lists.get(i + 1).get(j);
//        int rightSum = traverse(i + 1, j + 1) + lists.get(i + 1).get(j + 1);
//        return Math.max(leftSum, rightSum);
//    }


}
