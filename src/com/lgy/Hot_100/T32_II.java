package com.lgy.Hot_100;

import java.util.*;

/**
 *  从上到下打印二叉树
 */
public class T32_II {
    public int[] level_Order(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (root == null){
            return new int[1];
        }
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);
        while ( !deque.isEmpty()){
            TreeNode temp = deque.pop();
            arrayList.add(temp.val);
            if (temp.left != null){
                deque.add(temp.left);
            }
            if (temp.right != null){
                deque.add(temp.right);
            }

        }
        int[] arr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            arr[i] = arrayList.get(i);
        }
        return arr;
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> listList = new ArrayList<>();

        if (root == null){
            return listList;
        }
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);
        while ( !deque.isEmpty()){
            int a = deque.size();
            // 临时表
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < a; i++) {
                TreeNode temp = deque.pop();
                list.add(temp.val);
                if (temp.left != null){
                    deque.add(temp.left);
                }
                if (temp.right != null){
                    deque.add(temp.right);
                }
            }
            listList.add(list);
        }
        return listList;
    }
}
