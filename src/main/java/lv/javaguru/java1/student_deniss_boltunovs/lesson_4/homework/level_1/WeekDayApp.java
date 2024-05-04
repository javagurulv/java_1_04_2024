package lv.javaguru.java1.student_deniss_boltunovs.lesson_4.homework.level_1;

import java.util.Scanner;

public class WeekDayApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input number from 1 to 7");
        int number = scanner.nextInt();
        String weekday = "";

        // determine day of the week
        if (number == 1) {
            weekday = "Monday" + number;
        } else if (number == 2) {
            weekday = "Tuesday";
        } else if (number == 3) {
            weekday = "Wednesday";
        } else if (number == 4) {
            weekday = "Thursday";
        } else if (number == 5) {
            weekday = "Friday";
        } else if (number == 6) {
            weekday = "Saturday";
        } else if (number == 7) {
            weekday = "Sunday";
        }

        System.out.println("Day of the week: " + weekday);

    }

}
