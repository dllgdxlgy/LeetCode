package com.lgy.leetcode;

/**
 * @author LGY
 * @create 2022-08-07 11:20
 */
public class T700 {

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }
        if (root.val > val)
            return searchBST(root.left, val);
        if (root.val < val) {
            return searchBST(root.right, val);
        }
        return null;
    }
}
