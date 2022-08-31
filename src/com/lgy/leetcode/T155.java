package com.lgy.leetcode;

import java.util.Stack;

/** T155 最小栈
 * @author LGY
 * @create 2022-08-31 16:19
 */
public class T155 {

    class MinStack {

        Stack<Integer> stack = null;
        Stack<Integer> minStack = null;
        public MinStack() {
            stack = new Stack<>();
            minStack = new Stack<>();
            minStack.push(Integer.MAX_VALUE);
        }

        public void push(int val) {
            stack.push(val);
            if(minStack.peek() < val){
                minStack.push(minStack.peek());
            }else{
                minStack.push(val);
            }
        }

        public void pop() {
            stack.pop();
            minStack.pop();
        }

        public int top() {
            return stack.peek();

        }

        public int getMin() {
            return minStack.peek();

        }
    }
}
