package com.lgy.leetcode;

public class T61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null||head.next == null){
            return head;
        }
        // 计算链表的长度
        int list_length = 1;
        ListNode temp = head;
        while (temp.next != null){
            list_length++;
            temp = temp.next;
        }
        // 连接起来
        temp.next = head;
        // 从后面移动的次数
        int remove = 0;
        if (k>=list_length){
            remove = k % list_length;
        }else {
            remove = k;
        }
        int num = list_length - remove;
        temp = head;
        while (num > 0 ){
            if (num ==1){
                temp = head;
            }
            head = head.next;
            num -- ;
        }
        temp.next = null;



        return head;

    }
}
