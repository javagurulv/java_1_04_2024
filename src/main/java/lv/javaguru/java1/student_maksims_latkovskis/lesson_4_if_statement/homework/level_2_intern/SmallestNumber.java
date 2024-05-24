package lv.javaguru.java1.student_maksims_latkovskis.lesson_4_if_statement.homework.level_2_intern;

import java.util.Scanner;

class SmallestNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first integer:");
        int firstInteger = scanner.nextInt();
        System.out.println("Please enter the second integer:");
        int secondInteger = scanner.nextInt();

        if(firstInteger<secondInteger) {
            System.out.println("The smallest integer is:" + firstInteger);
        }

        else if(firstInteger>secondInteger) {
            System.out.println("The smallest integer is:" + secondInteger);
        }

        else {
            System.out.println("Integers are the same");
        }
    }
}
