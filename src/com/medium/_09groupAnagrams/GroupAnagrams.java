package com.medium._09groupAnagrams;

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>(); // create a map that will have sorted string as key

        for(String string : strs) {
            System.out.println(string);

            char[] charArray = string.toCharArray(); // make it a char array
            Arrays.sort(charArray); // use sorting on it
            String current = new String(charArray); // turn to string again

            System.out.println(current);

            if(anagrams.get(current) == null) { // check if i have this key (sorted string)
                List<String> list = new ArrayList<>(); //if not, create list
                list.add(string); // add the string (unsorted to it)
                anagrams.put(current, list); //add it to the map with the sorted one as key
            } else {
                anagrams.get(current).add(string); // if i have, add to the list
            }
        }

        return anagrams.values().stream().toList(); // return the values
    }

    public static void main(String[] args) {
        String[] strs = new String[] {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> groupedAnagrams = GroupAnagrams.groupAnagrams(strs);

        System.out.println(groupedAnagrams.size());
        groupedAnagrams.forEach(anagrams -> System.out.println(anagrams));
    }
}
