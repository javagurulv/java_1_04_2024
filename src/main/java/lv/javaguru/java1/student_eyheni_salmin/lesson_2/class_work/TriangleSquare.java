package lv.javaguru.java1.student_eyheni_salmin.lesson_2.class_work;

import java.util.Scanner;

public class TriangleSquare {

    public static void main(String[] args) {
        printSquare();
    }
    public static double getSide() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number here: ");
        return scanner.nextInt();
    }
    public static double getSquare() {

        double varOne = getSide();
        double varTwo = getSide();
        double varThree = getSide();
        double halfPerimetr = (varOne + varTwo + varThree) / 2;

        return Math.sqrt(halfPerimetr * (halfPerimetr - varOne)
        * (halfPerimetr - varTwo) * (halfPerimetr - varThree));
    }
    public static void printSquare() {
        System.out.println(getSquare());
    }
}

