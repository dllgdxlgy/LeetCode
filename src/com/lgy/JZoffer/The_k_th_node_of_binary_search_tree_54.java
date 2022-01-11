package com.lgy.JZoffer;

import com.lgy.JZoffer.entity.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 二叉搜索树的第k大节点 54
 *
 * @author LGY
 * @create 2022-01-11 20:10
 */
public class The_k_th_node_of_binary_search_tree_54 {

    /**
     * 方法一 ：中序遍历
     *
     * @param root
     * @param k
     * @return
     */
    public int kthLargest(TreeNode root, int k) {

        List<Integer> list = middleSort(root);
        int size = list.size();
        int key = (int) list.get(size - k);
        return key;
    }

    /**
     * 先想到了树的中序遍历
     *
     * @param root: 二叉搜索树
     * @return
     */
    public List<Integer> middleSort(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        while (root == null) {
            return new ArrayList<>();
        }

        List<Integer> list_l = middleSort(root.left);

        List<Integer> list_R = middleSort(root.right);
        list.addAll(list_l);
        list.add(root.val);
        list.addAll(list_R);

        return list;
    }


    /**
     * 方法一改进
     *
     * @param root
     * @param k
     * @return
     */
    //创建私有空间list
    private List<Integer> list = new LinkedList<>();

    public int kthLargest_1(TreeNode root, int k) {
        inOrder(root);
        int size = list.size();
        int res = list.get(size - k);

        return res;
    }

    public void inOrder(TreeNode node) {
        if (node == null) return;
        inOrder(node.left);
        list.add(node.val);
        inOrder(node.right);

    }


    /**
     * 中序遍历的倒序：即右中左
     * <p>
     * 效率最高
     *
     * @param root
     * @param k
     * @return
     */

    private int k, res;

    public int kthLargest_2(TreeNode root, int k) {
        this.k = k;

        inOrder_1(root);


        return res;

    }

    public void inOrder_1(TreeNode node) {
        if (node == null) return;
        inOrder(node.right);

        if (k == 0) return;
        k = k - 1;
        if (k == 0) {
            res = node.val;
        }
        inOrder(node.left);

    }
}
