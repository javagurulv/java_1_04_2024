package lv.javaguru.java1.student_igors_gergeleziu.lesson_4.level_6;

import java.util.Scanner;

class DayOfTheWeekDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DayOfTheWeek dayOfTheWeek = new DayOfTheWeek();
        System.out.println("Enter your number: ");
        int number = scanner.nextInt();
        System.out.println("Your day " + number + " is " + dayOfTheWeek.checkDay(number));
    }
}
