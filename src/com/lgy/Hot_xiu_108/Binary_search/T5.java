package com.lgy.Hot_xiu_108.Binary_search;

/**
 * @author LGY
 * @create 2022-07-02 17:22
 */
public class T5 {

    /**
     * 自己做的
     * @param mat
     * @param n
     * @param m
     * @param x
     * @return
     */
    public int[] findElement(int[][] mat, int n, int m, int x) {
        // write code here

        for(int i = m-1;i >= 0;i--){
            for(int j = 0; j<n;j++ ){
                if(mat[j][i] == x){
                    return new int[]{j,i};
                }else if (mat[j][i] < x){
                    continue;
                }else{
                    break;
                }
            }
        }
        return null;
    }
}
