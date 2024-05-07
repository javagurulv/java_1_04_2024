package lv.javaguru.java1.student_pavels_zuriha.lesson_4.homework.level_1;

import java.util.Scanner;

class DayOfTheWeek {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number between 1 and 7: ");
        int x = scanner.nextInt();

        if (x == 1) {
           System.out.println("Monday");
        }
        else if (x == 2) {
            System.out.println("Tuesday");
        }
        else if (x == 3) {
            System.out.println("Wednesday");
        }
        else if (x == 4) {
            System.out.println("Thursday");
        }
        else if (x == 5) {
            System.out.println("Friday");
        }
        else if (x == 6) {
            System.out.println("Saturday");
        }
        else if (x == 7) {
            System.out.println("Sunday");
        }
        else
            System.out.println("Incorrect number");
    }
}
