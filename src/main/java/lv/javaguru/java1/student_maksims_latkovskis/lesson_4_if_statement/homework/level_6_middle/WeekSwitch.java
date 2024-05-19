package lv.javaguru.java1.student_maksims_latkovskis.lesson_4_if_statement.homework.level_6_middle;

import java.util.Scanner;
public class WeekSwitch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in the weekday in numerical format (1 to 7):");
        int day = 0;
        while (day > 7 || day < 1) {
            day = scanner.nextInt();
        }
        System.out.print("Your day is: ");

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}
