package dev.yudin.string;

import java.util.HashMap;
import java.util.Map;

public class ShuffleString {

    public static void main(String[] args) {
        String input = "codeleet";
        int[] indicates = {4, 5, 6, 7, 0, 2, 1, 3};

        System.out.println(restoreString(input, indicates));
    }


    public static String restoreString(String input, int[] indices) {
        Map<Integer, String> data = new HashMap<>();
        StringBuilder result = new StringBuilder();

        String[] symbols = input.split("");

        for (int j = 0; j < symbols.length; j++) {
            String latter = symbols[j];
            int index = indices[j];

            data.put(index, latter);
        }
        for (int i = 0; i < data.size(); i++) {
            String latter = data.get(i);
            result.append(latter);
        }
        return result.toString();
    }
}
