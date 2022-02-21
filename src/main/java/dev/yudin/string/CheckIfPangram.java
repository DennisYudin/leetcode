package dev.yudin.string;

import java.util.ArrayList;
import java.util.List;

public class CheckIfPangram {

    public static void main(String[] args) {

        String input = "leetcode";
        System.out.println(checkIfPangram(input));

        String input2 = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(input2));
    }

    public static boolean checkIfPangram(String sentence) {

        List<String> alphabet = new ArrayList<>();
        {
            alphabet.add("a");
            alphabet.add("b");
            alphabet.add("c");
            alphabet.add("d");
            alphabet.add("e");
            alphabet.add("f");
            alphabet.add("g");
            alphabet.add("h");
            alphabet.add("i");
            alphabet.add("j");
            alphabet.add("k");
            alphabet.add("l");
            alphabet.add("m");
            alphabet.add("n");
            alphabet.add("o");
            alphabet.add("p");
            alphabet.add("q");
            alphabet.add("r");
            alphabet.add("s");
            alphabet.add("t");
            alphabet.add("u");
            alphabet.add("v");
            alphabet.add("w");
            alphabet.add("x");
            alphabet.add("y");
            alphabet.add("z");
        }
        List<String> inputData = new ArrayList<>();

        char[] symbols = sentence.toCharArray();

        for (char symbol : symbols) {
            String strSymbol = String.valueOf(symbol);

            inputData.add(strSymbol);
        }
        for (String latter : alphabet) {
            if (!inputData.contains(latter)) {
                return false;
            }
        }
        return true;
    }
}
