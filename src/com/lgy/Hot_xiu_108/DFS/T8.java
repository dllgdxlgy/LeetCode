package com.lgy.Hot_xiu_108.DFS;

import com.lgy.JZoffer.entity.TreeNode;

/**
 * T8. 二叉树是否对称

 https://leetcode.cn/problems/symmetric-tree/submissions/
 * @author LGY
 * @create 2022-06-25 11:39
 */
public class T8 {


    /**
     * 参考的答案，还不是很明白
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
