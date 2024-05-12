package lv.javaguru.java1.student_pavels_zuriha.lesson_5.homework.level_1.task_1;

import java.util.Scanner;

class DivideOn3And5 {

    String divisionOn3And5 (int a) {
        String divisionOn3And5 = "FizzBuzz";
        String divisionOn3 = "Fizz";
        String divisionOn5 = "Buzz";

        if ((a % 3 == 0) && (a % 5 == 0)) {
            return divisionOn3And5;
        } else if ((a % 3 == 0) && (a % 5 != 0)) {
            return divisionOn3;
        } else if ((a % 3 != 0) && (a % 5 == 0)) {
            return divisionOn5;
        }
        return "" + a;
    }
}

class DivideOn3And5App {
    public static void main(String[] args) {

        DivideOn3And5 division = new DivideOn3And5();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int a = scanner.nextInt();

        System.out.println(division.divisionOn3And5(a));

    }
}
