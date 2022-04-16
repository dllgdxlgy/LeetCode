package com.lgy.leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class T234 {
    /**
     *  判断是不是回文链表
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {
        if (head == null){
            return false;
        }
        ListNode node = head;
        List<Integer> listNodes = new ArrayList<>();
        while (node != null){
            listNodes.add(node.val);
            node = node.next;
        }
        int[] arr = new int[listNodes.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = listNodes.get(i);
        }
        int left = 0;
        int right = arr.length-1;
        while (left < right){
            if (arr[left] != arr[right]){
              return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
