package com.lgy.Hot_xiu_108.List;

import com.lgy.JZoffer.entity.ListNode;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 12.  删除有序链表中重复的元素-I
 *
 https://www.nowcoder.com/practice/c087914fae
 584da886a0091e877f2c79?tpId=188&&tqId=38342&rp=
 1&ru=/activity/oj&qru=/ta/job-code-high-week/question-ranking
 *
 * @author LGY
 * @create 2022-06-05 21:27
 */
public class T12 {

    /**
     * 自己做的
     * @param head
     * @return
     */
    public ListNode deleteDuplicates (ListNode head) {
        if(head == null){
            return head;
        }
        // write code here
        ListNode left = head;
        ListNode right = head.next;

        while(right != null){
            if(left.val == right.val){
                right = right.next;
                left.next = right;
                continue;
            }
            if(left.next == right){
                left = right;
                right = right.next;
                continue;
            }
        }
        return head;
    }


    /**
     * 自己优化后的代码
     * @param head
     * @return
     */
    public ListNode deleteDuplicates_1 (ListNode head) {
        if(head == null){
            return head;
        }
        // write code here
        ListNode left = head;
        ListNode right = head.next;

        while(right != null){
            if(left.val == right.val){
                right = right.next;
                left.next = right;
                continue;
            }else{
                left = right;
                right = right.next;
            }
        }
        return head;
    }


}
