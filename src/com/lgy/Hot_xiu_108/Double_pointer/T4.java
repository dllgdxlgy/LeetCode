package com.lgy.Hot_xiu_108.Double_pointer;

import com.lgy.JZoffer.entity.ListNode;

/**
 * T4. 删除链表的倒数第n个节点
 https://www.nowcoder.com/practice/f95dcdafbde44b22a6d741baf71653f6?tpId=190&&tqId=3519
 5&rp=1&ru=/activity/oj&qru=/ta/job-code-high-rd/question-ranking
 * @author LGY
 * @create 2022-07-01 22:52
 */
public class T4 {

    public ListNode removeNthFromEnd (ListNode head, int n) {
        // write code here
        ListNode root = new ListNode(1);
        root.next = head;
        ListNode right = root;
        ListNode left = root;

        int i = 0;
        while(i <= n){
            right = right.next;
            i++;
        }
        while(right != null){
            left = left.next;
            right = right.next;
        }
        left.next = left.next.next;

        return root.next;
    }
}
