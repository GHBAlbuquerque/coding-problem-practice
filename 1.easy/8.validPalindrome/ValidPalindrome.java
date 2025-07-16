public class ValidPalindrome {

    public static void testValidatePalindrome(String s) {
        Boolean result = ValidPalindrome.validatePalindrome(s);
        System.out.printf("The %s string result is: %s", s, result);
    }

    public static Boolean validatePalindrome(String s) {
        if(s == null) return false;

        int right = s.length() -1;
        int left = 0;

        while(right > left) { //while right bigger than left, compare
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))) left++; //check from the left until you find a letter
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))) right--; // check from the right until you find a letter

            //System.out.printf("left now is %s position %s\n", s.charAt(left), left);
            //System.out.printf("right now is %s position %s\n", s.charAt(right), right);

            if(Character.toLowerCase(s.charAt(left)) !=
                    Character.toLowerCase(s.charAt(right))) return false; //check if equal

            left++; //increment
            right--; // decrement
        }

        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome.testValidatePalindrome("A man, a plan, a canal: Panama");
    }
}