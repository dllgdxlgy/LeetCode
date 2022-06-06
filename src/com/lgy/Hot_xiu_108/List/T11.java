package com.lgy.Hot_xiu_108.List;

import com.lgy.JZoffer.entity.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 11. 重排列表
 *
 https://www.nowcoder.com/practice/3d281d
 c0b3704347846a110bf561ef6b?tpId=188&&tqId=38321&
 rp=1&ru=/activity/oj&qru=/ta/job-code-high-week/question-ranking

 * @author LGY
 * @create 2022-06-05 21:26
 */
public class T11 {

    public void reorderList(ListNode head) {

        if(head == null){
            return;
        }
        List<ListNode> list = new ArrayList<>();

        while(head != null){
            list.add(head);
            head = head.next;
        }

        int left = 0;
        int right = list.size()-1;
        while(left < right){
            list.get(left).next = list.get(right);
            left++;
            if(left == right){
                break;
            }
            list.get(right).next = list.get(left);
            right--;
        }
        list.get(left).next = null;

    }
}
