package dev.yudin.string;

import java.util.ArrayList;
import java.util.List;

public class ValidParentheses {

    public static void main(String[] args) {

        //true
        String input = "()";
        System.out.println(isValid(input));

        //true
        String input1 = "()[]{}";
        System.out.println(isValid(input1));

        //false
        String input2 = "(]";
        System.out.println(isValid(input2));

        //true
        String input3 = "{[]}";
        System.out.println(isValid(input3));

        //false
        String input4 = "([)]";
        System.out.println(input4);
    }

    public static boolean isValid(String input) {
        List<String> parentheses = new ArrayList<>();
        {
            parentheses.add("{}");
            parentheses.add("()");
            parentheses.add("[]");
        }
        String [] symbols = input.split("");
        int amountParentheses = symbols.length;
        int counterParentheses = 0;

        if (amountParentheses % 2 != 0) {
            return false;
        } else {
            for (int firstPointer = 0; firstPointer < input.length(); firstPointer++) {
                for (int secondPointer = firstPointer + 1; secondPointer < input.length(); secondPointer++) {

                    String result = symbols[firstPointer] + symbols[secondPointer];

                    if (parentheses.contains(result)) {
                        counterParentheses++;
                    }
                }
            }
            if (amountParentheses / 2 == counterParentheses) {
                return true;
            } else {
                return false;
            }
        }
    }
}
