package dev.yudin.string;

import java.util.ArrayList;
import java.util.List;

public class ValidPalindromeString {

    public static void main(String[] args) {

        String input = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(input));

        String input2 = "race a car";
        System.out.println(isPalindrome(input2));

        String input3 = "0P";
        System.out.println(isPalindrome(input3));
    }

    public static boolean isPalindrome(String input) {
        List<String> result = new ArrayList<>();

        char [] letters = input.toCharArray();

        for (char symbol : letters) {
            if (Character.isLetter(symbol) || Character.isDigit(symbol)) {
                String convertedSymbol = String.valueOf(symbol).toLowerCase();

                result.add(convertedSymbol);
            }
        }
        int leftPointer = 0;
        int rightPointer = result.size() - 1;
        for (int i = 0; i < result.size(); i++) {
            while (leftPointer < rightPointer) {
                String firstLetter = result.get(leftPointer);
                String secondLetter = result.get(rightPointer);

                if (firstLetter.equals(secondLetter)) {
                    leftPointer++;
                    rightPointer--;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
