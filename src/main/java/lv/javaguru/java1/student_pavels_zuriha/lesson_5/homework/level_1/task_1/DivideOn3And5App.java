package lv.javaguru.java1.student_pavels_zuriha.lesson_5.homework.level_1.task_1;

import java.util.Scanner;

class DivideOn3And5App {
    public static void main(String[] args) {

        DivideOn3And5 division = new DivideOn3And5();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        System.out.println(division.divisionOn3And5(number));

    }
}
