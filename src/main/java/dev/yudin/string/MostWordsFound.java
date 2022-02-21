package dev.yudin.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MostWordsFound {

    public static void main(String[] args) {

        String[] input = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(input));
    }

    public static int mostWordsFound(String[] sentences) {
        List<Integer> numbers = new ArrayList<>();

        for (String sentence : sentences) {
            String[] arrayWords = sentence.split(" ");
            int amountWordsInSentence = arrayWords.length;

            numbers.add(amountWordsInSentence);
        }
        int maxNumber = Collections.max(numbers);
        return maxNumber;
    }
}
