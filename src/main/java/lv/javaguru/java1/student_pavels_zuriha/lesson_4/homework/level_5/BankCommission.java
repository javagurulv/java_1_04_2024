package lv.javaguru.java1.student_pavels_zuriha.lesson_4.homework.level_5;

import java.util.Scanner;

class BankCommission {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter amount: ");
        int x = scanner.nextInt();

        if (x < 1000) {
            System.out.println("Commission will be: " + (double) x/100 * 3);
        }
        else if (x < 5000) {
            System.out.println("Commission will be: " + (double) x/100 * 4);
        }
        else {
            System.out.println("Commission will be: " + (double) x/100 * 5);
        }

    }

}
