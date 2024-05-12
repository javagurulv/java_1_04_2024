package lv.javaguru.java1.student_sergejs_temcenko.lesson_4_if_statement.homework.level_6_middle;

import java.util.Scanner;

class RomNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number from 1 to 10");
        int number = scanner.nextInt();

        String romNumber;
        switch (number) {
            case 1:
                romNumber = "I";
                break;
            case 2:
                romNumber = "II";
                break;
            case 3:
                romNumber = "III";
                break;
            case 4:
                romNumber = "IV";
                break;
            case 5:
                romNumber = "V";
                break;
            case 6:
                romNumber = "VI";
                break;
            case 7:
                romNumber = "VII";
                break;
            case 8:
                romNumber = "VIII";
                break;
            case 9:
                romNumber = "IX";
                break;
            case 10:
                romNumber = "X";
                break;
            default:
                romNumber = "Error";
                break;
        }
        System.out.println(romNumber);
    }
}
