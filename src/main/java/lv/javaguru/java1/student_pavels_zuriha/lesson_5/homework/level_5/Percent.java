package lv.javaguru.java1.student_pavels_zuriha.lesson_5.homework.level_5;

import java.util.Scanner;

class Percent {

    double difficultPercent(double startSum, double percent, int years) {
        return startSum * Math.pow(1 + percent, years);

    }

}


class PercentApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Percent difficultPercent = new Percent();

        System.out.println("Enter Start Sum: ");
        double startSum = scanner.nextDouble();

        System.out.println("Enter Years: ");
        int years = scanner.nextInt();

        System.out.println("Your Slozniy Procent: " + difficultPercent.difficultPercent(startSum, 0.1, years));
        System.out.println("Your Slozniy Procent: " + difficultPercent.difficultPercent(startSum, 0.01, years));
        System.out.println("Your Slozniy Procent: " + difficultPercent.difficultPercent(startSum, 0.05, years));





    }


}

