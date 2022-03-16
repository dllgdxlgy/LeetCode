package com.lgy.Hot_100;

import java.util.*;

public class T32_III {

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> listList = new LinkedList<>();
        if (root == null){
            return listList;
        }
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);
        int a = 1;
        while (!deque.isEmpty()){
            //临时表
            List<Integer> list = new ArrayList<>();
            for (int i = deque.size(); i > 0; i--) {
                TreeNode treeNode = deque.pop();
                list.add(treeNode.val);
                if (treeNode.left != null) deque.add(treeNode.left);
                if (treeNode.right != null) deque.add(treeNode.right);

            }
            if (a % 2 == 0){
                Collections.reverse(list);
            }
            a++;
            listList.add(list);
        }
        return listList;
    }
}
