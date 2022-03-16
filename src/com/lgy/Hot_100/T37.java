package com.lgy.Hot_100;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

/**
 * 序列化二叉树 ，未写完
 */
public class T37 {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null){
            return "";
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);
        if (!deque.isEmpty()){
            TreeNode treeNode = deque.pop();
            arrayList.add(treeNode.val);
            deque.add(treeNode.left);
            deque.add(treeNode.right);
        }
        String str = "";
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == null){
                str += " ";
            }else {
                str += arrayList.get(i).toString();
            }

        }
        return str;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null){
            return new TreeNode();
        }
        TreeNode head = new TreeNode();
        head.val = Integer.parseInt(data.trim().substring(0,1));


        return null;
    }
}
