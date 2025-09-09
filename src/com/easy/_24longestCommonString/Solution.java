package com.easy._24longestCommonString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {

    public static String longestCommonPrefix(String[] strs) {
        List<String> list = new ArrayList<>(Arrays.asList(strs));
        list.sort(Comparator.comparingInt(String::length).reversed());

        StringBuilder prefix = new StringBuilder();

        for(int i=0; i<list.get(0).length();i++){
            boolean append = true;
            Character current = list.get(0).charAt(i);

            for(String word : list) {
                if(word.length() <= i || word.charAt(i) != current) {
                    append = false;
                    break;
                }
            }

            if(!append) break;

            prefix.append(current);
        }

        return prefix.toString();
    }

    public static void main(String[] args) {
        String[] words = new String[]{"flower","flow","flight"};

        System.out.println(longestCommonPrefix(words));

        String[] words2 = new String[]{"cir","car"};
        System.out.println(longestCommonPrefix(words2));
    }
}