package com.lgy.JZoffer;

import com.lgy.JZoffer.entity.ListNode;

import java.util.Stack;

/**
 * @author LGY
 * @create 2021-12-23 12:33
 */
public class Print_linked_list_from_beginning_to_end_06 {

    /**
     *
     * @param head
     * @return
     */
    public int[] reversePrint(ListNode head) {

        // 1. 获取链表的长度
        int size = 0;
        // 2. 创造一个指向链表的头指针
        ListNode p = head;
        // 循环条件是：链表不为空时
        while (p != null){
            p = p.next;
            size++;
        }
        // 3. 利用获取的长度，创造一个相同的数组
        int[] arr = new int[size];

        // 4. 数组从后向前填写，再遍历链表
        for (int i = arr.length-1; i >= 0; i--){
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

        // 1. 创建一个 ListNode 栈
        Stack<ListNode> stack = new Stack<ListNode>();
        // 2. 创建一个指向相同的链表listnode
        ListNode listNode = head;
        while (listNode!=null){
            // 3. 把所有元素放入栈中
            stack.push(listNode);
            listNode = listNode.next;
        }
        // 4. 获取栈的长度
        int size = stack.size();
        // 5. 创建栈的空间
        int[] arr = new int[size];

        // 6. 弹出栈后进入数组
        for (int i = 0 ;i<size;i++){
            arr[i] =stack.pop().val;
        }
        // 7. 返回数组
        return arr;




    }
}
