package com.lgy.Hot_100;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

/**
 * @author LGY
 * @create 2022-02-21 23:35
 */
public class T104 {
    public int maxDepth(TreeNode root) {
//        int high = 0;
//        if (root == null) {
//            return high;
//        }
//        Deque<TreeNode> deque = new ArrayDeque<>();
//
//        deque.add(root);
//        while (!deque.isEmpty()) {
//
//            high++;
//            deque.add(root.left);
//            deque.add(root.right);
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return (left > right) ? left + 1 : right + 1;

    }


}
