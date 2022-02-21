package dev.yudin.string;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {

        String input = "III";
        System.out.println("Result: " + romanToInt(input));

//        String input4 = "LVIII";
//        System.out.println("Length: " + input4.length());
//        for (int i = 0; i < input4.length(); i++) {
//            System.out.print("i: " + i);
//            System.out.println(input4.substring(i, i + 2));
//        }

        String input2 = "LVIII";
        System.out.println(romanToInt(input2));

        String input3 = "MCMXCIV";
        System.out.println(romanToInt(input3));
    }

    public static int romanToInt(String input) {
        Map<String, Integer> specialCases = new HashMap<>();
        {
            specialCases.put("IV", 4);
            specialCases.put("IX", 9);
            specialCases.put("XL", 40);
            specialCases.put("XC", 90);
            specialCases.put("CD", 400);
            specialCases.put("CM", 900);
        }
        Map<String, Integer> commonCases = new HashMap<>();
        {
            commonCases.put("I", 1);
            commonCases.put("V", 5);
            commonCases.put("X", 10);
            commonCases.put("L", 50);
            commonCases.put("C", 100);
            commonCases.put("D", 500);
            commonCases.put("M", 1000);
        }

        String[] symbols = input.split("");

        int result = 0;
        for (int i = 0; i < symbols.length; i++) {
            String firstLatter = symbols[i];

            String secondLatter = null;
            if (i < symbols.length - 1) {
                secondLatter = symbols[i + 1];
            }
            String unitedLetters = firstLatter + secondLatter;

            int number;
            if (specialCases.get(unitedLetters) != null) {
                i++;
                number = specialCases.get(unitedLetters);

                result += number;
            } else {
                number = commonCases.get(firstLatter);

                result += number;
            }
        }
        return result;
    }
}
