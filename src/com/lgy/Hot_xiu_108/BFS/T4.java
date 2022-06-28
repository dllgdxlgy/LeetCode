package com.lgy.Hot_xiu_108.BFS;

import com.lgy.JZoffer.entity.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * T4 二叉树的层序遍历 II
 *
 * https://leetcode.cn/problems/binary-tree-level-order-traversal-ii/submissions/
 * @author LGY
 * @create 2022-06-28 22:13
 */
public class T4 {

    LinkedList<List<Integer>> res = new LinkedList<>();
    List<Integer> list = new LinkedList();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null){
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            res.addFirst(new LinkedList(list));
            list.clear();
        }
        return res;

    }
}
