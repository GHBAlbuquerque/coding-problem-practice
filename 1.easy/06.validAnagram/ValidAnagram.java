import java.util.Map;
import java.util.HashMap;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character, Integer> frequencyCounter = new HashMap<>();

        for(Character letter : s.toCharArray()) {
            Integer count = frequencyCounter.get(letter);
            if(count != null) {
                frequencyCounter.put(letter, count + 1);
            } else {
                frequencyCounter.put(letter, 1);
            }
        }

        for(Character letter : t.toCharArray()) {
            Integer count = frequencyCounter.get(letter);
            if(count == null || count == 0) {
                return false;
            }

            frequencyCounter.put(letter, count - 1);
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(ValidAnagram.isAnagram(s, t));

        String u = "rat";
        String v = "car";

        System.out.println(ValidAnagram.isAnagram(u, v));

        String w = "aabbcc";
        String x = "aabbcd";

        System.out.println(ValidAnagram.isAnagram(w, x));
    }
}