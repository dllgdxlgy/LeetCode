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
}
