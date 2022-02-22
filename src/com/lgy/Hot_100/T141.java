package com.lgy.Hot_100;

import java.util.HashSet;
import java.util.Set;

/**
 * @author LGY
 * @create 2022-02-22 23:08
 */
public class T141 {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        Set<ListNode> set = new HashSet<>();
        ListNode listNode = head;
        while (listNode != null){
            if (!set.add(listNode)){
                return  true;
            }
            listNode = listNode.next;
        }


        return false;
    }
}
