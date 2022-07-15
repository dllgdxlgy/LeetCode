package com.lgy.CodeTop_100;

import com.lgy.JZoffer.entity.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author LGY
 * @create 2022-07-15 23:37
 */
public class T103 {

    /**
     * 层次遍历，用 flag 控制方向
     *
     * @param root
     * @return
     */
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>(); // 队列的声明方式
        boolean flag = true;

        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            LinkedList<Integer> list = new LinkedList<>();
            for(int i = 0; i< size;i++){

                TreeNode temp = queue.poll();
                if(flag){
                    list.addLast(temp.val);
                }else{
                    list.addFirst(temp.val);
                }
                if(temp.left != null){
                    queue.add(temp.left);
                }
                if(temp.right != null){
                    queue.add(temp.right);
                }
            }
            flag = !flag;
            res.add(list);
        }
        return res;
    }
}
