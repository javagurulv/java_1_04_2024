package lv.javaguru.java1.student_nadezda_radigina.lesson_4.lesson_07_05;

import java.util.Scanner;

class From1To10And {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if ((number >= 1) && (number <= 10)){
            System.out.println("Number is between 1 and 10! ");
        } else {
            System.out.println("Number is NOT between 1 and 10! ");
        }

    }
}
