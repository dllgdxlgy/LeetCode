package com.lgy.JZoffer;

import com.lgy.JZoffer.entity.ListNode;

import java.util.Stack;

/**
 * 反转链表
 * @author LGY
 * @create 2022-01-03 15:59
 */
public class Reverse_linked_list_24 {

    public ListNode reverseList(ListNode head) {

        Stack<Integer> stack = new Stack<>();

        while (head!=null){
            stack.push(head.val);
            head = head.next;
        }
        ListNode listnode = new ListNode(-1);
        ListNode node = listnode;
        while (!stack.isEmpty()){
            node = node.next = new ListNode(stack.pop());
        }
        node.next = null;




        return listnode.next;
    }
}
