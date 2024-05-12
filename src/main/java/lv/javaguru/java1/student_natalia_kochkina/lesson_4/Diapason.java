package lv.javaguru.java1.student_natalia_kochkina.lesson_4;

import java.util.Scanner;

class Diapason {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if ((number >= 1) && (number <= 10)) {
            System.out.println("number is between 1 and 10");
        } else {
            System.out.println("number is not between 1 and 10");
        }
    }
}
