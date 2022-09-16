package com.lgy.JZoffer;

import com.lgy.JZoffer.entity.TreeNode;

/**
 * @author LGY
 * @create 2022-05-26 13:44
 */
public class T68_I {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){

        if(root.val >= q.val && root.val <= p.val || root.val <= q.val && root.val >= p.val){
            return root;
        }

        if(root.val >q.val && root.val>p.val){
            return lowestCommonAncestor(root.left,p,q);
        }else{
            return lowestCommonAncestor(root.right,p,q);
        }


    }
}
