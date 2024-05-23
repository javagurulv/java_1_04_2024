package lv.javaguru.java1.student_deniss_boltunovs.lesson_5.lesson;

import java.util.Random;

class MethodsOverview {

    public static void main(String[] args) {

        String text = "malayalam";
        int number = 812;
        int min = 6;
        int max = 15;

        System.out.println("Is \"" + text + "\" palindrome? " + isPalindrome(text));
        System.out.println("Sum of numbers: " + sumNumbers(number));
        System.out.println("Count of digits: " + countDigits(number));
        System.out.println("Random number between " + min + " and " + max + " is " + generateRandomNumber(min, max));

    }

    // checks if provided text is reads the same backwards
    private static boolean isPalindrome(String text) {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }

    // recursive method, sum up numbers
    private static int sumNumbers(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Number should be positive");
        }
        if (number == 1) {
            return 1;
        }
        return number + sumNumbers(number - 1);
    }

    // recursive method counts digits in number
    private static int countDigits(int number) {
        if (number < 0) {
            number = -number;  // changing negative to positive number
        }
        if (number < 10) {
            return 1;
        }
        return 1 + countDigits(number / 10);
    }

    //generates random number between two bonds
    public static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

}
