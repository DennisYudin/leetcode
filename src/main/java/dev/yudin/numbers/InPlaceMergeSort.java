package dev.yudin.numbers;

public class InPlaceMergeSort {


    public static void main(String[] args) {

        int arr[] = {12, 11, 13, 5, 6, 7, 0, 6};
        int arr_size = arr.length;

        mergeSort(arr, 0, arr_size - 1);

        printArray(arr, arr_size);
    }

    static void printArray(int[] inputArray, int size) {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(inputArray[i] + " ");
    }

    static void mergeSort(int[] inputArray, int left, int right) {
        if (left < right) {
            // Same as (l + r) / 2, but avoids overflow
            // for large l and r
            int middle = left + (right - left) / 2;
            // Sort first and second halves
            mergeSort(inputArray, left, middle);
            mergeSort(inputArray, middle + 1, right);

            merge(inputArray, left, middle, right);
        }
    }

    static void merge(int arr[], int start, int mid, int end) {
        int start2 = mid + 1;

        // If the direct merge is already sorted
        if (arr[mid] <= arr[start2]) {
            return;
        }

        // Two pointers to maintain start
        // of both arrays to merge
        while (start <= mid && start2 <= end) {

            // If element 1 is in right place
            if (arr[start] <= arr[start2]) {
                start++;
            } else {
                int value = arr[start2];
                int index = start2;

                // Shift all the elements between element 1
                // element 2, right by 1.
                while (index != start) {
                    arr[index] = arr[index - 1];
                    index--;
                }
                arr[start] = value;

                // Update all the pointers
                start++;
                mid++;
                start2++;
            }
        }
    }
}
