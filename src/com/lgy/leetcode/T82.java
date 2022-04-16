package com.lgy.leetcode;

/**
 * 删除链表中重复的数字
 */

import java.util.*;

public class T82 {
    public ListNode deleteDuplicates(ListNode head) {
        //特殊条件判断
        if (head == null || head.next == null){
            return head;
        }

        ListNode temp = head;
        Map<Integer,Integer> map = new HashMap<>();
        while (temp != null){
            map.put(temp.val,map.getOrDefault(temp.val,0)+1);
            temp = temp.next;
        }
        List<Integer> list = new LinkedList<>();
        for (Integer key: map.keySet()) {
            if (map.get(key) == 1){
                list.add(key);
            }
        }
        if(list.size() == 0){
            return null;
        }
        //Integer[] array = (Integer[]) list.toArray();
        Collections.sort(list);

        ListNode listNode_1 = head;
        for (int i = 0; i < list.size(); i++) {
            head.next=  new ListNode(list.get(i));
            head = head.next;
        }
        return listNode_1.next;

    }
    public ListNode deleteDuplicates_1(ListNode head) {
//        List<Integer> lists = new ArrayList<>();
//        lists.add(1);
//        lists.add(5);
//        lists.add(2);
//        System.out.println(lists.toString());
//        //排序，直接调用sort方法排序，排序方式是自燃排序，即升序排序
//        Collections.sort(lists, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return (o1 < o2) ? 1:(o1 == o2 ? 0:-1);
//            }
//        });
//        System.out.println(lists.toString());
//        Map<Integer,Integer> map = new HashMap<>();
//        map.put(1,1);
//        map.put(31,1);
//        map.put(2,1);
//        map.put(5,1);
//        map.put(24,1);
//        map.put(6,1);
//        Set<Integer> set = map.keySet();
//        for (Integer i : set) {
//            System.out.println(i);
//        }
        //特殊条件判断
//        if (head == null || head.next == null){
//            return head;
//        }
//        if (head.val == head.next.val){
//            ListNode temp = head.next;
//            while (temp.val == head.val && temp!=null){
//                temp = temp.next;
//            }
//            return deleteDuplicates_1(temp);
//        }else {
//            head.next = deleteDuplicates_1(head.next);
//            return head;
//        }

        if (head == null || head.next == null){
            return head;
        }
        if (head.val == head.next.val){
            ListNode temp = head.next.next;
            while ( temp != null && head.val == temp.val){
                temp = temp.next;
            }
            return deleteDuplicates_1(temp);
        }else {
            head.next = deleteDuplicates_1(head.next);
            return head;
        }

  }
}
