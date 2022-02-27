package com.lgy.JZoffer;

import java.util.Stack;

/**
 * 栈的压入、弹出序列
 *
 * @author LGY
 * @create 2022-01-06 16:06
 */
public class Push_pop_sequence_of_stack_31 {

    public boolean validateStackSequences(int[] pushed, int[] popped) {

        // 创建一个栈
        Stack<Integer> stack = new Stack<>();


        int j = 0;
        for (int i = 0; i < pushed.length; i++) {

            // 先把元素放进去
            stack.push(pushed[i]);
            while (!stack.isEmpty() && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }


        }


        return stack.isEmpty();

    }
}
