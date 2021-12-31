package com.lgy.JZoffer;

import com.lgy.JZoffer.entity.Node;

/**
 * @author LGY
 * @create 2021-12-31 20:41
 */
public class Binary_search_tree_and_bidirectional_linked_list_36 {

    Node pre,head;
    public Node treeToDoublyList(Node root) {

        if (root == null)return null;
        dfs(root);
        head.left = pre;
        pre.right = head;
        return head;
    }
    public void dfs(Node cur){
        if (cur == null){
            return ;
        }
        dfs(cur.left);
        if (pre != null){
            pre.right = cur;
        }else {
            head = cur;
        }
        cur.left = pre;
        pre = cur;
        dfs(cur.right);
    }
}
