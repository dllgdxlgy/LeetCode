package com.lgy.JZoffer;


import com.lgy.JZoffer.entity.TreeNode;

import java.util.HashMap;

/**
 * @author LGY
 * @create 2021-12-25 13:25
 */
public class Rebuild_binary_tree_07 {

    int[] preorder;
    HashMap<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        this.preorder = preorder;


        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i],i);
        }
        return recur(0,0,inorder.length-1);
    }
    TreeNode recur(int root, int left, int right) {
        if (left > right) return null;
        TreeNode node =new TreeNode(preorder[root]);
        int i = map.get(preorder[root]);
        node.left = recur(root+1,left,i-1);
        node.right = recur(root+i-left+1,i+1,right);
        return node;
    }


//    int[] preorder;
//    HashMap<Integer, Integer> dic = new HashMap<>();
//
//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        this.preorder = preorder;
//        for (int i = 0; i < inorder.length; i++)
//            dic.put(inorder[i], i);
//        return recur(0, 0, inorder.length - 1);
//    }
//
//    TreeNode recur(int root, int left, int right) {
//        if (left > right) return null;                          // 递归终止
//        TreeNode node = new TreeNode(preorder[root]);          // 建立根节点
//        int i = dic.get(preorder[root]);                       // 划分根节点、左子树、右子树
//        node.left = recur(root + 1, left, i - 1);              // 开启左子树递归
//        node.right = recur(root + i - left + 1, i + 1, right); // 开启右子树递归
//        return node;                                           // 回溯返回根节点
//    }


    public static void main(String[] args) {

        int[] preorder = new int[]{3,9,6,20,15,7};
        int[] inorder = new int[]{6,9,3,15,20,7};
        Rebuild_binary_tree_07 re = new Rebuild_binary_tree_07();
        TreeNode res = re.buildTree(preorder,inorder);
        System.out.println(res);

    }


}

