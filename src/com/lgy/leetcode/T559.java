package com.lgy.leetcode;

import java.util.List;

/**
 * N 叉树的深度
 * @author LGY
 * @create 2022-08-03 11:34
 */
public class T559 {

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
    };

    public int maxDepth(Node root) {
        if(root == null){
            return 0;
        }
        int res = 0;

        for(int i = 0; i<root.children.size();i++){
            res = Math.max(maxDepth(root.children.get(i)),res);
        }
        return res+1;
    }
}
