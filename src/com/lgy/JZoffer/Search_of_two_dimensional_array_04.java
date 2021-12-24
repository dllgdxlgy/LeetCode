package com.lgy.JZoffer;

/**
 * @author LGY
 * @create 2021-12-23 11:27
 */
public class Search_of_two_dimensional_array_04 {

    /**
     * 查找给定数字是不是在二维数组中出现过。
     *
     * @param matrix
     * @param target
     * @return
     */
    public boolean findNumberIn2DArray(int[][] matrix, int target) {

        if (matrix.length==0 || matrix==null||matrix[0].length==0){
            return false;
        }
        //行
        int row_number =matrix.length;
        int row=0;
        //列
        int column_number = matrix[0].length;
        int column=column_number-1;
       while (row<row_number && column>=0){
           if (matrix[row][column]==target){
               return true;

           }else if (matrix[row][column]<target){
               row++;
           }else {
               column--;
           }
       }
        return false;
    }

}
