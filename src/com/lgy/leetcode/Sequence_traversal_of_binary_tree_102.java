package com.lgy.leetcode;


import java.util.*;

/**
 * 二叉树的层次遍历
 *
 * @author LGY
 * @create 2022-02-17 10:03
 */

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

public class Sequence_traversal_of_binary_tree_102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        //创建要返回的类型
        List<List<Integer>> listList = new LinkedList<>();
        // 特殊处理
        if (root == null) {
            return listList;
        }

        // 创建队列
        Queue<TreeNode> queue = new LinkedList<>();
        // 添加跟元素
        queue.add(root);

        while (!queue.isEmpty()) {

            // 创建一个List
            List<Integer> list = new ArrayList<>();
            int num = queue.size();
            for (int i = 0; i < num; i++) {
                // 推出一个元素
                TreeNode treeNode = queue.poll();

                list.add(treeNode.val);

                if (treeNode.left != null) {
                    queue.add(treeNode.left);

                }
                if (treeNode.right != null) {
                    queue.add(treeNode.right);
                }
            }

            listList.add(list);
        }

        return listList;
    }
}
