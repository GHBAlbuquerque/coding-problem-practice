package com.medium._14minStack;

import java.util.Stack;

// Stacks are first in last out (LIFO)
class MinStack {

    final private Stack<Integer> stack = new Stack<>();
    final private Stack<Integer> minStack = new Stack<>();

    public MinStack() {
    }

    public void push(int val) {
        //void push(int val) pushes the element val onto the stack.
        stack.push(val);

        if(minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        //void pop() removes the element on the top of the stack, the last one added.
        Integer popped = stack.pop();

        if(popped.equals(minStack.peek())) {
            minStack.pop();
        }
    }

    public int top() {
        // int top() gets the top element of the stack.
        return stack.peek();
    }

    public int getMin() {
        // int getMin() retrieves the minimum element in the stack.
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */