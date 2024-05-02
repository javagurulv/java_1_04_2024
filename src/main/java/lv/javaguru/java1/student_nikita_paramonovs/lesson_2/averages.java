package lv.javaguru.java1.student_nikita_paramonovs.lesson_2;

import java.util.Scanner;

//CODE_REVIEW: use big first letter in the class name, better: Averages
public class averages {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter num1: ");
        int num1 = scanner.nextInt();

        System.out.print("enter num2: ");
        int num2 = scanner.nextInt();

        System.out.print("enter num3: ");
        int num3 = scanner.nextInt();
        double average = (num1 + num2 + num3) / 3.0;
        System.out.println("average " + num1 + ", " + num2 + " and " + num3 + " equals " + average);
    }

}
