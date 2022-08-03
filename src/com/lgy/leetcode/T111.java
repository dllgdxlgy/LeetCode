package com.lgy.leetcode;

/**
 * T211 二叉树的最小深度
 * @author LGY
 * @create 2022-08-03 11:41
 */
public class T111 {

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


    /**
     * 第二遍做
     * @param root
     * @return
     */
    public int minDepth_1(TreeNode root) {
        if(root ==null){
            return 0;
        }
        if(root.left == null){
            return minDepth(root.right)+1;
        }
        if(root.right == null){
            return minDepth(root.left)+1;
        }
        int temp_left = minDepth(root.left);
        int temp_right = minDepth(root.right);
        return Math.min(temp_left,temp_right)+1;


    }
}
