package dev.yudin.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AreAlmostEquivalent {

    public static void main(String[] args) {
        List<String> input1 = new ArrayList<>();
        {
            input1.add("aaa");
        }
        List<String> input2 = new ArrayList<>();
        {
            input2.add("aab");
        }
        System.out.println(areAlmostEquivalent(input1, input2));

        List<String> input3 = new ArrayList<>();
        {
            input3.add("aabaab");
            input3.add("aaaabb");
        }
        List<String> input4 = new ArrayList<>();
        {
            input4.add("bbabbc");
            input4.add("abb");
        }
        System.out.println(areAlmostEquivalent(input3, input4));

        List<String> input5 = new ArrayList<>();
        {
            input5.add("abdeaaefabcdef");
        }
        List<String> input6 = new ArrayList<>();
        {
            input6.add("aefaffbcdfdff");
        }
        System.out.println(areAlmostEquivalent(input5, input6));
    }

    public static List<String> areAlmostEquivalent(List<String> s, List<String> t) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < s.size(); i++) {
            String firstWord = s.get(i);
            String secondWord = t.get(i);

            if (firstWord.length() != secondWord.length()) {
                result.add("NO");
            } else {
                Map<String, Integer> countedFirstWord = count(firstWord);
                Map<String, Integer> countedSecondWord = count(secondWord);

                boolean firstCheck = checkWord(countedFirstWord, countedSecondWord);
                boolean secondCheck = checkWord(countedSecondWord, countedFirstWord);

                if (firstCheck == false || secondCheck == false) {
                    result.add("NO");
                } else {
                    result.add("YES");
                }
            }
        }
        return result;
    }

    public static boolean checkWord(Map<String, Integer> firstInput, Map<String, Integer> secondInput) {
        for (String letter : firstInput.keySet()) {
            int firstNumber = firstInput.get(letter);

            int secondNumber;
            if (secondInput.get(letter) == null) {
                secondNumber = 0;
            } else {
                secondNumber = secondInput.get(letter);
            }
            int result = firstNumber - secondNumber;

            if (Math.abs(result) > 3) {
                return false;
            }
        }
        return true;
    }

    public static Map<String, Integer> count(String input) {
        Map<String, Integer> result = new HashMap<>();

        String[] symbols = input.split("");

        for (String symbol : symbols) {
            if (result.containsKey(symbol)) {
                int amount = result.get(symbol) + 1;
                result.put(symbol, amount);
            } else {
                result.put(symbol, 1);
            }
        }
        return result;
    }
}
