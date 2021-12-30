package com.lgy.JZoffer;

import com.lgy.JZoffer.entity.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

public class Substructure_of_tree_26 {

//    public boolean isSubStructure(TreeNode A, TreeNode B) {
//
//        if (A == null || B == null)return false;
//        String resA = inOrderTraverse(A);
//        String resB = inOrderTraverse(B);
//        return resA.contains(resB);
//    }
//
//    public String inOrderTraverse(TreeNode root) {
//        String res = null;
//        Stack<TreeNode> stack = new Stack<>();
//        TreeNode node = root;
//        while (node != null || !stack.isEmpty()) {
//            if (node != null) {
//                stack.push(node);
//                node = node.left;
//            } else {
//                TreeNode tem = stack.pop();
//                res =""+tem.val;
//                node = tem.right;
//            }
//        }
//        return res;
//    }

    public boolean isSubStructure(TreeNode A, TreeNode B) {
       boolean res = (A != null && B != null) &&( recur(A,B) || isSubStructure(A.left,B) || isSubStructure(A.right,B));


        return res;
    }

    private boolean recur(TreeNode A, TreeNode B) {

        if ( B == null){
            return  true;
        }
        if (A == null || A.val!=B.val){
            return false;
        }
        return recur(A.left,B.left) && recur(A.right,B.right);

    }
}