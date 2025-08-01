package com.specifics.capitalOne._06implementStackUsingLinkedList;

import java.util.*;

class MyStack {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    public MyStack() {

    }

    public void push(int x) {
        q1.add(x);
    }

    public int pop() {
        System.out.println("pop q1: " + q1.toString());
        System.out.println("pop q2: " + q2.toString());
        // removes all elements from the first list and passes to the second
        int q1Size = q1.size();
        for(int i=0; i<q1Size-1; i++) {
            q2.add(q1.poll());
        }

        System.out.println("pop q1: " + q1.toString());
        System.out.println("pop q2: "+ q2.toString());

        // gets first elements
        int top = q1.poll();

        // gives back all the elements except the first
        q1 = q2;
        q2 = new LinkedList<>();

        System.out.println("pop q1: " + q1.toString());
        System.out.println("pop q2: " + q2.toString());
        System.out.println(top);
        // returns the first element
        return top;
    }

    public int top() {
        System.out.println("top q1: " + q1.toString());
        System.out.println("top q2: " + q2.toString());
        // remover all elements from the first list and passes to the second
        int q1Size = q1.size();
        for(int i=0; i<q1Size-1; i++) {
            q2.add(q1.poll());
        }

        System.out.println("top q1: " + q1.toString());
        System.out.println("top q2: " + q2.toString());

        // only sees first element without removing
        int top = q1.peek();

        // gives back all the elements
        q1 = q2;
        q1.add(top);
        q2 = new LinkedList<>();

        System.out.println("top q1: " + q1.toString());
        System.out.println("top q2: "+ q2.toString());
        System.out.println(top);
        // returns the first element
        return top;
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}

public class StackUsingQueue {

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        System.out.println("stack top: "  + stack.top());
        System.out.println("stack pop: "  + stack.pop());
        System.out.println("stack empty: "  + stack.empty());
    }
}