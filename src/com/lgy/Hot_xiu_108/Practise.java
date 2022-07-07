package com.lgy.Hot_xiu_108;

import com.lgy.JZoffer.entity.ListNode;
import com.lgy.JZoffer.entity.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 练习专用
 * @author LGY
 * @create 2022-07-04 15:35
 */
public class Practise {

    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode root = new ListNode(0);
        ListNode temp = null;
        ListNode left = head;
        ListNode right = head;



        Stack<ListNode> stack = new Stack<>();


        return  null;
    }

    public int strStr(String haystack, String needle) {
        if(needle == ""){
            return 0;
        }
        if(needle.length() > haystack.length()){
            return -1;
        }
        int len = needle.length();
        for(int i = 0; i<haystack.length();i++){
            if(i + len > haystack.length()){
                break;
            }
            if (haystack.charAt(i) == needle.charAt(0)){
                if (haystack.substring(i,i+len).equals(needle))
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Practise practise = new Practise();
        int i = practise.strStr("mississippi", "issipi");
//
//        String str = "mississippi";
//        String substring = str.substring(4,10);
//        String s = "mississippi";
//        String s1 = "issipp";
//        System.out.println(substring.equals(s1));
        //System.out.println(substring);
        System.out.println(i);
        ConcurrentHashMap map = new ConcurrentHashMap();
    }


}
