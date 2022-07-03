package com.lgy.Hot_xiu_108.Binary_search;

/**
 * T8. 矩阵查找
 https://www.nowcoder.com/practice/5145394607ea4c5f8b25755718bfddba?tpId=190&&tqI
 d=36272&rp=1&ru=/activity/oj&qru=/ta/job-code-high-rd/question-ranking
 * @author LGY
 * @create 2022-07-02 17:50
 */
public class T8 {


    /**
     *
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrix (int[][] matrix, int target) {
        // write code here
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0; i < n; i++){
            for(int j = m-1; j >= 0;j--){
                if(matrix[i][j] == target){
                    return true;
                }else if (matrix[i][j] >= target){
                    continue;
                }else{
                    break;
                }
            }
        }
        return false;
    }
}
