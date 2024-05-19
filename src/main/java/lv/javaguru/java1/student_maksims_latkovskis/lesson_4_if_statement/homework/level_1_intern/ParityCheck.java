package lv.javaguru.java1.student_maksims_latkovskis.lesson_4_if_statement.homework.level_1_intern;

import java.util.Scanner;

    class ParityCheck {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter the integer:");
            int inputNumber = scanner.nextInt();
            boolean isEven = (inputNumber%2 ==0);

            if (isEven){
                System.out.println("Number is even");
            }

            else{
                System.out.println("Number is odd");
            }
        }
    }