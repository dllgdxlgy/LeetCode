package com.lgy.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @author LGY
 * @create 2022-08-05 11:35
 */
public class T513 {


    /**
     * T513. 找树左下角的值
     *
     * @param root
     * @return
     */
    public int findBottomLeftValue(TreeNode root) {

        if(root == null){
            return 0;
        }

        Queue<TreeNode> queue = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();

        queue.add(root);
        int size = 0;
        while(!queue.isEmpty()){
            size = queue.size();

            for(int i = 0; i < size;i++){
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left!= null){
                    queue.add(node.left);
                }
                if(node.right!= null){
                    queue.add(node.right);
                }
            }
        }
        return list.get(list.size()-size);

    }
}
