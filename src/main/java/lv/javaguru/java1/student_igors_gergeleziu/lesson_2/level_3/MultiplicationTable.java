package lv.javaguru.java1.student_igors_gergeleziu.lesson_2.level_3;

import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter number: ");
        int number=scanner.nextInt();
        for(int i=1;i<=10; i++){
            System.out.println(number+" x "+i+" = "+number*i);
        }
    }
}
