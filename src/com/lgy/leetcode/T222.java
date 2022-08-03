package com.lgy.leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author LGY
 * @create 2022-08-03 12:55
 */
public class T222 {

    /**
     * 层次遍历获取节点数
     * @param root
     * @return
     */
    public int countNodes(TreeNode root) {
        int res = 0;
        if(root == null){
            return res;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            res+=size;

            for(int i = 0; i< size;i++){
                TreeNode node = queue.poll();
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
        }
        return res;

    }


    /**
     * 递归遍历
     * @param root
     * @return
     */
    public int countNodes_1(TreeNode root) {
        if(root == null){
            return 0;
        }

        return countNodes(root.left)+countNodes(root.right)+1;

    }
}
