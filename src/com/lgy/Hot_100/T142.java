package com.lgy.Hot_100;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

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

    public ListNode detectCycle_1(ListNode head) {

        if (head == null || head.next == null){
            return null;
        }
        Set<ListNode> set = new HashSet<>();
        ListNode node = head;
        ListNode temp = null;
        while (node != null){

            boolean add = set.add(node);
            temp = node;
            if (!add){
                return temp;
            }
            node = node.next;
        }
        return null;
    }
    /**
     * 解释：为何慢指针第一圈走不完一定会和快指针相遇：
     * 首先，第一步，快指针先进入环
     * 第二步：当慢指针刚到达环的入口时，快指针此时在环中的某个位置(也可能此时相遇)
     * 第三步：设此时快指针和慢指针距离为x，若在第二步相遇，则x = 0；
     * 第四步：设环的周长为n，那么看成快指针追赶慢指针，需要追赶n-x；
     * 第五步：快指针每次都追赶慢指针1个单位，设慢指针速度1/s，快指针2/s，那么追赶需要(n-x)s
     * 第六步：在n-x秒内，慢指针走了n-x单位，因为x>=0，则慢指针走的路程小于等于n，即走不完一圈就和快指针相遇.
     */
    /**
     * 快慢指针
     *
     * @param head
     * @return
     */
    public ListNode detectCycle_2(ListNode head) {


        return null;
    }
}
