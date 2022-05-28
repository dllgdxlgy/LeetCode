package com.lgy.JZoffer;

import java.util.ArrayList;
class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
/**
 * @author LGY
 * @create 2022-05-28 10:27
 */
public class T08 {
    ArrayList<TreeLinkNode> arr = new ArrayList<>();
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        TreeLinkNode root = pNode;
        while(root.next != null){
            root = root.next;
        }

        dfs(root);

        int n = arr.size();

        for(int i = 0; i < n-1 ;i++){
            TreeLinkNode cur = arr.get(i);
            if(cur == pNode){
                if(i+1 != n)
                    return arr.get(i+1);
            }
        }
        return null;
    }
    public void dfs(TreeLinkNode pNode){

        if(pNode == null){
            return;
        }

        dfs(pNode.left);
        arr.add(pNode);
        dfs(pNode.right);

    }
}
