package dev.yudin.string;

public class CountConsistentStrings {

    public static void main(String[] args) {


        String input = "abcd";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};

        System.out.println(countConsistentStrings(input, words));
    }

    public static int countConsistentStrings(String allowed, String[] words) {

        int counter = 0;
        for(String word : words) {
            if(word.contains(allowed)) {
                counter++;
            } else if (allowed.contains(word)) {
                counter++;
            }
        }
        return counter;
    }
}
