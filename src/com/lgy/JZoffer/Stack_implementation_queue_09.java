package com.lgy.JZoffer;

import java.util.Stack;

/**
 *  用两个栈实现队列
 *
 */
class CQueue {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public CQueue() {
        stack1 = new Stack();
        stack2 = new Stack();
    }

    public void appendTail(int value) {

        stack1.push(value);

    }

    public int deleteHead() {

        if (stack1.empty()) {
            return -1;
        }
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        int delete = stack2.pop();
        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
        return delete;
    }

}
/**
 * @author LGY
 * @create 2021-12-24 13:21
 */
public class Stack_implementation_queue_09 {



}
