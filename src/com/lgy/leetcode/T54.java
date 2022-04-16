package com.lgy.leetcode;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class T54 {

    public List<Integer> spiralOrder(int[][] matrix) {

        // 获取长度
        int m = matrix.length;
        int n = matrix[0].length;

        // 确定边界
        int upper_bound = 0;
        int lower_bound = m-1;
        int left_bound = 0;
        int right_bound = n-1;
        List<Integer> list = new ArrayList<>();

        while (list.size()< m *n){
            if(upper_bound <= lower_bound){
                for (int i = left_bound; i <= right_bound ; i++) {
                    list.add(matrix[upper_bound][i]);
                }
                upper_bound++;
            }
            if (left_bound <= right_bound){
                for (int i = upper_bound; i <= lower_bound; i++) {
                    list.add(matrix[i][right_bound]);
                }
                right_bound--;
            }
            if (upper_bound <= lower_bound){
                for (int i = right_bound; i >= left_bound ; i--) {
                    list.add(matrix[lower_bound][i]);
                }
                lower_bound--;
            }
            if (left_bound <= right_bound){
                for (int i = lower_bound; i >= upper_bound; i--) {
                    list.add(matrix[i][left_bound]);
                }
                left_bound++;
            }
        }
        return list;
    }
}
