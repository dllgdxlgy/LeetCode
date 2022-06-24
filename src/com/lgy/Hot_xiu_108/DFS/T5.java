package com.lgy.Hot_xiu_108.DFS;

import com.lgy.JZoffer.entity.TreeNode;

import java.util.ArrayList;

/**
 * T5. 二叉树根节点到叶子节点和为指定值的路径
 *
 https://www.nowcoder.com/practice/840dd2dc4fbd4b2199cd48f2dadf930a?tpId=190&
 &tqId=35333&rp=1&ru=/activity/oj&qru=/ta/job-code-high-rd/question-ranking
 * @author LGY
 * @create 2022-06-24 17:24
 */
public class T5 {

    /**
     *
     */
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> pathSum (TreeNode root, int sum) {
        // write code here
        dfs(root,sum);
        return res;
    }

    public void dfs(TreeNode root, int sum){
        if(root == null){
            return;
        }

        sum = sum-root.val;
        list.add(root.val);
        if(root.left == null && root.right == null && sum == 0){
            res.add(new ArrayList(list));
        }
        dfs(root.left,sum);
        dfs(root.right,sum);
        list.remove(list.size()-1);
    }

}
