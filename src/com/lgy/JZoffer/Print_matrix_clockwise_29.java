package com.lgy.JZoffer;

/**
 * @author LGY
 * @create 2022-01-02 18:55
 */
public class Print_matrix_clockwise_29 {

    /**
     * 顺时针打印矩阵
     *
     * @param matrix
     * @return
     */
    public int[] spiralOrder(int[][] matrix) {

        // 特殊判断
        if (matrix.length == 0) return new int[0];
        // 定义边界
        int l = 0, r = matrix[0].length - 1, u = 0, d = matrix.length - 1;
        // 定义数组的索引
        int x = 0;
        // 设定数组的长度
        int[] res = new int[(r + 1) * (d + 1)];
        //循环
        while (true) {
            for (int i = l; i <= r; i++) {
                //先赋值，再加一。
                res[x++] = matrix[u][i];
            }
            if (++u > d) {
                break;
            }
            for (int i = u; i <= d; i++) {
                res[x++] = matrix[i][r];
            }
            if (--r < l) {
                break;
            }
            for (int i = r; i >= l; i--) {
                res[x++] = matrix[d][i];
            }
            if (--d < u) {
                break;
            }
            for (int i = d; i >= u; i--) {
                res[x++] = matrix[i][l];
            }
            if (++l > r) {
                break;
            }

        }


        return res;
    }
}
