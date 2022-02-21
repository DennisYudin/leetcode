package dev.yudin.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LengthOfLastWord {

    public static void main(String[] args) {

        String input = "Hello World";
        System.out.println(lengthOfLastWord(input));

        String input2 = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(input2));
    }

    public static int lengthOfLastWord(String input) {
        List<String> result = new ArrayList<>();

        String [] words = input.split(" ");
        for (String symbol : words) {
            if (!symbol.isBlank()) {
                result.add(symbol);
            }
        }
        String lastWord = result.get(result.size() - 1);
        int length = lastWord.length();

        return length;
    }
}
