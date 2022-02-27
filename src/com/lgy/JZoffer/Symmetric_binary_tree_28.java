package com.lgy.JZoffer;

import com.lgy.JZoffer.entity.TreeNode;

/**
 * @author LGY
 * @create 2022-01-01 20:36
 */
public class Symmetric_binary_tree_28 {

    public boolean isSymmetric(TreeNode root) {

        if (root == null)return true;


        return recur(root.left,root.right);
    }
    public boolean recur(TreeNode L,TreeNode R){

        if (L == null && R == null) return true;
        if (L == null || R == null || L.val != R.val) return false;
        return (recur(L.left,R.right) && recur(L.right,R.left));
    }
}
