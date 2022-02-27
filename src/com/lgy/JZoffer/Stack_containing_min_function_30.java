package com.lgy.JZoffer;

import java.util.Stack;

/**
 * 包含min函数的栈
 *
 * @author LGY
 * @create 2022-01-06 15:26
 */
public class Stack_containing_min_function_30 {
    // 定义两个栈，A为真正的栈， B为辅助栈
    Stack<Integer> A, B;

    public Stack_containing_min_function_30() {
        A = new Stack<>();
        B = new Stack<>();

    }

    public void push(int x) {

        A.add(x);
        if (B.isEmpty() || x <= B.peek()) {
            B.add(x);
        }
    }

    public void pop() {
        int a = A.pop();
        if (a == B.peek()) {
            B.pop();
        }

    }

    public int top() {
        return A.peek();

    }

    public int min() {

        return B.peek();
    }

}


