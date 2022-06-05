package com.lgy.Hot_xiu_108.List;

import com.lgy.JZoffer.entity.ListNode;

/**
 * @author LGY
 * @create 2022-06-05 19:21
 */
public class T9 {

    /**
     * 感觉这是最好理解的代码，仔细看
     * @param head
     * @return
     */
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                ListNode temp = curr.next;
                while (temp != null && temp.val == curr.val) {
                    temp = temp.next;
                }
                prev.next = temp;
                curr = temp;
            } else {
                prev = prev.next;
                curr = curr.next;
            }
        }
        return dummy.next;
    }
}
