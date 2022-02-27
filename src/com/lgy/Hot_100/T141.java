package com.lgy.Hot_100;

import java.util.HashSet;
import java.util.Set;

/**
 * @author LGY
 * @create 2022-02-22 23:08
 */
public class T141 {
    /**
     * 普通方法
     *
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        Set<ListNode> set = new HashSet<>();
        ListNode listNode = head;
        while (listNode != null) {
            if (!set.add(listNode)) {
                return true;
            }
            listNode = listNode.next;
        }


        return false;
    }

    /**
     * 快慢指针
     *
     * @param head
     * @return
     */
    public boolean hasCycle_1(ListNode head) {

        // 特例判断
        if (head == null || head.next == null) {
            return false;
        }
        ListNode list= head;
        ListNode list2= head.next;
        while (list != list2){
            if (list == null || list2.next == null){
                return false;
            }
            list = list.next;
            list2 = list2.next.next;
        }
        return true;

    }
}
