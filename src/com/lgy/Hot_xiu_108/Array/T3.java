package com.lgy.Hot_xiu_108.Array;

import com.lgy.JZoffer.entity.TreeNode;

/**
 *
 * 3. 重建二叉树
 *
 https://www.nowcoder.com//practice/8
 a19cbe657394eeaac2f6ea9b0f6fcf6?tpId=190&&tqId=3
 5426&rp=1&ru=/activity/oj&qru=/ta/job-code-high-rd/question-ranking
 * @author LGY
 * @create 2022-06-06 21:11
 */
public class T3 {

    /**
     *
     * @param pre
     * @param vin
     * @return
     */
    public TreeNode reConstructBinaryTree(int [] pre, int [] vin) {

        // 获取前序遍历 的长度
        int pre_len = pre.length;
        // 获取中序遍历的长度
        int in_len = vin.length;

        // 构造一个函数，6个参数，给出每一个数组的起始节点
        return reBuild(pre,0,pre_len-1,vin,0,in_len-1);
    }

    private TreeNode reBuild(int[] preorder, int pre_le, int pre_ri, int[] inorder, int in_le, int in_ri) {

        if (pre_le > pre_ri || in_le > in_ri){
            return null;
        }

        // 获取前序遍历的第一个节点
        int priot = preorder[pre_le];
        //并创建一个树
        TreeNode root = new TreeNode(priot);
        //然后通过遍历来确定在中序的位置上，
        int index = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (priot == inorder[i]){
                index = i;
                break;
            }
        }
        // 构造树的左子树
        root.left = reBuild(preorder,pre_le + 1,index - in_le + pre_le, inorder, in_le,index-1);
        // 构造树的右子树
        root.right = reBuild(preorder,index - in_le + pre_le+1,pre_ri,inorder,index + 1,in_ri);

        return root;
    }
}
