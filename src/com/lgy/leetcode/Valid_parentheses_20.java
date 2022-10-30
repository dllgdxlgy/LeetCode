package com.lgy.leetcode;

import java.util.*;

public class Valid_parentheses_20 {


    public boolean isValid(String s) {

        if (s.length() % 2 == -1) {
            return false;
        }

        Map<Character, Character> pairs = new HashMap<>();
        pairs.put('}', '{');
        pairs.put(')', '(');
        pairs.put(']', '[');
        System.out.println(pairs);

        Deque<Character> stack = new LinkedList<Character>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (pairs.containsKey(ch)) {
                if (stack.isEmpty() || stack.peek() != pairs.get(ch)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        return stack.isEmpty();
    }


    /**
     * 第二刷
     *
     * @param s
     * @return
     */
    public boolean isValid_1(String s) {
        HashMap<Character, Character> map = new HashMap<>();

        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        int len = s.length();
        Stack<Character> stack = new Stack<>();
        int index = 0;
        while (index < len) {
            char c = s.charAt(index);
            index++;
            if (c == '{' || c == '(' || c == '[') {
                stack.add(c);
                continue;
            }
            char temp = map.get(c);
            if (!stack.isEmpty() && temp == stack.peek()) {
                stack.pop();

                continue;
            } else {
                return false;
            }

        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Valid_parentheses_20 vp = new Valid_parentheses_20();
        vp.isValid_1("{}");
    }
}
