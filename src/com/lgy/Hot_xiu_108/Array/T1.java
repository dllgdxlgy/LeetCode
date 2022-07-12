package com.lgy.Hot_xiu_108.Array;

import java.util.ArrayList;

/**
 * 1. 螺旋矩阵
 * <p>
 * https://www.nowcoder.com//practice
 * /7edf70f2d29c4b599693dc3aaeea1d31?tpId=19
 * 0&&tqId=35349&rp=1&ru=/activity/oj&qru=/ta/job-
 * code-high-rd/question-ranking
 *
 * @author LGY
 * @create 2022-06-06 19:51
 */
public class T1 {


    public ArrayList<Integer> spiralOrder(int[][] matrix) {

        ArrayList<Integer> res = new ArrayList<>();
        if (matrix.length == 0) {
            return res;
        }
        // 左边，是列
        int l = 0;
        // 右边，是列
        int r = matrix[0].length - 1;
        // 顶部，行
        int t = 0;
        // 底部，是行
        int b = matrix.length - 1;

        while (l <= r && t <= b) {
            for (int i = l; i <= r; i++) {
                res.add(matrix[t][i]);
            }
            t++;

            for (int i = t; i <= b; i++) {
                res.add(matrix[i][r]);
            }
            r--;

            if (l <= r) {
                for (int i = r; i >= l; i--) {
                    res.add(matrix[b][i]);
                }
            }
            b--;
            if (t <= b) {
                for (int i = b; i >= t; i--) {
                    res.add(matrix[i][l]);
                }
            }
            l++;
        }
        return res;

    }

    /**
     * 推荐的方法
     *
     * @param matrix
     * @return
     */
    public ArrayList<Integer> spiralOrder_1(int[][] matrix) {

        ArrayList<Integer> res = new ArrayList<>();
        if (matrix.length == 0) {
            return res;
        }
        // 左边，是列
        int l = 0; //colBegin
        // 右边，是列
        int r = matrix[0].length - 1; //colEnd
        // 顶部，行
        int t = 0; // rowBegin
        // 底部，是行
        int b = matrix.length - 1; //rowEnd

        while (true) {
            if (l > r)
                return res;
            for (int i = l; i <= r; i++) {
                res.add(matrix[t][i]);
            }
            t++;

            if (t > b)
                return res;
            for (int i = t; i <= b; i++) {
                res.add(matrix[i][r]);
            }
            r--;

            if (l > r)
                return res;
            for (int i = r; i >= l; i--) {
                res.add(matrix[b][i]);
            }
            b--;
            if (t > b)
                return res;
            for (int i = b; i >= t; i--) {
                res.add(matrix[i][l]);
            }
            l++;
        }
    }
}