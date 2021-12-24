package com.lgy.JZoffer;

/**
 * @author LGY
 * @create 2021-12-24 12:44
 */
public class Path_in_matrix_12 {

    public boolean exist(char[][] board,String word){


        // 1. 转换为char型数组
        char[] words = word.toCharArray();

        // 2. 对矩阵中对所有可能存在的进行遍历
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                // 不管怎么遍历，都是从 0 开始
                if (dfs(board,i,j,words,0)){
                    return true;
                }
            }
        }

        return false;
    }

    public boolean dfs(char[][] board, int i, int j, char[] words, int k) {
        if ( i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != words[k]){
            return false;
        }

        if (k == words.length-1){
            return true;
        }

        char tmp = board[i][j];

        board[i][j] = '/';

        boolean res = dfs(board, i+1, j , words, k+1) ||
                dfs(board, i-1 ,j,words,k+1)||
                dfs(board, i ,j-1,words,k+1)||
                dfs(board, i ,j+1,words,k+1);


        board[i][j] =tmp;
        return res;
    }


}
