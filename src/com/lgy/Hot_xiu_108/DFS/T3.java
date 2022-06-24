package com.lgy.Hot_xiu_108.DFS;

import com.lgy.JZoffer.entity.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * T3 .二叉树的最大深度

 https://www.nowcoder.com/practice/8a2b2bf6c19b4f23a9bdb9b233eefa73?tpId=190&&tqI
 d=35335&rp=1&ru=/activity/oj&qru=/ta/job-code-high-rd/question-ranking
 * @author LGY
 * @create 2022-06-24 13:57
 */
public class T3 {

    /**
     * 最大深度
     *
     * @param root
     * @return
     */
    public int maxDepth (TreeNode root) {
        // write code here
        if(root == null){
            return 0 ;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;

    }

    /**
     * 二叉树的最大深度
     *
     * @param root
     * @return
     */
    public int maxDepth_1 (TreeNode root) {
        // write code here
        if(root == null){
            return 0 ;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        int res = 0;
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size;i++){
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
