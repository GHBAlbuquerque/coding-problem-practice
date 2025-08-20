package com.medium._17dailyTemperatures;

import java.util.Stack;

public class DailyTemperatures {

    public static int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> daysNotSolved = new Stack<>();

        for(int i=0; i<temperatures.length; i++){
            // add the first day
            if(i==0) {
                daysNotSolved.push(i);
                continue;
            }

            // while the current temperature is warmer then the one at the top of the stack,
            // I pop and add the difference
            while(!daysNotSolved.isEmpty()
                    && temperatures[i] > temperatures[daysNotSolved.peek()]) {
                result[daysNotSolved.peek()] = i - daysNotSolved.pop();

            }

            daysNotSolved.push(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] temps = new int[] {73,74,75,71,69,72,76,73};
        int[] result = dailyTemperatures(temps);

        for(int days : result)
        System.out.println(days);
    }
}
