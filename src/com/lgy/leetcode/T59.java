package com.lgy.leetcode;

public class T59 {


    /**
     * 三刷
     * @param n
     * @return
     */
    public int[][] generateMatrix_3(int n) {

        int[][] res = new int[n][n];

        int left = 0;
        int top = 0;
        int right = n-1;
        int bottom = n-1;
        int num = 1;

        while(true){
            if(left <= right){
                for(int i = left;i <= right;i++){
                    res[top][i] = num;
                    num++;
                }
                top++;
                if(top > bottom){
                    break;
                }
            }

            if(top <= bottom){
                for(int i = top; i <= bottom; i++){
                    res[i][right] = num;
                    num++;
                }
                right--;
                if(right<left){
                    break;
                }
            }
            if(left <= right){
                for(int i = right;i >= left;i--){
                    res[bottom][i] = num;
                    num++;
                }
                bottom--;;
                if(top > bottom){
                    break;
                }
            }

            if(top <= bottom){
                for(int i = bottom; i >= top; i--){
                    res[i][left] = num;
                    num++;
                }
                left++;

                if(right<left){
                    break;
                }
            }

        }
        return res;

    }

    /**
     * 二刷
     * @param n
     * @return
     */
    public int[][] generateMatrix_2(int n) {

        int[][] res = new int[n][n];

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        int num = 1;
        while (num <= n * n) {
            if (top <= bottom) {
                for (int i = left; i <= right; i++) {
                    res[top][i] = num++;
                }
                top++;
            }
            if (left <= right) {
                for (int i = top; i <= bottom; i++) {
                    res[i][right] = num++;
                }
                right--;
            }
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    res[bottom][i] = num++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    res[i][left] = num++;
                }
                left++;
            }

        }
        return res;

    }

    public int[][] generateMatrix(int n) {

        // 创建数组
        int[][] res = new int[n][n];

        int upper = 0;
        int right = n - 1;
        int low = n - 1;
        int left = 0;
        int num = 1;
        while (num <= n * n) {

            if (upper <= low) {
                for (int i = left; i <= right; i++) {
                    res[upper][i] = num++;
                }
                upper++;
            }
            if (right >= left) {
                for (int i = upper; i <= low; i++) {
                    res[i][right] = num++;
                }
                right--;
            }
            if (low >= upper) {
                for (int i = right; i >= left; i--) {
                    res[low][i] = num++;
                }
                low--;
            }
            if (left <= right) {
                for (int i = low; i >= upper; i--) {
                    res[i][left] = num++;
                }
                left++;
            }
        }

        return res;
    }
}
