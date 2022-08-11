package com.lgy.leetcode;

/**
 * T450 删除二叉搜索树中的节点
 * @author LGY
 * @create 2022-08-11 08:25
 */
public class T450 {

    public TreeNode deleteNode(TreeNode root, int key) {

        if(root == null){
            return root;
        }
        if(root.val > key){
            root.left =  deleteNode(root.left,key);
        }
        if(root.val < key){
            root.right = deleteNode(root.right,key);
        }

        if(root.val == key){

            if(root.left == null && root.right == null){
                return null;
            }
            if(root.left == null){
                return root.right;
            }
            if(root.right == null){
                return root.left;
            }else{

                TreeNode temp = root.right;

                while(temp.left!= null){
                    temp = temp.left;
                }
                root.val = temp.val;

                root.right = deleteNode(root.right,temp.val);
            }
        }
        return root;
    }


    public static void main(String[] args) {
        TreeNode node = new TreeNode(5);
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(6);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(7);

        node.left = node1;
        node.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.right = node5;
        T450 t450 = new T450();
        TreeNode treeNode = t450.deleteNode(node, 7);
    }
}
