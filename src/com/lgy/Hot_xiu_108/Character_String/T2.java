package com.lgy.Hot_xiu_108.Character_String;

import java.util.HashMap;
import java.util.Stack;

/**
 * T2. 有效括号序列
 * <p>
 * https://www.nowcoder.com/practice/37548e94a270412c8b9fb85643c8cc
 * c2?tpId=188&&tqId=38303&rp=1&ru=/activity/oj&qru=/ta/job-code-high-week/question-ranking
 *
 * @author LGY
 * @create 2022-06-14 09:48
 */
public class T2 {


    /**
     * 推荐的做法
     *
     * @param s
     * @return
     */
    public boolean isValid(String s) {

        if (s.length() % 2 == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();

        HashMap<Character, Character> map = new HashMap<>();

        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                //stack.pop() 推出一个元素
                if (map.get(s.charAt(i)).equals(stack.pop())) {
                    continue;
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    /**
     * labuladong的做法
     *
     * @param s
     * @return
     */
    public boolean isValid_1(String s) {
        // write code hereck

        Stack<Character> stack = new Stack<>();

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(' || arr[i] == '{' || arr[i] == '[') {
                stack.push(arr[i]);
            } else {
                if (!stack.empty() && leftof(arr[i]) == stack.peek()) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    public char leftof(char c) {
        if (c == ')') return '(';
        if (c == '}') return '{';
        return '[';
    }
}
