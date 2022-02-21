package dev.yudin.string;

public class SberTechTask {

    public static void main(String[] args) {

        String input = "Зздрррраавствввууй,     Сссссбееерррр!";
        String input2 = "Ссссбееерррр!";

        String expected = "Здравствуй, Сбер!";

        String deduplicated = deduplicate(input);

        System.out.println("expected: " + expected);
        System.out.println("deduplicated: " + deduplicated);
        System.out.println(expected.equals(deduplicated));
    }

    public static String deduplicate(String input) {
        String result = "";

        String[] symbols = input.split("");

        for (String symbol : symbols) {
            if (!result.toLowerCase().endsWith(symbol)) {
                result += symbol;
            }
        }
        return result;
    }
}

