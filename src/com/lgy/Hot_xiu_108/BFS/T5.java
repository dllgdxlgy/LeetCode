package com.lgy.Hot_xiu_108.BFS;

import com.lgy.JZoffer.entity.TreeNode;

/**
 * T5. 对称二叉树
 * @author LGY
 * @create 2022-06-28 22:17
 */
public class T5 {


    /**
     *
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);

    }
    public boolean  isMirror(TreeNode root,TreeNode root1){

        if(root == null && root1 ==null){
            return true;
        }
        if(root == null || root1 ==null){
            return false;
        }

        return root.val == root1.val && isMirror(root.left,root1.right)&&isMirror(root.right,root1.left);
    }
}
