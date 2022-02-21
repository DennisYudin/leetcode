package dev.yudin.numbers;

public class Palindrome {

    public static void main(String[] args) {

        int number2 = 121;
        System.out.println(isPalindrome(number2));

        int number1 = -121;
        System.out.println(isPalindrome(number1));

        int number3 = 321;
        System.out.println(isPalindrome(number3));

        int number4 = 123321;
        System.out.println(isPalindrome(number4));
    }

    public static boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        char [] numbers = number.toCharArray();
        int leftPointer = 0;
        int rightPointer = number.length() - 1;

        while (leftPointer < rightPointer) {
            if (Character.isDigit(numbers[leftPointer]) && Character.isDigit(numbers[rightPointer])) {
                int firstNumber = Character.getNumericValue(numbers[leftPointer]);
                int secondNumber = Character.getNumericValue(numbers[rightPointer]);

                if (firstNumber == secondNumber) {
                    leftPointer++;
                    rightPointer--;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
