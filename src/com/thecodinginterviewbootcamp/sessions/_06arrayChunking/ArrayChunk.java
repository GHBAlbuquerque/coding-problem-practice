package com.thecodinginterviewbootcamp.sessions._06arrayChunking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// --- Directions
// Given an array and chunk size, divide the array into many subarrays
// where each subarray is of length size
// --- Examples
// chunk([1, 2, 3, 4], 2) --> [[ 1, 2], [3, 4]]
// chunk([1, 2, 3, 4, 5], 2) --> [[ 1, 2], [3, 4], [5]]
// chunk([1, 2, 3, 4, 5, 6, 7, 8], 3) --> [[ 1, 2, 3], [4, 5, 6], [7, 8]]
// chunk([1, 2, 3, 4, 5], 4) --> [[ 1, 2, 3, 4], [5]]
// chunk([1, 2, 3, 4, 5], 10) --> [[ 1, 2, 3, 4, 5]]

public class ArrayChunk {

    public static List<List<Integer>> chunk(int[] array, int size) {
        List<List<Integer>> response = new ArrayList<>();

        for(int number : array) {
            // checks if the last chunk still has space (or whether it exists)
            List<Integer> lastChunk = response.isEmpty()? null : response.get(response.size()-1);

            // if does not exist or if full, add new chunk
            if(lastChunk == null || lastChunk.size() >= size) {
                List<Integer> newChunk = new ArrayList<>();
                newChunk.add(number);
                response.add(newChunk);
            //if not full, add current number
            } else {
                lastChunk.add(number);
            }
        }

        return response;
    }

    public static List<List<Integer>> chunkSol1(int[] array, int size) {
        List<List<Integer>> response = new ArrayList<>();

        List<Integer> chunk = new ArrayList<>();
        for(int number : array) {
            if(chunk.size() < size) {
                chunk.add(number);
            } else {
                response.add(chunk);
                chunk = new ArrayList<>();
                chunk.add(number);
            }
        }

        if(!chunk.isEmpty()) response.add(chunk);

        return response;
    }

    public static List<List<Integer>> chunkSol2Sublist(int[] array, int size) {
        List<Integer> input = new ArrayList<>(Arrays.stream(array).boxed().toList());
        List<List<Integer>> response = new ArrayList<>();

        int index = 0;
        while(index < input.size()) {
            if(index+size > input.size()) {
                List<Integer> sublist = input.subList(index, input.size());
                response.add(sublist);
                break;
            }

            //from (inclusive) to (exclusive)
            List<Integer> sublist = input.subList(index, index+size);
            response.add(sublist);

            index += size;
        }

        return response;
    }

    public static void main(String[] args) {
        // Test: function chunk exists
        System.out.println("Test: chunk method exists -> " + (ArrayChunk.class != null));

        // Test: chunk divides an array of 10 elements with chunk size 2
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        List<List<Integer>> chunked1 = chunk(arr1, 2);
        System.out.println("Input: " + Arrays.toString(arr1));
        System.out.println("Expected: [[1,2],[3,4],[5,6],[7,8],[9,10]]");
        System.out.println("Actual: " + chunked1);
        System.out.println();

        // Test: chunk divides an array of 3 elements with chunk size 1
        int[] arr2 = {1,2,3};
        List<List<Integer>> chunked2 = chunk(arr2, 1);
        System.out.println("Input: " + Arrays.toString(arr2));
        System.out.println("Expected: [[1],[2],[3]]");
        System.out.println("Actual: " + chunked2);
        System.out.println();

        // Test: chunk divides an array of 5 elements with chunk size 3
        int[] arr3 = {1,2,3,4,5};
        List<List<Integer>> chunked3 = chunk(arr3, 3);
        System.out.println("Input: " + Arrays.toString(arr3));
        System.out.println("Expected: [[1,2,3],[4,5]]");
        System.out.println("Actual: " + chunked3);
        System.out.println();

        // Test: chunk divides an array of 13 elements with chunk size 5
        int[] arr4 = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        List<List<Integer>> chunked4 = chunk(arr4, 5);
        System.out.println("Input: " + Arrays.toString(arr4));
        System.out.println("Expected: [[1,2,3,4,5],[6,7,8,9,10],[11,12,13]]");
        System.out.println("Actual: " + chunked4);
        System.out.println();
    }
}
