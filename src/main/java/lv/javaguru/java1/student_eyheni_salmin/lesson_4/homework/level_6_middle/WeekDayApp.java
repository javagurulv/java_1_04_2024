package lv.javaguru.java1.student_eyheni_salmin.lesson_4.homework.level_6_middle;

import java.util.Scanner;

class WeekDayApp {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();

        WeekDay weekDay = new WeekDay();
        weekDay.getWeekDay(num);
        weekDay.printDay();
    }
}
