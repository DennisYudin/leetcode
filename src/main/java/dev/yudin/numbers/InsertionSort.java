package dev.yudin.numbers;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] array = {3, 8, 2, 0, 15, 45};

        sort(array);
//        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            System.out.println("i: " + i);
            int currentNumber = array[i];
            int previousPointer = i - 1;
            System.out.println("[" + array[previousPointer] + "]" + "[" + currentNumber + "]");
            while (previousPointer >= 0 && array[previousPointer] > currentNumber) {
                array[previousPointer + 1] = array[previousPointer];
                previousPointer--;
            }
            array[previousPointer + 1] = currentNumber;
        System.out.println(Arrays.toString(array));
        }
    }
}
