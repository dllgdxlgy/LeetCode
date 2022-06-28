package com.lgy.Hot_xiu_108.BFS;

import com.lgy.JZoffer.entity.TreeNode;

/**
 * T2. 二叉树的最小深度

 https://leetcode.cn/problems/minimum-depth-of-binary-tree/submissions/
 * @author LGY
 * @create 2022-06-28 21:05
 */
public class T2 {

    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right != null){
            return 1+minDepth(root.right);
        }
        if(root.right == null && root.left != null){
            return 1+minDepth(root.left);
        }

        return Math.min(minDepth(root.left),minDepth(root.right))+1;

    }
}
