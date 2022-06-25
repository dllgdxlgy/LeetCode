package com.lgy.Hot_xiu_108.DFS;

import com.lgy.JZoffer.entity.TreeNode;

import java.util.ArrayList;

/**
 * T7. 二叉树根节点到叶子节点的所有路径和 (虽然是自己做的，还是有点不理解)

 https://www.nowcoder.com/practice/185a87cd29eb42049132aed873273e83?tpId=190&&tqId=35580&rp=1&r
 u=/activity/oj&qru=/ta/job-code-high-rd/question-ranking
 * @author LGY
 * @create 2022-06-25 09:29
 */
public class T7 {


    /**
     * 自己做的
     */
    StringBuilder s = new StringBuilder();
    ArrayList<StringBuilder> list = new ArrayList<>();

    public int sumNumbers (TreeNode root) {
        // write code here
        dfs(root);
        int res = 0;
        for(StringBuilder sb : list){
            res += Integer.parseInt(sb.toString());
        }
        return res;
    }
    public void dfs(TreeNode root){
        if(root == null){
            return;
        }
        s.append(root.val);
        if(root.left == null && root.right == null){
            list.add(new StringBuilder(s));
            s.deleteCharAt(s.length()-1);
            return;
        }
        dfs(root.left);

        dfs(root.right);
        s.deleteCharAt(s.length()-1);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        T7 t7 = new T7();
        int i = t7.sumNumbers(root);
        System.out.println(i);
    }
}
