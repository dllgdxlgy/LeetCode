package com.lgy.leetcode;

import javax.swing.plaf.metal.MetalRootPaneUI;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class T652 {

    HashMap<String,Integer> map = new HashMap<>();
    LinkedList<TreeNode> list = new LinkedList<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
            traverse(root);
            return list;

    }

    String traverse(TreeNode root){
        if (root == null){
            return "#";
        }

        String left = traverse(root.left);
        String right = traverse(root.right);
        String subTree = left+","+right+","+root.val;
        int orDefault = map.getOrDefault(subTree, 0);
        if(orDefault == 1){
            list.add(root);
        }
        map.put(subTree,orDefault+1);
        return subTree;
    }
}
