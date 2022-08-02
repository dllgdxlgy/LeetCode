package com.lgy.leetcode;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;

/**
 *
 * T107 二叉树的层序遍历 II
 * @author LGY
 * @create 2022-08-02 09:32
 */
public class T107 {


    /**
     * 第一遍做
     *
     */
    LinkedList<List<Integer>> res = new LinkedList<>();
    List<Integer> list = new LinkedList();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null){
            return res;
        }
        //注意这里 ArrayDeque 的写法
        Queue<TreeNode> queue = new ArrayDeque<>();

//        add()和offer()区别:
//        add()和offer()都是向队列中添加一个元素。一些队列有大小限制，
//        因此如果想在一个满的队列中加入一个新项，调用 add() 方法就会抛出一个 unchecked 异常，
//        而调用 offer() 方法会返回 false。因此就可以在程序中进行有效的判断！
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){

                //注意：队列的出列使用的是queue.poll();
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

    /**
     *
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrderBottom_1(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>();

        if(root == null) {
            return res;
        }

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i< size;i++){
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left!= null){
                    queue.add(node.left);
                }
                if(node.right!= null){
                    queue.add(node.right);
                }
            }
            res.add(new ArrayList<>(list));
        }
        Collections.reverse(res);
        return res;

    }

    public static void main(String[] args) {

    }
}
