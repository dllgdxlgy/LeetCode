package com.lgy.leetcode;

import com.lgy.Design_pattern.factorymethod.bean.Plane;
import com.lgy.company.leetcodecom.T;

import java.util.TreeMap;

public class T92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || head.next == null){
            return head;
        }
        ListNode node = head;

        int num = 0;
        while (node != null){
            num++;
            node = node.next;
        }
        int[] arr = new int[num];
        node = head;
        for (int i = 0; i < num; i++) {
            arr[i] = node.val;
            node = node.next;
        }
        int temp = 0;
        while (left < right){
            temp = arr[left-1];
            arr[left-1] = arr[right-1];
            arr[right-1] = temp;
            left++;
            right--;
        }
        node = head;
        for (int i = 0; i < num; i++) {
            node.next = new ListNode(arr[i]);
            node = node.next;
        }
        return head.next;
    }
}
