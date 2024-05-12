package lv.javaguru.java1.student_zarina_sidlovska.lesson_1.lesson_4.homework_4.level_1.level_2;

import java.util.Scanner;

class WeekDayNames {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter one number from 1 to 7 ");
        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("Monday");
        } else if (number == 2) {
            System.out.println("Tuesday");
        } else if (number == 3) {
            System.out.println("Wednsday");
        } else if (number == 4) {
            System.out.println("Thursday");
        } else if (number == 5) {
            System.out.println("Friday");
        } else if (number == 6) {
            System.out.println("Saturday");
        } else if (number == 7) {
            System.out.println("Sunday");

        }

    }
}