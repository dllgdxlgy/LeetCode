package com.lgy.JZoffer;

import com.lgy.JZoffer.entity.ListNode;

import java.util.Stack;

/**
 * @author LGY
 * @create 2021-12-23 12:33
 */
public class Print_linked_list_from_beginning_to_end_06 {

    public int[] reversePrint(ListNode head) {

        int size = 0;
        ListNode p = head;
        while (p!=null){
            p = p.next;
            size++;
        }
        int[] arr = new int[size];
        for (int i =arr.length-1;i>=0;i--){
            arr[i]=head.val;
            head=head.next;
        }

        return arr;
    }


    /**
     *
     * @param head
     * @return
     */
    public int[] reversePrint2(ListNode head) {

        //创建一个 ListNode 栈
        Stack<ListNode> stack = new Stack<ListNode>();
        //创建一个指向相同的链表listnode
        ListNode listNode = head;
        while (listNode!=null){
            stack.push(listNode);
            listNode = listNode.next;
        }
        int size = stack.size();
        int[] arr = new int[size];

        for (int i = 0 ;i<size;i++){
            arr[i] =stack.pop().val;
        }

        return arr;




    }
}
