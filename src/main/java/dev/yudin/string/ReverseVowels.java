package dev.yudin.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseVowels {

    public static void main(String[] args) {

        String input = "hello";
        System.out.println(reverseVowels(input));

        String input2 = " ";
        System.out.println(reverseVowels(input2));

        String input3 = "aA";
        System.out.println(reverseVowels(input3));

        String input4 = "A man, a plan, a canal: Panama";
        System.out.println(reverseVowels(input4));
    }

    public static String reverseVowels(String s) {
        if (s.isBlank()) {
            return s;
        }
        List<Character> vowels = new ArrayList<>();
        {
            vowels.add('a');
            vowels.add('e');
            vowels.add('i');
            vowels.add('o');
            vowels.add('u');
            vowels.add('A');
            vowels.add('E');
            vowels.add('I');
            vowels.add('O');
            vowels.add('U');
        }

        char[] symbols = s.toCharArray();
        int leftPointer = 0;
        int rightPointer = symbols.length - 1;

        while (leftPointer < rightPointer) {
            if (vowels.contains(symbols[leftPointer])
                    && vowels.contains(symbols[rightPointer])) {

                char temp = symbols[leftPointer];
                symbols[leftPointer] = symbols[rightPointer];
                symbols[rightPointer] = temp;

                leftPointer++;
                rightPointer--;
            } else if (vowels.contains(symbols[leftPointer])) {
                rightPointer--;
            } else if (vowels.contains(symbols[rightPointer])) {
                leftPointer++;
            } else {
                leftPointer++;
                rightPointer--;
            }
        }
        return String.valueOf(symbols);
    }

    private static char[] reverseWord(String word) {
        List<Character> vowels = new ArrayList<>();
        {
            vowels.add('a');
            vowels.add('e');
            vowels.add('i');
            vowels.add('o');
            vowels.add('u');
            vowels.add('A');
            vowels.add('E');
            vowels.add('I');
            vowels.add('O');
            vowels.add('U');
        }
        char[] symbols = word.toCharArray();
        int leftPointer = 0;
        int rightPointer = word.length() - 1;

        while (leftPointer < rightPointer) {
            if (vowels.contains(symbols[leftPointer])
                    && vowels.contains(symbols[rightPointer])) {

                char temp = symbols[leftPointer];
                symbols[leftPointer] = symbols[rightPointer];
                symbols[rightPointer] = temp;

                leftPointer++;
                rightPointer--;
            } else if (vowels.contains(symbols[leftPointer])) {
                rightPointer--;
            } else if (vowels.contains(symbols[rightPointer])) {
                leftPointer++;
            } else {
                leftPointer++;
                rightPointer--;
            }
        }
        return symbols;
    }
}
