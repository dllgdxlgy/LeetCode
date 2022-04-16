package com.lgy.leetcode;

public class T59 {
    public int[][] generateMatrix(int n) {

        // 创建数组
        int[][] res = new int[n][n];

        int upper = 0;
        int right = n-1;
        int low = n-1;
        int left = 0;
        int num = 1;
        while (num <= n*n){

            if (upper <= low){
                for (int i = upper; i <=right ; i++) {
                    res[upper][i] = num++;
                }
                upper++;
            }
            if (right >=left){
                for (int i = upper; i <= low; i++) {
                    res[i][right] = num++;
                }
                right--;
            }
            if(low >= upper){
                for (int i = right; i >= left ; i--) {
                    res[low][i] = num++;
                }
                low--;
            }
            if (left <= right){
                for (int i = low; i >=upper ; i--) {
                    res[i][left] = num++;
                }
                left++;
            }
        }

        return res;
    }

}
