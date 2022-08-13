package com.lgy.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * T51、 n皇后
 * @author LGY
 * @create 2022-08-13 20:18
 */
public class T51 {

    List<List<String>> res = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] chessboard = new char[n][n];
        for(char[] c : chessboard){
            Arrays.fill(c,'.');
        }
        backTracking(n,0,chessboard);
        return res;
    }

    public void backTracking(int n,int row,char[][] chessboard){
        if(row == n){
            res.add(new ArrayList<>(Array2List(chessboard)));
        }

        for(int col = 0; col < n; col++){
            if(isValid(row,col,n,chessboard)){
                chessboard[row][col] = 'Q';
                backTracking(n,row+1,chessboard);
                chessboard[row][col] = '.';
            }
        }
    }

    public List Array2List(char[][] chessboard){
        List<String> res = new ArrayList<>();
        for(char[] c : chessboard){
            res.add(String.copyValueOf(c));
        }
        return res;
    }

    public boolean isValid (int row,int col,int n,char[][] chessboard){
        // 检查列
        for (int i=0; i<row; ++i) { // 相当于剪枝
            if (chessboard[i][col] == 'Q') {
                return false;
            }
        }

        // 检查45度对角线
        for (int i=row-1, j=col-1; i>=0 && j>=0; i--, j--) {
            if (chessboard[i][j] == 'Q') {
                return false;
            }
        }

        // 检查135度对角线
        for (int i=row-1, j=col+1; i>=0 && j<=n-1; i--, j++) {
            if (chessboard[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
}
