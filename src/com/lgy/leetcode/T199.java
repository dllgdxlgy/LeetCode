package com.lgy.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @author LGY
 * @create 2022-08-25 20:13
 */
public class T199 {


    /**
     * T199 二叉树的右视图
     * @param root
     * @return
     */
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();

        if(root != null){
            queue.add(root);
        }else{
            return res;
        }
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0;i<size;i++){
                TreeNode temp = queue.poll();
                if(i == 0){
                    res.add(temp.val);
                }
                if(temp.right != null){
                    queue.add(temp.right);
                }
                if(temp.left != null){
                    queue.add(temp.left);
                }
            }
        }

        return res;
    }
}
