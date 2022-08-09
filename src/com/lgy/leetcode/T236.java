package com.lgy.leetcode;

/**
 * 二叉树的最近公共祖先
 *
 * @author LGY
 * @create 2022-08-09 22:25
 */
public class T236 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if(root == null){
            return null;
        }

        if(root == p||root == q){
            return root;
        }

        TreeNode left_node = lowestCommonAncestor(root.left,p,q);
        TreeNode right_node = lowestCommonAncestor(root.right,p,q);

        if(left_node!= null && right_node != null){
            return root;
        }
        if(left_node == null && right_node == null){
            return null;
        }
        return left_node == null?right_node:left_node;

    }
}
