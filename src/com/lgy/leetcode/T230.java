package com.lgy.leetcode;

/**
 * @author LGY
 * @create 2022-03-31 20:38
 */
public class T230 {
    private int res;
    private int rank;
    public int kthSmallest(TreeNode root, int k) {

        bianli(root,k);
        return res;

    }
    public void bianli (TreeNode root, int k){

        if (root == null) {
            return;
        }

        bianli(root.left,k);

        rank++;

        if (k == rank){
            res = root.val;
            return;
        }

        bianli(root.right,k);

    }

}
