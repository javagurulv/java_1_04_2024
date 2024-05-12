package lv.javaguru.java1.student_pavels_zuriha.lesson_5.homework.level_2;

import java.util.Scanner;

class YearApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Year leapYear = new Year();

        System.out.println("Enter Year: ");
        int a = scanner.nextInt();

        System.out.println(leapYear.year(a));

    }
}
