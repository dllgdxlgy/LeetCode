package com.lgy.leetcode;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Valid_parentheses_20 {
    public boolean isValid(String s) {

        if(s.length()%2==-1){return false;}

        Map<Character,Character> pairs = new HashMap<>();
        pairs.put('}','{');
        pairs.put(')','(');
        pairs.put(']','[');
        System.out.println(pairs);

        Deque<Character> stack = new LinkedList<Character>();
        for (int i = 0; i<s.length();i++){
            char ch = s.charAt(i);
            if (pairs.containsKey(ch)){
                if (stack.isEmpty()||stack.peek()!=pairs.get(ch)){
                return false;
                }
                stack.pop();
            }else {
                stack.push(ch);
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Valid_parentheses_20 vp = new Valid_parentheses_20();
        vp.isValid("[][]");
    }
}
