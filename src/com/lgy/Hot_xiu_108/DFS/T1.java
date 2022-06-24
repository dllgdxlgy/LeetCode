package com.lgy.Hot_xiu_108.DFS;

import com.lgy.JZoffer.entity.TreeNode;

/**
 * T1. 重建二叉树
 https://www.nowcoder.com/practice/8a19cbe657394eeaac2f6ea9b0f6fcf6?tpId=190&&tqId=3542
 6&rp=1&ru=/activity/oj&qru=/ta/job-code-high-rd/question-ranking
 * @author LGY
 * @create 2022-06-24 12:33
 */
public class T1 {


    /**
     * 参考之前做的
     * @param pre
     * @param vin
     * @return
     */
    public TreeNode reConstructBinaryTree(int [] pre, int [] vin) {

        int pre_l = 0;
        int pre_r = pre.length-1;
        int vin_l = 0;
        int vin_r = vin.length-1;
        return dfs(pre,pre_l,pre_r,vin,vin_l,vin_r);

    }
    public TreeNode dfs(int[] pre,int pre_l,int pre_r,int[] vin,int vin_l,int vin_r){
        if(pre_l > pre_r || vin_l > vin_r){
            return null;
        }

        int priot = pre[pre_l];
        TreeNode root = new TreeNode(priot);

        int index = 0;
        for(int i = 0; i < vin.length;i++){
            if(priot == vin[i]){
                index = i;
                break;
            }
        }
        root.left = dfs(pre, pre_l+1, index-vin_l+pre_l,vin,vin_l,index-1);
        root.right = dfs(pre,index-vin_l+pre_l+1 , pre_r, vin,index+1,vin_r);
        return root;

    }

}
