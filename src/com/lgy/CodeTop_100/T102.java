package com.lgy.CodeTop_100;

import com.lgy.JZoffer.entity.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author LGY
 * @create 2022-07-15 14:39
 */
public class T102 {

    List<List<Integer>> res = new ArrayList<>();

    List<Integer> list = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {

        if(root == null){
            return res;
        }
        //注意这个队列的创建方式
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size;i++){
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
            res.add(new ArrayList(list));
            list.clear();
        }
        return res;

    }
}
