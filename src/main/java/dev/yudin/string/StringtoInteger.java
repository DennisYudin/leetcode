package dev.yudin.string;

import java.util.ArrayList;
import java.util.List;

public class StringtoInteger {

    public static void main(String[] args) {
        List<Character> vowels = new ArrayList<>();
        {
            vowels.add('a');
            vowels.add('e');
            vowels.add('i');
            vowels.add('o');
            vowels.add('u');
        }
        String input1 = "42";
        System.out.println("expected: " + 42);
        System.out.println("actual: " + myAtoi(input1));
        System.out.println();

//        String input2 = "   -42";
//        System.out.println("expected: " + -42);
//        System.out.println("actual: " + myAtoi(input2));
//        System.out.println();

//        String input3 = "4193 with words";
//        System.out.println("expected: " + 4193);
//        System.out.println("actual: " + myAtoi(input3));
//        System.out.println();
//        //0
//        String input4 = "words and 987";
//        System.out.println("expected: " + 0);
//        System.out.println("actual: " + myAtoi(input4));
//        System.out.println();
//
//        String input6 = "3.14159";
//        System.out.println("expected: " + 3);
//        System.out.println("actual: " + myAtoi(input6));
//        System.out.println();
//        //0
//        String input8 = "";
//        System.out.println("expected: " + 0);
//        System.out.println("actual: " + myAtoi(input8));
//        System.out.println();
//        //0
//        String input9 = "-";
//        System.out.println("expected: " + 0);
//        System.out.println("actual: " + myAtoi(input9));
//        System.out.println();
//        //1
//        String input10 = "1";
//        System.out.println("expected: " + 1);
//        System.out.println("actual: " + myAtoi(input10));
//        System.out.println();
//        //1
//        String input11 = "+1";
//        System.out.println("expected: " + 1);
//        System.out.println("actual: " + myAtoi(input11));
//        System.out.println();
//        //0
//        String input7 = "+-12";
//        System.out.println("expected: " + 0);
//        System.out.println("actual: " + myAtoi(input7));
//        System.out.println();
//
//        String input5 = "-91283472332";
//        System.out.println("expected: " + -2147483648);
//        System.out.println("actual: " + myAtoi(input5));
//        System.out.println();
//
//        String input12 = "21474836460";
//        System.out.println("expected: " + 2147483647);
//        System.out.println("actual: " + myAtoi(input12));
//        System.out.println();
//
//        String input13 = "  -0012a42";
//        System.out.println("expected: " + -12);
//        System.out.println("actual: " + myAtoi(input13));
//        System.out.println();
//
//        String input14 = "   +0 123";
//        System.out.println("expected: " + 0);
//        System.out.println("actual: " + myAtoi(input14));
//        System.out.println();
    }

    public static int myAtoi(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        char[] symbols = s.toCharArray();

        if (s.contains(".")) {
            float result = Float.parseFloat(s);
            return (int) result;
        }
        if (Character.isLetter(symbols[0])) {
            return 0;
        }
        String result = "";
        int pointer = 0;
        int length = symbols.length;
        while (pointer < length) {
            if (Character.isDigit(symbols[pointer])
                    || "-".equals(String.valueOf(symbols[pointer]))
                    || "+".equals(String.valueOf(symbols[pointer]))) {
                result += symbols[pointer];
                if (pointer < length) {
                    if (Character.isWhitespace(symbols[pointer + 1])) {
                        break;
                    }
                }
            } else if (Character.isLetter(symbols[pointer])) {
                break;
            }
            pointer++;
        }
        long resultInteger;
        try {
            resultInteger = Long.parseLong(result);
        } catch (NumberFormatException exception) {
            return 0;
        }
        if (resultInteger < -2147483648) {
            return -2147483648;
        }
        if (resultInteger > 2147483647) {
            return 2147483647;
        }
        return (int) resultInteger;
    }
}
