package com.lgy.Hot_xiu_108.Array;

/**
 * 12. 顺时针旋转矩阵
 https://www.nowcoder.com//practice/2e953
 33fbdd4451395066957e24909cc?tpId=190&&tqId=3
 5208&rp=1&ru=/activity/oj&qru=/ta/job-code-high-rd/question-ranking
 * @author LGY
 * @create 2022-06-09 15:43
 */
public class T12 {

    /**
     * 核心思想，分为两步
     *
     * 1. 先按照正写对角线进行交换元素，
     * 2. 然后进行 行转换。
     * @param mat
     * @param n
     * @return
     */
    public int[][] rotateMatrix(int[][] mat, int n) {
        // write code here

        for(int i = 0; i < n; i++){
            for(int j = i;j < n; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for(int i = 0; i < n;i++){
            reverse(mat[i]);
        }

        return mat;
    }

    public void reverse(int[] arr){

        int right = arr.length-1;
        int left = 0;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right]=temp;
            left++;
            right--;
        }

    }


}
