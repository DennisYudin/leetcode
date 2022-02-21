package dev.yudin.string;

import java.util.Arrays;

public class SortSentence {

    public static void main(String[] args) {

        String input = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(input));
    }

    public static String sortSentence(String s) {
        String [] words = s.split(" ");
        String[] sortedSentence = new String[words.length];
        StringBuilder result = new StringBuilder();

        for (String wordWithNumber : words) {
            char position = wordWithNumber.charAt(wordWithNumber.length() - 1);
            String word = wordWithNumber.substring(0, wordWithNumber.length() - 1);

            sortedSentence[Character.getNumericValue(position) - 1] = word;
        }
        for (String word : sortedSentence) {
            result.append(word).append(" ");
        }
        result.deleteCharAt(result.length() - 1);
        return result.toString();
    }
}
