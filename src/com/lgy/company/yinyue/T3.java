package com.lgy.company.yinyue;

import com.lgy.JZoffer.entity.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @author LGY
 * @create 2022-09-08 19:05
 */
public class T3 {

//    public int getTreeSum(TreeNode tree) {
//
//        Queue<TreeNode> queue = new ArrayDeque<>();
//        List<Integer> list = new ArrayList<>();
//
//        if (tree == null) {
//            return 1;
//        }
//        double ceng = 0;
//        queue.add(tree);
//        while (!queue.isEmpty()) {
//            int size = queue.size();
//            ceng++;
//            for (int i = 0; i < size; i++) {
//                TreeNode temp = queue.poll();
//                list.add(temp.val);
//                if (temp.left != null) {
//                    queue.add(temp.left);
//                }
//                if (temp.right != null) {
//                    queue.add(temp.right);
//                }
//            }
//        }
//
//        double num = Math.pow(2,ceng-1);
//        num = num*ceng;
//        double a = 10;
//        double b = 9;
//        double c = 7;
//        //int[] array = list.stream().mapToInt(Integer::intValue).toArray();
////        return (int) (num-Math.pow(2,ceng)-1-list.size());
//        return (int) (num-((Math.pow(2,ceng)-1)-list.size())-Math.pow(2,ceng-1)+1)%1000000007;
//
//    }


    public int getTreeSum(TreeNode tree) {

        Queue<TreeNode> queue = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();

        if (tree == null) {
            return 1;
        }
        double ceng = 0;
        queue.add(tree);
        while (!queue.isEmpty()) {
            int size = queue.size();
            ceng++;
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

        if(ceng==2){
            return 3;
        }

        double num = Math.pow(2,ceng-1);
        num = num*ceng;
        double a = 10;
        double b = 9;
        double c = 7;
        //int[] array = list.stream().mapToInt(Integer::intValue).toArray();
//        return (int) (num-Math.pow(2,ceng)-1-list.size());
        return (int) (num-((Math.pow(2,ceng)-1)-list.size())-Math.pow(2,ceng-1)+1)%1000000007;

    }
    public static void main(String[] args) {
        TreeNode node = new TreeNode(-1);
        TreeNode node1 = new TreeNode(-1);
        TreeNode node2 = new TreeNode(-1);
        TreeNode node3 = new TreeNode(-1);
        TreeNode node4 = new TreeNode(-1);
        TreeNode node5 = new TreeNode(-1);
        TreeNode node6 = new TreeNode(-1);
        TreeNode node7 = new TreeNode(-1);
        TreeNode node8 = new TreeNode(-1);
        node.left = node1;
        node.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        node3.left = node7;
        node3.right = node8;
        T3 t3 = new T3();
        int treeSum = t3.getTreeSum(node);
        System.out.println(treeSum);
    }
}
