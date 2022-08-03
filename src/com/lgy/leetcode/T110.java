package com.lgy.leetcode;

import sun.reflect.generics.tree.Tree;

/**
 * @author LGY
 * @create 2022-05-12 18:43
 */
public class T110 {


    /**
     * 平衡二叉树
     */
    boolean isbalan = true;

    public boolean isBalanced(TreeNode root) {

        dfs(root);
        return isbalan;

    }
    public int dfs(TreeNode treeNode) {

        if (treeNode == null) {
            return 0;
        }
        int left = dfs(treeNode.left);
        int right = dfs(treeNode.right);
        if (Math.abs(right - left) > 1) {
            isbalan = false;
        }

        return 1 + Math.max(left, right);
    }
}
