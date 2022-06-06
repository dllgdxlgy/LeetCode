package com.lgy.Hot_xiu_108.List;

import com.lgy.JZoffer.entity.ListNode;

/**
 * 9. 删除有序链表中重复的元素-II
 *
 https://www.nowcoder.com/practice/71cef9f8b
 5564579bf7ed93fbe0b2024?tpId=188&&tqId=38353&rp
 =1&ru=/activity/oj&qru=/ta/job-code-high-week/question-ranking
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
