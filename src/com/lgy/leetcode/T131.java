package com.lgy.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author LGY
 * @create 2022-05-08 11:22
 */
public class T131 {

//        public List<List<Integer>> permute(int[] nums) {
//            // 获取数组的长长度
//            int len = nums.length;
//            // 使用一个动态数组保存所有可能的全排列
//            List<List<Integer>> res = new ArrayList<>();
//
//            // 特殊条件判断
//            if (len == 0) {
//                return res;
//            }
//
//            boolean[] used = new boolean[len];
//            List<Integer> path = new ArrayList<>();
//
//            dfs(nums, len, 0, path, used, res);
//            return res;
//        }
//
//        private void dfs(int[] nums, int len, int depth,
//                         List<Integer> path, boolean[] used,
//                         List<List<Integer>> res) {
//            if (depth == len) {
//                res.add(path);
//                return;
//            }
//
//            // 在非叶子结点处，产生不同的分支，这一操作的语义是：在还未选择的数中依次选择一个元素作为下一个位置的元素，这显然得通过一个循环实现。
//            for (int i = 0; i < len; i++) {
//                if (!used[i]) {
//                    path.add(nums[i]);
//                    used[i] = true;
//
//                    dfs(nums, len, depth + 1, path, used, res);
//                    // 注意：下面这两行代码发生 「回溯」，回溯发生在从 深层结点 回到 浅层结点 的过程，代码在形式上和递归之前是对称的
//                    used[i] = false;
//                    path.remove(path.size() - 1);
//                }
//            }
//        }
//
//        public static void main(String[] args) {
//            int[] nums = {1, 2, 3};
//            T131 t131 = new T131();
//            List<List<Integer>> lists = t131.permute(nums);
//            System.out.println(lists);
//        }
//



        public List<List<String>> partition(String s) {
            int len = s.length();
            List<List<String>> res = new ArrayList<>();
            if (len == 0) {
                return res;
            }

            // Stack 这个类 Java 的文档里推荐写成 Deque<Integer> stack = new ArrayDeque<Integer>();
            // 注意：只使用 stack 相关的接口
            Deque<String> stack = new ArrayDeque<>();
            char[] charArray = s.toCharArray();
            dfs(charArray, 0, len, stack, res);
            return res;
        }

        /**
         * @param charArray
         * @param index     起始字符的索引
         * @param len       字符串 s 的长度，可以设置为全局变量
         * @param path      记录从根结点到叶子结点的路径
         * @param res       记录所有的结果
         */
        private void dfs(char[] charArray, int index, int len, Deque<String> path, List<List<String>> res) {
            if (index == len) {
                res.add(new ArrayList<>(path));
                return;
            }

            for (int i = index; i < len; i++) {
                // 因为截取字符串是消耗性能的，因此，采用传子串下标的方式判断一个子串是否是回文子串
                if (!checkPalindrome(charArray, index, i)) {
                    continue;
                }
                path.addLast(new String(charArray, index, i + 1 - index));
                dfs(charArray, i + 1, len, path, res);
                path.removeLast();
            }
        }

        /**
         * 这一步的时间复杂度是 O(N)，优化的解法是，先采用动态规划，把回文子串的结果记录在一个表格里
         *
         * @param charArray
         * @param left      子串的左边界，可以取到
         * @param right     子串的右边界，可以取到
         * @return
         */
        private boolean checkPalindrome(char[] charArray, int left, int right) {
            while (left < right) {
                if (charArray[left] != charArray[right]) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }

    public static void main(String[] args) {
        String str = "abcdd";
        T131 t131 = new T131();
        List<List<String>> partition = t131.partition(str);

    }

}
