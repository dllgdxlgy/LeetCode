package com.lgy.leetcode;

import java.util.ArrayList;
import java.util.List;

public class T145 {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        endTrace(root,res);
        return res;
    }

    public void endTrace(TreeNode root , List<Integer> res){
        if(root == null){
            return;
        }
        endTrace(root.left,res);
        endTrace(root.right,res);
        res.add(root.val);

    }
}
