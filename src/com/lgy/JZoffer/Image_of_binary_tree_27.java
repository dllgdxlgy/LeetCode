package com.lgy.JZoffer;

import com.lgy.JZoffer.entity.TreeNode;

import java.util.Stack;

/**
 * @author LGY
 * @create 2021-12-31 20:00
 */
public class Image_of_binary_tree_27 {

    /**
     * 方法一
     *
     * @param root
     * @return
     */
    public TreeNode mirrorTree1(TreeNode root) {

        if (root == null) {
            return null;
        }
        TreeNode tem = root.left;
        root.left = mirrorTree1(root.right);
        root.right = mirrorTree1(tem);

        return root;
    }

    /**
     * 方法二
     *
     * @param root
     * @return
     */
    public TreeNode mirrorTree2(TreeNode root) {

        if (root == null) return null;
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode treeNode = stack.pop();
            if (treeNode.left != null) {
                stack.add(treeNode.left);
            }
            if (treeNode.right != null) {
                stack.add(treeNode.right);
            }
            TreeNode tmp = treeNode.left;
            treeNode.left = treeNode.right;
            treeNode.right = tmp;
        }
        return root;
    }


}
