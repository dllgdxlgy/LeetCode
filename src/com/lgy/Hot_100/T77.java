package com.lgy.Hot_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class T77 {

    public ListNode sortList(ListNode head) {
        //特殊条件判断
        if (head == null){
            return head;
        }
        //创建节点
        ListNode listNode = new ListNode(0);
        listNode = head;
        //统计数量
        int num =0;
        while (listNode!=null){
            listNode = listNode.next;
            num++;
        }
        listNode = head;
        int j = 0;
        int[] arr = new int[num];
        while (listNode!=null){
            arr[j] = listNode.val;
            listNode = listNode.next;
            j++;
        }
        Arrays.sort(arr);


        listNode = head;
        for (int i = 0; i < num; i++) {
            listNode.next = new ListNode(arr[i]);
            listNode = listNode.next;

        }
        return head.next;

    }

    public ListNode sortList_1(ListNode head) {
        List<Integer> list=new ArrayList<>();
        ListNode cur = head;
        while(cur!=null){
            list.add(cur.val);
            cur=cur.next;
        }
        Collections.sort(list);
        ListNode p=head;
        for(int a=0;a<list.size();a++){
            p.val=list.get(a);
            p=p.next;
        }
        return head;
    }
}
