package lv.javaguru.java1.student_pavels_zuriha.lesson_5.homework.level_2;

import java.util.Scanner;

class Year {

    String year(int a) {

        if (a < 0) {
            return "Wrong Year";
        } else if ((a % 4 == 0) || (a % 100 == 0) || (a % 400 == 0)) {
            return "Leap Year";
        } else {
            return "Not Leap Year";
        }
    }
}

class YearApp {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Year leapYear = new Year();

    System.out.println("Enter Year: ");
    int a = scanner.nextInt();

    System.out.println(leapYear.year(a));

    }
}
