package com.medium._08encodeDecodeString;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecodeStrings {

    public static String encode(List<String> strs) {
        if (strs == null || strs.size() == 0) {
            return "";
        }

        StringBuilder encoded = new StringBuilder();
        String separator = "#";

        for(String str : strs) {
            int length = str.length();
            encoded.append(length).append(separator).append(str);
        }

        return encoded.toString();
    }

    public static List<String> decode(String s) {
        List<String> strs = new ArrayList<>();

        int i = 0;
        while(i < s.length()) {
            if(Character.isDigit(s.charAt(i))) {
                String numbers = "";
               while(Character.isDigit(s.charAt(i))) {
                   numbers+= s.charAt(i);
                   i++;
               }

               if(s.charAt(i) == '#'){
                   int size = Integer.valueOf(numbers);
                   String word = s.substring(i+1, i+1+size);
                   strs.add(word);
                   i+=size;
               }
            }
            i++;
        }

        return strs;
    }

    public static void main(String[] args) {
        List<String> strs = List.of("hello", "world");

        String encoded = EncodeDecodeStrings.encode(strs);
        List<String> decoded =EncodeDecodeStrings.decode(encoded);

        System.out.println(encoded);
        System.out.println(decoded);


        List<String> strs2 = List.of("125fhdjgvstef", "dmeklnfbsgee");

        String encoded2 = EncodeDecodeStrings.encode(strs2);
        List<String> decoded2 =EncodeDecodeStrings.decode(encoded2);

        System.out.println(encoded2);
        System.out.println(decoded2);
    }
}
