package lv.javaguru.java1.student_maksims_latkovskis.lesson_2.homework.level3;

import java.util.Scanner;

public class Average3 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter three sequential values that you want to average:");
        int Value1 = scanner.nextInt();
        int Value2 = scanner.nextInt();
        int Value3 = scanner.nextInt();

        double Average = (double) (Value1+Value2+Value3)/3;
        System.out.println("The average of three numbers is: " + Average);
    }
}
