package com.lgy.Hot_100;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

/**
 * 从上到下打印二叉树
 */
public class T32_I {
    public int[] levelOrder(TreeNode root) {
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
}
