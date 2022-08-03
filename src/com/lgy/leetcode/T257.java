package com.lgy.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 257 二叉树的所有路径
 * @author LGY
 * @create 2022-08-03 13:57
 */
public class T257 {

    List<String> res = new ArrayList<>();

    List<Integer> list = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null){
            return res;
        }
        dfs(root);
        return res;
    }
    public void dfs(TreeNode root){

        list.add(root.val);
        if(root.right == null && root.left == null){
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i< list.size()-1;i++){
                sb.append(list.get(i));
                sb.append("->");
            }
            sb.append(list.get(list.size()-1));
            String s = sb.toString();
            res.add(s);
            return;
        }

        if(root.left!=null){
            dfs(root.left);
            list.remove(list.size()-1);

        }
        if(root.right!=null){
            dfs(root.right);
            list.remove(list.size()-1);
        }

    }
        public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node5 = new TreeNode(5);
        node.left = node2;
        node.right = node3;
        node2.right = node5;
        T257 t257 = new T257();
        List<String> list = t257.binaryTreePaths(node);
    }
}
