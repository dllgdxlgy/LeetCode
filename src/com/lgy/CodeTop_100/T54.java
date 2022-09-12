package com.lgy.CodeTop_100;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LGY
 * @create 2022-07-17 16:05
 */
public class T54 {

    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0;
        int top = 0;

        int right = matrix[0].length-1;
        int bottom = matrix.length-1;
        ArrayList<Integer> list = new ArrayList<>();

        while(true){

            if(left > right){
                return list;
            }
            for(int i = left; i <= right;i++){
                list.add(matrix[top][i]);
            }
            top++;

            if(top > bottom){
                return list;
            }
            for(int i = top;i<=bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;

            if(left>right){
                return list;
            }
            for(int i = right; i >=left ;i--){
                list.add(matrix[bottom][i]);
            }
            bottom--;
            if(top>bottom){
                return list;
            }
            for(int i = bottom;i>=top;i--){
                list.add(matrix[i][left]);
            }
            left++;

        }
    }

    /**
     *
     * 二刷
     *
     * @param matrix
     * @return
     */
    public List<Integer> spiralOrder_2(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int left = 0;
        int right = matrix[0].length-1;
        int top = 0;
        int bottom = matrix.length-1;

        while(left <= right && top <= bottom){
            if(top <= bottom){
                for(int i = left; i <= right; i++){
                    res.add(matrix[top][i]);
                }
                top++;
            }

            if(left <= right){
                for(int i = top;i <= bottom; i++){
                    res.add(matrix[i][right]);
                }
                right--;
            }
            if(top<=bottom){
                for(int i = right;i>=left;i--){
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left <= right){
                for(int i = bottom;i>=top;i--){
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }
        return res;
    }
}
