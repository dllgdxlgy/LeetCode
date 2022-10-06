package com.lgy.leetcode;

/**
 * @author LGY
 * @create 2022-10-06 16:58
 */
public class T203 {

    /**
     * T203 移除链表元素
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElements(ListNode head, int val) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode temp = dummy;
        ListNode fast = head;

        while(fast != null){

            if(fast.val == val){
                temp.next = fast.next;
                fast = fast.next;
            }else{
                fast = fast.next;
                temp = temp.next;
            }

        }
        return dummy.next;
    }
}
