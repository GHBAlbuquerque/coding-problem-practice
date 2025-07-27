import java.util.*;

public class FindLongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        if(s == null) return 0;

        // I have to keep track of the letter i have already seen in this substring
        Set seen = new HashSet<Character>();
        int longest  = 0;
        int count = 0;

        for(Character character : s.toCharArray()) {
            // if letter already seen, starts over
            if(seen.contains(character)) {
                seen = new HashSet<Character>();
                seen.add(character);
                count = 1; // stars over counting for this substring

            // Add the current character if not repeated and increment longest
            } else {
                seen.add(character);
                count++;
            }

            //System.out.println(seen.toString());
            if(longest < count) { // pass the value to longest if it is bigger
                longest = count;
            }
        }

        return longest;
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
        System.out.println(FindLongestSubstring.lengthOfLongestSubstring("abcabcbbxyz")); // 6
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