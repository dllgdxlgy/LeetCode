package com.lgy.JZoffer;

import com.lgy.JZoffer.entity.TreeNode;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 剑指 offer 37，序列化二叉树
 *
 * @author LGY
 * @create 2022-09-19 13:56
 */
public class T37 {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                sb.append(node.val+",");
                queue.add(node.left);
                queue.add(node.right);
            } else {
                sb.append("null,");
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.equals("[]")) {
            return null;
        }
        String[] string = data.split(",");

        TreeNode root = new TreeNode(Integer.parseInt(string[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;

        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();

            if (!string[i].equals("null")) {
                temp.left = new TreeNode(Integer.parseInt(string[i]));
                queue.add(temp.left);
            }
            i++;
            if (!string[i].equals("null")) {
                temp.right = new TreeNode(Integer.parseInt(string[i]));
                queue.add(temp.right);
            }
            i++;
        }
        return root;
    }

    public static void main(String[] args) {
//        TreeNode root = new TreeNode(1);
//        TreeNode root1 = new TreeNode(2);
//        TreeNode root2 = new TreeNode(3);
//        TreeNode root3 = new TreeNode(4);
//        TreeNode root4 = new TreeNode(5);
//        root.left = root1;
//        root.right = root2;
//        root2.left = root3;
//        root2.left = root4;
        T37 t37 = new T37();
//        String serialize = t37.serialize(root);
//        System.out.println(serialize);

        String s = "1,2,3,null,null,5,null,null,null";
        TreeNode deserialize = t37.deserialize(s);
    }


}
