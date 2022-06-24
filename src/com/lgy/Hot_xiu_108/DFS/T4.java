package com.lgy.Hot_xiu_108.DFS;

import com.lgy.JZoffer.entity.TreeNode;

/**
 * T4. 是不是平衡二叉树

 https://www.nowcoder.com/practice/8b3b95850edb4115918ecebdf1b4d222?tpId=
 190&&tqId=35362&rp=1&ru=/activity/oj&qru=/ta/job-code-high-rd/question-ranking
 * @author LGY
 * @create 2022-06-24 15:11
 */
public class T4 {

    /**
     * 判断是不是平衡二叉树
     */
    boolean flag = true;

    public boolean IsBalanced_Solution(TreeNode root) {
        dfs(root);
        return flag;
    }

    public int dfs(TreeNode root){
        if(root == null){
            return 0;
        }
        int l = dfs(root.left);
        int r = dfs(root.right);
        if(Math.abs(l-r) > 1){
            flag = false;
        }
        return Math.max(l,r)+1;
    }
}
