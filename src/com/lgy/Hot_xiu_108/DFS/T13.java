package com.lgy.Hot_xiu_108.DFS;

import com.lgy.JZoffer.entity.TreeNode;

/**
 * T13 .将升序数组转化为平衡二叉搜索树

 https://www.nowcoder.com/practice/7e5b00f94b254da599a9472fe5ab283d?tpId=190&&tqId=36791&r
 p=1&ru=/activity/oj&qru=/ta/job-code-high-rd/question-ranking
 * @author LGY
 * @create 2022-06-26 17:22
 */
public class T13 {

    public TreeNode sortedArrayToBST (int[] num) {
        // write code here
        if(num.length == 0 || num == null){
            return null;
        }
        TreeNode root = dfs(num,0,num.length-1);

        return root;
    }
    public TreeNode dfs(int[] num,int left,int right){
        if(left>right){
            return null;
        }
        int mid = left + (right-left)/2;
        TreeNode root = new TreeNode(num[mid]);

        root.left = dfs(num,left,mid-1);
        root.right = dfs(num,mid+1,right);

        return root;

    }

    public static void main(String[] args) {
        T13 t13 = new T13();
        int[] arr = new int[]{2,3,4,5,6,7,8};
        TreeNode treeNode = t13.sortedArrayToBST(arr);

    }
}
