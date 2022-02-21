package dev.yudin.string;

import java.util.ArrayList;
import java.util.List;

public class NumJewelsInStones {

    public static void main(String[] args) {

        String jewels = "aA".toLowerCase();
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));

        String jewels2 = "z";
        String stones2 = "ZZ";
        System.out.println(numJewelsInStones(jewels2, stones2));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        List<String> dataJewels = new ArrayList<>();

        char[] sortedJewels = jewels.toCharArray();
        char[] sortedStones = stones.toCharArray();

        int counter = 0;
        for (char sortedJewel : sortedJewels) {
            dataJewels.add(String.valueOf(sortedJewel));
        }
        for (char sortedStone : sortedStones) {
            String jewel = String.valueOf(sortedStone);
            if (dataJewels.contains(jewel)) {
                counter++;
            }
        }
        return counter;
    }
}
