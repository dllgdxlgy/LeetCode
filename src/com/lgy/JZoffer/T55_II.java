package com.lgy.JZoffer;

import com.lgy.JZoffer.entity.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author LGY
 * @create 2022-05-25 11:12
 */
public class T55_II {



    public boolean isBalanced(TreeNode root) {
        if (root == null){
            return true;
        }
        return Math.abs(dfs(root.left) - dfs(root.right))<=1 && isBalanced(root.right) && isBalanced(root.left);
    }

    private int dfs(TreeNode root) {
        if (root== null ){
            return 0;
        }

       return Math.max(dfs(root.right),dfs(root.left))+1;
    }
}
