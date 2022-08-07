package com.lgy.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author LGY
 * @create 2022-05-09 17:05
 */
public class T98 {
    LinkedList<Integer> linkedList = new LinkedList<>();

    public boolean isValidBST(TreeNode root) {

        dfs(root);
//        int[] arr = new int[linkedList.size()];
//
//
//
//        for (int i = 0; i < linkedList.size(); i++) {
//            arr[i] = linkedList.get(i);
//        }
//        for (int i = 1; i < linkedList.size(); i++) {
//            if (arr[i]<=arr[i-1]){
//                return false;
//            }
//        }

        Integer[] integers = linkedList.toArray(new Integer[linkedList.size()]);
        for (int i = 0; i < integers.length-1; i++) {
            if (integers[i]>integers[i+1]){
                return false;
            }
        }
        return true;
    }

    private void dfs(TreeNode root) {
        if (root == null){
            return;
        }

        dfs(root.left);
        linkedList.add(root.val);
        dfs(root.right);
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(4);
        linkedList.add(2);
        linkedList.add(3);
        Integer[] integers = linkedList.toArray(new Integer[linkedList.size()]);
        for (int i = 0; i < integers.length-1; i++) {
            if (integers[i]>integers[i+1]){
                System.out.println("false");
                break;
            }
        }
        System.out.println("true");
    }


    /**
     * 第二遍
     */
    List<Integer> list = new ArrayList<>();

    public boolean isValidBST_1(TreeNode root) {
        boolean isFlag = true;
        isVali(root);
        for(int i = 1; i< list.size();i++){
            if(list.get(i)<=list.get(i-1)){
                isFlag = false;
                break;
            }
        }
        return isFlag;
    }

    public void isVali(TreeNode node){
        if(node == null){
            return;
        }

        isVali(node.left);

        list.add(node.val);

        isVali(node.right);
    }

}
