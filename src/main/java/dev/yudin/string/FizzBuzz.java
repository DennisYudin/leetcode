package dev.yudin.string;

public class FizzBuzz {

    public static void main(String[] args) {

        int input = 15;

        fizzBuzz(input);
    }

    public static void fizzBuzz(int numbers) {
        for (int number = 1; number <= numbers; number ++) {
            if (number % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (number % 3 == 0) {
                System.out.println("Fizz");
            } else if (number % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(number);
            }
        }
    }
}
