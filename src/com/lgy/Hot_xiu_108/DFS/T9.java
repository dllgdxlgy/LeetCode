package com.lgy.Hot_xiu_108.DFS;

import com.lgy.JZoffer.entity.TreeNode;

/**
 * T9 二叉树中的最大路径和
 https://www.nowcoder.com/practice/da785ea0f64b442488c125b441a4ba4a?tpId=190&&tqId=35180&rp=1&ru=/activity/o
 j&qru=/ta/job-code-high-rd/question-ranking
 * @author LGY
 * @create 2022-06-25 12:17
 */
public class T9 {


    /**
     *
     * 自己做的
     */
    boolean flag = false;

    public boolean hasPathSum (TreeNode root, int sum) {
        // write code here
        dfs(root,sum);
        return flag;
    }
    public void dfs(TreeNode root, int sum){
        if(root == null){
            return;
        }
        if(sum == root.val && root.left == null && root.right == null){
            flag = true;
            return;
        }
        dfs(root.left,sum-root.val);
        dfs(root.right,sum-root.val);
        return;
    }
}
