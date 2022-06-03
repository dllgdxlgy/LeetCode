package com.lgy.JZoffer;

/**
 * 二叉搜索树的后序遍历序列
 *
 * @author LGY
 * @create 2022-01-08 21:36
 */
public class Post_order_traversal_sequence_of_a_binary_search_tree_33 {

    public boolean verifyPostorder(int[] postorder) {
        return recur(postorder, 0, postorder.length - 1);
    }

    boolean recur(int[] postorder, int i, int j) {

        if (i >= j) return true;
        int p = i;
        while (postorder[p] < postorder[j]) {
            p++;
        }
        int m = p;
        while (postorder[p] > postorder[j]) {
            p++;
        }
        return p == j && recur(postorder, i, m - 1) && recur(postorder, m , j - 1);
    }

    /**
     * 二遍
     * @param sequence
     * @return
     */

    public boolean verifyPostorder_1(int [] sequence) {


        int right = sequence.length-1;
        return houxu(sequence,0,right);

    }

    public boolean houxu(int[] sequence,int left,int right){
        if(left >= right){
            return true;
        }
        int root = sequence[right];

        int i = left;
        while(sequence[i]<root){
            i++;
        }
        int j = i;
        while(i<right){
            if(sequence[i]<root){
                return false;
            }
            i++;
        }
        return houxu(sequence,left,j-1)&& houxu(sequence,j,right-1);

    }
}
