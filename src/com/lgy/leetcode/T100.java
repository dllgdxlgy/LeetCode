package com.lgy.leetcode;

/**
 * 相同的树
 */
public class T100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null){
            return true;
        }
        if (p == null || q == null || p.val != q.val ){
            return false;
        }
        isSameTree(p.left,q.left);
        isSameTree(p.right,q.right);

        return true;
    }
}
