package com.lgy.JZoffer;

import com.lgy.JZoffer.entity.TreeNode;

/**
 * @author LGY
 * @create 2022-09-25 09:54
 */
public class T68_II {

    /**
     * T68 二叉树的最近公共祖先
     *
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return null;
        }
        if(root == p || root == q){
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);

        if(left != null && right != null){
            return root;
        }
        if(left == null && right == null){
            return null;
        }
        return left == null?right:left;
    }
}
