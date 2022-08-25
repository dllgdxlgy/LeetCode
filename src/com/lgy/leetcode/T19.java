package com.lgy.leetcode;

/**
 * @author LGY
 * @create 2022-08-25 21:20
 */
public class T19 {

    /**
     * T19. 删除链表的倒数第 N 个结点
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode left = dummy;
        ListNode right = dummy;
        int r = 0;
        while(r != n){
            right = right.next;
            r++;
        }
        while(right.next!=null){
            left = left.next;
            right = right.next;
        }
        left.next = left.next.next;
        return dummy.next;

    }
}
