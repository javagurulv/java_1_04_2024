package lv.javaguru.java1.student_natalia_kochkina.lesson_4.lessoncode;

import java.util.Scanner;

class PercentageRateCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your credit rating:");
        int creditRating = scanner.nextInt();

        if (creditRating < 650) {
            System.out.println("10%");
        } else if ((creditRating >= 650) && (creditRating <= 700)) {
            System.out.println("7%");
        } else {
            System.out.println("5%");
        }
    }
}
