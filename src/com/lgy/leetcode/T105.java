package com.lgy.leetcode;

/**
 * @author LGY
 * @create 2022-04-22 21:36
 */
public class T105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        return build(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }

    TreeNode build(int[] preorder,int pre_left,int pre_right,
                   int[] inorder,int in_left,int in_right){

        if (pre_left > pre_right){
            return null;
        }

        int in_index = -1;
        TreeNode root = new TreeNode(preorder[pre_left]);
        for (int i = in_left; i <= in_right; i++) {
            if (inorder[i] == root.val){
                in_index = i;
                break;
            }
        }

        int temp = in_index - in_left + pre_left;
        root.left = build(preorder,pre_left+1,temp,inorder,in_left,in_index-1);
        root.right = build(preorder,temp+1,pre_right,inorder,in_index+1,in_right);


        return root;
    }
}
