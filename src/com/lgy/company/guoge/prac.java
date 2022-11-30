package com.lgy.company.guoge;

import com.lgy.JZoffer.entity.TreeNode;

public class prac {


    public void trace(TreeNode root){
        if(root == null){
            return;
        }
        System.out.println(root.val);
        trace(root.left);
        trace(root.right);
    }
}
