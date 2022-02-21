package dev.yudin.string;

import java.util.HashMap;
import java.util.Map;

public class CheckAlmostEquivalent2 {

    public static void main(String[] args) {

        String word1 = "aaaa";
        String word2 = "bccb";

        System.out.println(checkAlmostEquivalent(word1, word2));

        String word3 = "zzzyyy";
        String word4 = "iiiiii";

        System.out.println(checkAlmostEquivalent(word3, word4));

        String word5 = "bddhdfcdihfehbehfeiccehhchbibiggifcbgieedgfhggebcbeeddfdfiehcigdfcccdhgchbbfheddbdbiifeeiieg";
        String word6 = "cdecdhhfgdieiifhhifffcgddeehgbciceggedbdggbigiieidgcceccgfhiecdefdhighbfdcdbgcfddeebbgibcihe";

        System.out.println(checkAlmostEquivalent(word5, word6));
    }

    public static boolean checkAlmostEquivalent(String word1, String word2) {
        Map<String, Integer> firstWord = count(word1);
        Map<String, Integer> secondWord = count(word2);

        boolean firstCheck = checkAnotherArray(firstWord, secondWord);
        boolean secondCheck = checkAnotherArray(secondWord, firstWord);

        if (firstCheck == false || secondCheck == false) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean checkAnotherArray(Map<String, Integer> firstInput, Map<String, Integer> secondInput) {
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
