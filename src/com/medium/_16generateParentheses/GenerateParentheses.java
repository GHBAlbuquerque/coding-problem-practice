package com.medium._16generateParentheses;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public static void generate(List<String> result, String currentString, int opencount, int closecount, int size) {
        if(currentString.length() == size * 2) {
            result.add(currentString);
            return;
        }

        if(opencount < size) {
            generate(result, currentString + "(", opencount+1, closecount, size);
        }
        if(closecount < opencount) {
            generate(result, currentString + ")", opencount, closecount+1, size);
        }
    }


    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();

        generate(result, "", 0, 0, n);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }

}
