package com.lgy.Hot_xiu_108.Binary_search;

import com.lgy.JZoffer.entity.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * T11. 完全二叉树结点数

 https://www.nowcoder.com/practice/512688d2ecf54414826f52df4e4b5693?tpId
 =190&&tqId=35379&rp=1&ru=/activity/oj&qru=/ta/job-code-high-rd/question-ranking
 * @author LGY
 * @create 2022-07-02 18:46
 */
public class T11 {

    public int nodeNum(TreeNode head) {
        if(head == null){
            return 0;
        }
        int res = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(head);
        while(!queue.isEmpty()){
            int size = queue.size();
            res += size;
            for(int i = 0; i<size; i++){
                TreeNode temp = queue.poll();
                if(temp.left!=null){
                    queue.add(temp.left);
                }
                if(temp.right!=null){
                    queue.add(temp.right);
                }
            }
        }
        return res;
    }
}
