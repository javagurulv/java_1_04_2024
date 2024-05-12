package lv.javaguru.java1.student_pavels_zuriha.lesson_5.homework.level_1.task_1;

import java.util.Scanner;

class DivideOn3And5V2 {

    String scan(int a) {
        if (divide3(a) && divide5(a)) {
        return "FizzBuzz";
        } else if (divide3(a)) {
            return "Fizz";
        } else if (divide5(a)) {
            return "Buzz";
        } else {
            return "" + a;
        }
    }

    boolean divide3 (int a) {
        return a % 3 == 0;
    }

    boolean divide5 (int a) {
        return a % 5 == 0;
    }

}

class DivideOn3And5V2Demo {
    public static void main (String[] args) {

        DivideOn3And5V2 division = new DivideOn3And5V2();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int a = scanner.nextInt();

        System.out.println(division.scan(a));

    }


}
