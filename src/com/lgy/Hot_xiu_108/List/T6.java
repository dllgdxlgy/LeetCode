package com.lgy.Hot_xiu_108.List;

import com.lgy.JZoffer.entity.ListNode;

/**
 * 6. 合并两个有序链表
 * @author LGY
 * @create 2022-06-05 17:15
 */
public class T6 {

    /**
     * 自己做的
     * @param list1
     * @param list2
     * @return
     */
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode head = new ListNode(-1);
        ListNode node = head;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                node.next = list1;
                list1 = list1.next;
                node = node.next;
            }else{
                node.next = list2;
                list2 = list2.next;
                node = node.next;
            }
        }
        if(list1 == null){
            node.next = list2;
        }
        if(list2 == null){
            node.next = list1;
        }

        return head.next;

    }

}
