package dev.yudin.numbers;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 44;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {

        for (int firstPointer = 0; firstPointer < nums.length; firstPointer++) {
            for (int secondPointer = firstPointer + 1; secondPointer < nums.length; secondPointer++) {
                int firstNumber = nums[firstPointer];
                int secondNumber = nums[secondPointer];

                int sum = firstNumber + secondNumber;

                if (sum == target) {
                    int[] result = {firstPointer, secondPointer};

                    return result;
                }
            }
        }
        int[] result = {-1};

        return result;
    }
}
