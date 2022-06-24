package com.lgy.Hot_xiu_108.DFS;

import com.lgy.JZoffer.entity.TreeNode;

/**
 * T3 .二叉树的最大深度

 https://www.nowcoder.com/practice/8a2b2bf6c19b4f23a9bdb9b233eefa73?tpId=190&&tqI
 d=35335&rp=1&ru=/activity/oj&qru=/ta/job-code-high-rd/question-ranking
 * @author LGY
 * @create 2022-06-24 13:57
 */
public class T3 {

    /**
     * 最大深度
     *
     * @param root
     * @return
     */
    public int maxDepth (TreeNode root) {
        // write code here
        if(root == null){
            return 0 ;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;

    }
}
