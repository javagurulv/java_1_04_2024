package lv.javaguru.java1.student_nikita_paramonovs.lesson_4;

import java.util.Scanner;

public class range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if ((number >= 1) && (number <=10)){
            System.out.println("Number is between 1 and 10");
        }
        else {
            System.out.println("Number os not between 1 and 10");
        }
    }
}
