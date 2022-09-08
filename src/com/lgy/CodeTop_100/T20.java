package com.lgy.CodeTop_100;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author LGY
 * @create 2022-07-16 10:29
 */
public class T20 {

    public boolean isValid(String s) {

        if (s.length() % 2 == 1) {
            return false;
        }
        Stack<Character> stack = new Stack();
        HashMap<Character, Character> map = new HashMap<>();

        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (!stack.isEmpty() && !stack.pop().equals(map.get(s.charAt(i)))) {
                    return false;
                }
            }

        }
//        if (!stack.isEmpty()) {
////            return false;
////        }
////        return true;
        return stack.isEmpty();
    }

    /**
     * 第二遍
     *
     * @param s
     * @return
     */
    public boolean isValid_2(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');

        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
                continue;
            }
            if (!stack.isEmpty()) {
                if (map.get(c) == stack.peek()) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                return false;
            }

        }
        return stack.isEmpty();

    }

    public static void main(String[] args) {
        String s = "(){}[]";
        T20 t20 = new T20();
        boolean valid_2 = t20.isValid_2(s);
    }
}
