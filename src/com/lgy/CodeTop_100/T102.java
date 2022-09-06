package com.lgy.CodeTop_100;

import com.lgy.JZoffer.entity.TreeNode;

import java.util.*;

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
        //添加元素的方式
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


    /**
     * 第二遍
     *
     * @param root
     * @return
     */
//    List<List<Integer>> res = new ArrayList<>();
//    List<Integer> list = new ArrayList<>();

    public List<List<Integer>> levelOrder_2(TreeNode root) {
        if(root == null){
            return res;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();

        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i =0;i< size;i++){
                TreeNode temp = queue.poll();
                list.add(temp.val);
                if(temp.left!= null){
                    queue.add(temp.left);
                }
                if(temp.right != null){
                    queue.add(temp.right);
                }

            }
            res.add(new ArrayList<>(list));
            list.clear();
        }
        return res;
    }
}
