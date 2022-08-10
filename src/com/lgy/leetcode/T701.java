package com.lgy.leetcode;

/**
 *
 * T701、二叉搜索树中的插入操作
 * @author LGY
 * @create 2022-08-10 14:51
 */
public class T701 {

    public TreeNode insertIntoBST(TreeNode root, int val) {

        if(root == null){
            return new TreeNode(val);
        }

        if(root.val < val){
            root.right = insertIntoBST(root.right,val);
        }
        if(root.val > val){
            root.left = insertIntoBST(root.left,val);
        }
        return root;
    }
}
