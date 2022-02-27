package com.lgy.JZoffer;

import com.lgy.JZoffer.entity.TreeNode;

import java.util.*;

/**
 * 从上到下打印二叉树 II (未写完)
 *
 * @author LGY
 * @create 2022-01-18 23:07
 */
public class Print_binary_tree_II_from_top_to_bottom_32 {

    List<List<Integer>> lists = null;
    List<Integer> list = null;
    /**
     *
     *i
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        lists = new LinkedList<>();
        lists = bfs(root);

         return lists;
    }
    public List<List<Integer>> bfs(TreeNode node){

        if (node == null){
            return lists;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        return null;
    }


}
