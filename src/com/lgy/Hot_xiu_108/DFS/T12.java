package com.lgy.Hot_xiu_108.DFS;

import com.lgy.JZoffer.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * T12. 找到搜索二叉树中两个错误的节点
 https://www.nowcoder.com/practice/4582efa5ffe949cc80c136eeb78795d6?tpId=190&&tq
 Id=35399&rp=1&ru=/activity/oj&qru=/ta/job-code-high-rd/question-ranking
 * @author LGY
 * @create 2022-06-26 17:45
 */
public class T12 {



    List<Integer> list = new ArrayList<>();

    public int[] findError (TreeNode root) {
        // write code here
        int[] res = new int[2];
        if(root == null){
            return res;
        }

        dfs(root);
        int index = 0;
        for(int i = 0; i<list.size()-1; i++){
            if(list.get(i) > list.get(i+1)){
                res[1] = list.get(i);
                index = i;
                break;
            }
        }

        for(int i = list.size()-1;i > index;i--){
            if(list.get(i) < list.get(i-1)){
                res[0] = list.get(i);
                break;
            }
        }
        return res;
    }

    public void dfs(TreeNode root){
        if(root == null){
            return;
        }
        dfs(root.left);
        list.add(root.val);
        dfs(root.right);
    }
}
