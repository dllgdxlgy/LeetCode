package com.lgy.Hot_xiu_108.Array;

/**
 * 18. 矩阵查找
 *
 https://www.nowcoder.com//practice/5145394607ea4c5f8
 b25755718bfddba?tpId=190&&tqId=36272&rp=1&ru=/activity/oj&
 qru=/ta/job-code-high-rd/question-ranking
 * @author LGY
 * @create 2022-06-10 16:01
 */
public class T18 {

    /**
     * 自己做的
     * 主要是从右上角 向 左下角 来
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrix (int[][] matrix, int target) {
        // write code here
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i = 0; i < n; i++){
            for(int j = m-1; j >= 0; j-- ){
                if(matrix[i][j] < target){
                    break;
                }
                if(matrix[i][j] == target){
                    return true;
                }

            }
        }
        return false;
    }
}
