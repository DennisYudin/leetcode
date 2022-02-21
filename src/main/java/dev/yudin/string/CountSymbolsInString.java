package dev.yudin.string;

import java.util.*;

public class CountSymbolsInString {

    public static void main(String[] args) {

        List<String> firstInput = new ArrayList<>();
        {
            firstInput.add("aabaab");
            firstInput.add("aaaaabb");

        }
        List<String> secondInput = new ArrayList<>();
        {
            secondInput.add("bbabbc");
            secondInput.add("abb");

        }
//        System.out.println(count(firstInput));
//        System.out.println(count(secondInput));

    }

    public static List<String> areAlmostEquivalent(List<String> firstArray, List<String> secondArray) {

        for (int i = 0; i < firstArray.size(); i++) {
            String firstWord = firstArray.get(i);
            String secondWord = secondArray.get(i);

            Map<String, Integer> countedFirstWord = count(firstWord);
            Map<String, Integer> countedSecondWord = count(secondWord);

            for (String letter : countedFirstWord.keySet()) {

            }
        }


//        for (String letter : resultFirstArray.keySet()) {
//            int firstNumber = resultFirstArray.get(letter);
//            int secondNumber = resultSecondArray.get(letter);
//
//
//            if (firstNumber - secondNumber > 3) {
//
//            }
//        }
        return null;
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

    public static Map<String, Integer> countNumberSymbols(String input) {

        List<String> symbols = new ArrayList<>(Arrays.asList(input.split("")));

        Map<String, Integer> result = new HashMap<>();

        symbols.forEach(symbol -> result.put(symbol, result.getOrDefault(symbol, 0) + 1));

        return result;
    }
}
