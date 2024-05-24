package lv.javaguru.java1.student_maksims_latkovskis.lesson_4_if_statement.homework.level_6_middle;

import java.util.Scanner;

class Months {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in the month in numerical format (1 to 12):");
        int month = 0;
        while (month > 12 || month < 1) {
            month = scanner.nextInt();
        }
        System.out.print("Your month is: ");

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }

    }
}
