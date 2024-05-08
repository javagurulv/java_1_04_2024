package lv.javaguru.java1.student_igors_gergeleziu.lesson_4.level_6;

import java.util.Scanner;

class YearSeasonDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        YearSeason yearSeason = new YearSeason();
        System.out.println("Enter your number: ");
        int number = scanner.nextInt();
        System.out.println("Your month number is " + yearSeason.checkSeason(number));
    }
}
