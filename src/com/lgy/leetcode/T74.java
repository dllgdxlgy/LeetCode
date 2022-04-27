package com.lgy.leetcode;

public class T74 {

    public boolean searchMatrix(int[][] matrix, int target) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean searchMatrix_1(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            if (find_val(matrix[i], target)){
                return true;
            }
        }
        return false;
    }

    boolean find_val(int[] arr,int number){
        int left = 0;
        int right = arr.length-1;
        while (left <= right){
            int mid = (left + right)/2;
            if (arr[mid] == number){
                return true;
            }else if (arr[mid] > number){
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return false;
    }

}
