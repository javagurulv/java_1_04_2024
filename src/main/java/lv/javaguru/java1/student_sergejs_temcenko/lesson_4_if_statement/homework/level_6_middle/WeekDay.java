package lv.javaguru.java1.student_sergejs_temcenko.lesson_4_if_statement.homework.level_6_middle;

import java.util.Scanner;

class WeekDay {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number from 1 to 7: ");
        int day = scanner.nextInt();

        String weekday;
        switch (day) {
            case 1:
                weekday = "Monday";
                break;
            case 2:
                weekday = "Tuesday";
                break;
            case 3:
                weekday = "Wednesday";
                break;
            case 4:
                weekday = "Thursday";
                break;
            case 5:
                weekday = "Friday";
                break;
            case 6:
                weekday = "Saturday";
                break;
            case 7:
                weekday = "Sunday";
                break;
            default:
                weekday = "Not good number";
                break;
        }
        System.out.println("Week day: " + weekday);

    }
}
