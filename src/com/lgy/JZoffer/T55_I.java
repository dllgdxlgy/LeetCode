package com.lgy.JZoffer;

import com.lgy.JZoffer.entity.TreeNode;

/**
 * @author LGY
 * @create 2022-05-24 18:01
 */
public class T55_I {

    int res = 0;
    public int maxDepth(TreeNode root) {

       return dfs(root);


    }

    public int dfs(TreeNode root){

        if (root == null){
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);

        return Math.max(left,right)+1;
    }
}
