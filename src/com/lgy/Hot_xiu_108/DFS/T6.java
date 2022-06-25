package com.lgy.Hot_xiu_108.DFS;

import com.lgy.JZoffer.entity.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;

/**
 * T6. 判断一棵二叉树是否为搜索二叉树和完全二叉树
 https://www.nowcoder.com/practice/f31fc6d3caf24e7f8b4deb5cd9b5fa97?tpId=190&&tqId=35223&rp
 =1&ru=/activity/oj&qru=/ta/job-code-high-rd/question-ranking
 * @author LGY
 * @create 2022-06-24 17:30
 */
public class T6 {


    boolean[] res = new boolean[2];
    public boolean[] judgeIt (TreeNode root) {
        // write code here
        res[0] = true;
        res[1] = true;
        res[0] = dfs(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
        res[1] = dfs_1(root);
        return res;
    }

    public boolean dfs(TreeNode root,int min,int max){
        if(root == null){
            return true;
        }
        if(root.val < min || root.val > max){
            return false;
        }

        return dfs(root.left,min,root.val)&& dfs(root.right,root.val,max);
    }
    public boolean dfs_1(TreeNode root){
        if(root == null){
            return true;
        }

        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode left = null;
        TreeNode right = null;
        boolean flag = false;
        while (!queue.isEmpty()){
            root = queue.poll();
            left = root.left;
            right = root.right;

            if((flag && !(left == null && right == null)) || (left == null && right != null)){
                return false;
            }
            if(left != null)
                queue.offer(left);
            if(right !=null)
                queue.offer(right);
            if(left == null || right ==null)
                flag = true;

        }
        return true;
    }
}
