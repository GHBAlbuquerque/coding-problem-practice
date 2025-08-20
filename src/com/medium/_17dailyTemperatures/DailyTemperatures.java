package com.medium._17dailyTemperatures;

import java.util.Stack;

/*
1) I get an array of daily temperatures
2) I have to get how many days, from that day im checking, i have to wait to get a warmer day -> the difference between indexes!
3) I need to iterate over the array of temperatures
4) i create a stack to keep track of the indexes that came before
5) If the stack is empty, I add the first value and continue
6) I go to next number and see if it is bigger than what is in the stack (peek)
    - if my current temp is bigger than the temperature in the stack (temperature[stack.peek()]]
   -  I add to my result the difference between the current index and the one that is on top

    >> THE CATCH: if I have advanced multiple days, and found a warmer day, I have to do this until my stack becomes empty (remove all the colder days from before)
   - so this logic is inside a while!

8) i always add the day im currently looking to the stack
 */

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
