package com.lgy.Hot_xiu_108.List;

import com.lgy.JZoffer.entity.ListNode;

/**
 * 8. 两个链表的第一个公共结点
 * @author LGY
 * @create 2022-06-05 18:07
 */
public class T8 {

    /**
     * 思路：
     *
     * 1. 创建一个相同的节点，
     * 2. 循环两遍，就会相交的，相交的节点就是相同的节点
     *  注意：这里链表1遍历完第一遍就要指向链表2，为不是还指向自己
     *
     * @param pHead1
     * @param pHead2
     * @return
     */
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {


        ListNode node_1 = pHead1;
        ListNode node_2 = pHead2;

        while(node_1 != node_2){
            node_1 = (node_1 == null)? pHead2:node_1.next;
            node_2 = (node_2 == null)? pHead1:node_2.next;
        }

        return node_1;
    }
}
