package com.specifics.capitalOne._02fibonacciSequence;//F(n) = F(n - 1) + F(n - 2), for n > 1.
//Given n, calculate F(n).

public class FibonnaciSequence {

    public static int fib(int n) {
        if(n<=1) return n;

        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fib(5));
        System.out.println(fib(6));
        System.out.println(fib(8));
    }
}