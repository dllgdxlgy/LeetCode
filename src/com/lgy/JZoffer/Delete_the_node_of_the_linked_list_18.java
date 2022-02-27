package com.lgy.JZoffer;

import com.lgy.JZoffer.entity.ListNode;

/**
 * @author LGY
 * @create 2022-01-04 14:12
 */
public class Delete_the_node_of_the_linked_list_18 {

    public ListNode deleteNode(ListNode head, int val) {

        // 1. 特殊判断
        if (head == null)return head;

        //
        if (head.val == val){
            return head.next;
        }

        // 2. 一个指针指向当前的数值
        ListNode listNode = head;
        // 3. 一个指针指向当前指针指向的前一个
        ListNode listNode1 = head;

        // 4. 循环条件
        while (listNode != null){
            if (listNode.val == val){
                listNode1.next = listNode.next;
                return head;
            }else {
                listNode1 = listNode;
                listNode = listNode.next;
            }
        }



        return head;
    }
}
