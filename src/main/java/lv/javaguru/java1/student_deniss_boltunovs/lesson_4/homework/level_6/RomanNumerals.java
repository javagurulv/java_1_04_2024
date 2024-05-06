package lv.javaguru.java1.student_deniss_boltunovs.lesson_4.homework.level_6;

import java.util.Scanner;

class RomanNumerals {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number between 1 and 10.");
        int number = scanner.nextInt();

        String romanNumber = "";

        switch (number) {
            case 1:
                romanNumber = "I";
                break;
            case 2:
                romanNumber = "II";
                break;
            case 3:
                romanNumber = "III";
                break;
            case 4:
                romanNumber = "IV";
                break;
            case 5:
                romanNumber = "V";
                break;
            case 6:
                romanNumber = "VI";
                break;
            case 7:
                romanNumber = "VII";
                break;
            case 8:
                romanNumber = "VIII";
                break;
            case 9:
                romanNumber = "IX";
                break;
            case 10:
                romanNumber = "X";
                break;
            default:
               break;
        }

        System.out.println("Arabic number: " + number);
        System.out.println("Roman number: " + romanNumber);

    }
}
