package com.lgy.leetcode;

public class T48 {

    public void rotate(int[][] matrix) {

        int n = matrix.length;

        // 反转矩阵
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n ; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int[] arr: matrix) {
            reverse(arr);
        }

    }
    void reverse(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
