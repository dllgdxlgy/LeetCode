package com.lgy.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LGY
 * @create 2022-08-02 10:37
 */
public class T589 {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    List<Integer> list = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        dfs(root);
        return list;
    }

    public void dfs(Node root){
        if(root == null){
            return;
        }
        list.add(root.val);
        for(int i = 0; i< root.children.size();i++){
            dfs(root.children.get(i));
        }
    }
}
