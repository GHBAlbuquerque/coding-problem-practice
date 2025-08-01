package com.specifics.capitalOne._07findLongestSubstringWithoutRepeatingChars;

import java.util.*;

public class FindLongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        if(s == null) return 0;

        // I have to keep track of the letter i have already seen in this substring
        Set seen = new HashSet<Character>();
        int start  = 0; //for my sliding window
        int max = 0; // tracks maximum

        for(int i=0; i < s.length(); i++) {
            char character = s.charAt(i);

            if(!seen.contains(character)) {
                seen.add(s.charAt(i)); // if I haven't seen it yet, it is added
                int currentSize = i - start + 1; //+1 because if i = start, i have to include at least one character

                max = Math.max(max, currentSize); // gets maximum between the two
            } else {
                // remove the characters from the start until the duplicate character found is removed
                while(s.charAt(start) != character) {
                    seen.remove(s.charAt(start));
                    start++;
                }
                seen.remove(s.charAt(start)); //then remove the duplicate
                start++;

                seen.add(character); // add the current
            }

            //System.out.println(seen);
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(FindLongestSubstring.lengthOfLongestSubstring("abcdef"));      // 6
        System.out.println(FindLongestSubstring.lengthOfLongestSubstring("abcabcbb"));    // 3
        System.out.println(FindLongestSubstring.lengthOfLongestSubstring("bbbbb"));       // 1
        System.out.println(FindLongestSubstring.lengthOfLongestSubstring("pwwkew"));      // 3
        System.out.println(FindLongestSubstring.lengthOfLongestSubstring(""));            // 0
        System.out.println(FindLongestSubstring.lengthOfLongestSubstring(" "));           // 1
        System.out.println(FindLongestSubstring.lengthOfLongestSubstring("au"));          // 2
        System.out.println(FindLongestSubstring.lengthOfLongestSubstring("abba"));        // 2
        System.out.println("-------------------");
        System.out.println(FindLongestSubstring.lengthOfLongestSubstring("dvdf"));        // 3
        System.out.println(FindLongestSubstring.lengthOfLongestSubstring("anviaj"));      // 5
        System.out.println(FindLongestSubstring.lengthOfLongestSubstring("tmmzuxt"));     // 5
        System.out.println(FindLongestSubstring.lengthOfLongestSubstring("abcabcbbxyz")); // 4
        System.out.println(FindLongestSubstring.lengthOfLongestSubstring("abcade"));      // 5
        System.out.println(FindLongestSubstring.lengthOfLongestSubstring("123456123"));   // 6
        System.out.println(FindLongestSubstring.lengthOfLongestSubstring("a1b2c3d4"));    // 8
        System.out.println("-------------------");
        System.out.println(FindLongestSubstring.lengthOfLongestSubstring("a!b@c#"));      // 6
        System.out.println(FindLongestSubstring.lengthOfLongestSubstring("🙂🙃🙂🙃"));       // 2
        System.out.println(FindLongestSubstring.lengthOfLongestSubstring("我爱我家"));       // 3
        System.out.println(FindLongestSubstring.lengthOfLongestSubstring("a你b好c你"));     // 5
    }
}