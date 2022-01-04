package com.lgy.JZoffer;

import com.lgy.JZoffer.entity.Node1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author LGY
 * @create 2022-01-04 14:30
 */
public class Replication_of_complex_linked_lists_35 {

    /**
     * 普通链表进行复制的步骤（非本题解释）
     *
     * @param head
     * @return
     */
    public Node1 copyRandomList_1(Node1 head) {


        // 1. 新建一个链表节点，值为-1。
        Node1 dum = new Node1(-1);

        // 2. 新建一个和头指针一样的东西
        Node1 cur = head;

        // 3. 创建一个节点的前一个节点
        Node1 pre = dum;

        while (cur != null) {
            Node1 node = new Node1(cur.val);
            pre.next = node;

            // pre.random = ????
            cur = cur.next;
            pre = node;
        }
        //遍历完事再把头节点赋值给 node1

        return dum.next;
    }


    /**
     * 特殊链表的复制
     *
     * @param head
     * @return
     */
    public Node1 copyRandomList(Node1 head) {
        if (head == null) {
            return head;
        }
        // 1. 创建一个 map 映射对应的节点
        Map<Node1, Node1> map = new HashMap<>();

        // 2. 头节点 再重新赋值一个。
        Node1 cur = head;

        // 3. 建立映射关系
        while (cur != null) {
            map.put(cur, new Node1(cur.val));
            cur = cur.next;
        }

        //
        cur = head;

        while (cur != null) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }

        return map.get(head);
    }


}
