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
}
