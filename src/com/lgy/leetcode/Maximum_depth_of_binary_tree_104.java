package com.lgy.leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

public class Maximum_depth_of_binary_tree_104 {

    int depth = 0;
    int res = 0;
    public int maxDepth(TreeNode root) {
        traverse(root);
        return res;
    }

    // 遍历二叉树
    void traverse(TreeNode root){
        if (root == null){
            return;
        }
        depth++;
        res = Math.max(res,depth);
        traverse(root.left);
        traverse(root.right);
        depth--;
    }


    /**
     * 层序遍历
     * @param root
     * @return
     */
    public int maxDepth_1(TreeNode root) {

        int res = 0;

        if(root ==null){
            return res;
        }
        Queue<TreeNode> queue =new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i =0;i < size;i++){
                TreeNode node = queue.poll();
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            res++;
        }
        return res;
    }
}
