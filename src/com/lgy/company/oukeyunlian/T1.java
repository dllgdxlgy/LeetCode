package com.lgy.company.oukeyunlian;

import com.lgy.JZoffer.entity.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

/**
 * @author LGY
 * @create 2022-10-22 14:27
 */
public class T1 {

    public int kthSmallest(TreeNode root, int k) {


        Queue<TreeNode> queue = new ArrayDeque<>();

        ArrayList<Integer> list = new ArrayList<>();

        if (root != null) {
            queue.add(root);
        }

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                list.add(temp.val);
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
        }

        int[] array = list.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(array);
        return array[k-1];
    }
}
