package com.lgy.company.tuhu;

import com.lgy.JZoffer.entity.TreeNode;

/**
 * @author LGY
 * @create 2022-09-07 19:44
 */
public class T2 {

//    public int sum(TreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//
//        if (root.val % 2 == 0) {
//            return 0;
//        }
//        if(root.left == null || root.right == null){
//            return 0;
//        }
//        int res = 0;
//        if(root.left!=null && root.right!=null){
//            if(root.left.left!=null){
//                res+=root.left.left.val;
//            }
//            if(root.left.right!=null){
//                res+=root.left.right.val;
//            }
//            if(root.right.left!=null){
//                res+=root.right.left.val;
//            }
//            if(root.right.right!=null){
//                res+=root.right.right.val;
//            }
//        }
//        return res+sum(root.left)+sum(root.right);
//
//    }

    public int sum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.val % 2 == 0) {
            return sum(root.right) + sum(root.left);
        }

        int res = 0;

        if (root.left == null || root.right == null) {
            return 0;
        }
        if (root.left != null ) {
            if (root.left.left != null) {
                res += root.left.left.val;
            }
            if (root.left.right != null) {
                res += root.left.right.val;
            }
        }
        if(root.right != null){

            if (root.right.left != null) {
                res += root.right.left.val;
            }
            if (root.right.right != null) {
                res += root.right.right.val;
            }
        }

        return res + sum(root.left) + sum(root.right);

    }
}
