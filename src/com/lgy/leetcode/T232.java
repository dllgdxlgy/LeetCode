package com.lgy.leetcode;

import java.util.Stack;

/**
 * @author LGY
 * @create 2022-08-25 20:35
 */
public class T232 {
    private Stack<Integer> stack1 = null;
    private Stack<Integer> stack2 = null;

    public T232() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.add(x);
    }

    public int pop() {
        while(!stack1.isEmpty()){
            stack2.add(stack1.pop());
        }
        int res = stack2.pop();
        while(!stack2.isEmpty()){
            stack1.add(stack2.pop());
        }
        return res;
    }

    public int peek() {
        while(!stack1.isEmpty()){
            stack2.add(stack1.pop());
        }
        int temp = stack2.peek();
        while(!stack2.isEmpty()){
            stack1.add(stack2.pop());
        }
        return temp;
    }

    public boolean empty() {
        if(stack1.isEmpty() && stack2.isEmpty()){
            return true;
        }else {
            return false;
        }

    }
}
