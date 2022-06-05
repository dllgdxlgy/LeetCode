package com.lgy.Hot_xiu_108.List;

import com.lgy.JZoffer.entity.ListNode;

/**
 * 7. 删除链表的第 K 个节点
 * @author LGY
 * @create 2022-06-05 17:31
 */
public class T7 {

    /**
     *
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd (ListNode head, int n) {
        // write code here
        ListNode temp = new ListNode(-1);
        temp.next = head;
        ListNode node = temp;

        int len = 0;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        temp = node;
        int i = 0;
        while(i<(len-n-1)){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return node.next;
    }
}
