public class ReverseString {

    public static void reverseString(char[] s) {
        int indexStart = 0;
        int indexEnd = s.length-1;

        while(indexEnd > indexStart) {
            char temp = s[indexEnd];
            s[indexEnd] = s[indexStart];
            s[indexStart] = temp;

            indexStart++;
            indexEnd--;
        }
    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        System.out.println(s);
    }
}