package com.lgy.leetcode;

import org.omg.PortableInterceptor.INACTIVE;

/**
 * @author LGY
 * @create 2022-05-05 20:13
 */
public class T63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int row = obstacleGrid.length;
        int width = obstacleGrid[0].length;
        // 创建一个新的数组
        int[][] arr = new int[row][width];

        boolean flag = true;
        for (int i = 0; i < row; i++) {
            if (obstacleGrid[i][0] == 0 && flag){
                arr[i][0] = 1;
            }else {
                flag = false;
                arr[i][0] = Integer.MIN_VALUE;

            }
        }
        flag = true;
        for (int i = 0; i < width; i++) {
            if (obstacleGrid[0][i] == 0 && flag){
                arr[0][i] = 1;
            }else {
                flag = false;
                arr[0][i] = Integer.MIN_VALUE;
            }
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < width; j++) {
                if (obstacleGrid[i][j] == 1){
                    arr[i][j] = Integer.MIN_VALUE;
                }
            }
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < width; j++) {


                if (arr[i][j] == 0 && arr[i][j-1] != Integer.MIN_VALUE && arr[i-1][j]!=Integer.MIN_VALUE){
                    arr[i][j] = arr[i][j-1]+arr[i-1][j];
                }else if (arr[i][j] == 0){
                    if (arr[i][j-1] == Integer.MIN_VALUE || arr[i-1][j] == Integer.MIN_VALUE){
                        arr[i][j] = Math.max(arr[i][j-1],arr[i-1][j]);
                    }
                }else{
                    arr[i][j] = Integer.MIN_VALUE;
                }
            }
        }
        if (arr[row-1][width-1] == Integer.MIN_VALUE){
            return 0;
        }
        return arr[row-1][width-1];
    }

    public static void main(String[] args) {
        T63 t63 = new T63();
        int[][] num = new int[][]{{0,0,0},{0,1,0},{0,0,0}};
        int i = t63.uniquePathsWithObstacles(num);
        System.out.println(i);
    }
}
