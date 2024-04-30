package lv.javaguru.java1.student_nadezda_radigina.lesson2.level3;

import java.util.Scanner;

 class Average {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number 1: ");
        int number1 = scanner.nextInt();
        System.out.println("Input number 2: ");
        int number2 = scanner.nextInt();
        System.out.println("Input number 3: ");
        int number3 = scanner.nextInt();
        System.out.println("Average ="+ (double)(number1 + number2 + number3)/3);
    }

}
