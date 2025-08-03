package com.medium._10topKFrequentElements;

import java.util.*;

public class TopKFrequentElements {

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counter = new HashMap<>(); // keeps count of elements

        Queue<Map.Entry<Integer, Integer>> topK = new PriorityQueue<>( // keep the k elements with highest frequency
                Comparator.comparingInt(entry -> entry.getValue()) //uses a comparator to check values and order
        ); // the pirority-queue is min-heap by default, meaning smaller values stay at the top

        for(int num : nums) { // will get the count for each element
            if(counter.get(num) == null) {
                counter.put(num, 1); // if its not there yet, add
            } else {
                int currentCount = counter.get(num)+1;
                counter.put(num, currentCount); // add to count
            }
        }

        for(Map.Entry<Integer, Integer> entry : counter.entrySet()) { // for each entry, will put in the priority queue
            topK.offer(entry); // offer
            if(topK.size() > k) { // check if the size has increased
                topK.poll(); // remove the smallest one
            }
        }

        int[] result = new int[k]; // have to turn into array
        for(int i=0; i<k; i++) {
            result[i] = topK.poll().getKey();
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1,1,1,2,2,3};

        int[] result = TopKFrequentElements.topKFrequent(nums, 2);
        System.out.println(Arrays.toString(result));
    }
}
