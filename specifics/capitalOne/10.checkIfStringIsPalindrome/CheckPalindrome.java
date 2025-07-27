public class CheckPalindrome {

    public static boolean check(String s) {
        if(s == null) return false;

        int start = 0;
        int end = s.length() -1;

        while(end > start) {
            while(end > start && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }

            while(end > start && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }

            if(Character.toLowerCase(s.charAt(start)) !=
                    Character.toLowerCase(s.charAt(end))) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }


    public static void main(String[] args) {
        System.out.println(CheckPalindrome.check("A man, a plan, a canal: Panama"));
        System.out.println(CheckPalindrome.check("race a car"));
        System.out.println(CheckPalindrome.check(" "));
    }
}