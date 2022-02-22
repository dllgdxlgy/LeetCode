package com.lgy.Hot_100;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author LGY
 * @create 2022-02-22 23:58
 */
public class T142 {
    public ListNode detectCycle(ListNode head) {


        if (head == null || head.next == null) {
            return null;
        }

        HashSet<ListNode> set = new HashSet<>();
        ListNode listNode = head;


        while (listNode != null) {

           if (!set.add(listNode)){
               return listNode;
           }
           listNode = listNode.next;

        }


        return null;
    }
}
