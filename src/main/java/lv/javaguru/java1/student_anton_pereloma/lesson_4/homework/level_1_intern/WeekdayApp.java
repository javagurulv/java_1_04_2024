package lv.javaguru.java1.student_anton_pereloma.lesson_4.homework.level_1_intern;

import java.util.Scanner;

public class WeekdayApp {
    public static void main(String[] args) {
        System.out.println("Enter number 1 - 7");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Weekday weekday = new Weekday();
        String day = weekday.weekdaySelector(number);

        System.out.println(day);
    }
}
