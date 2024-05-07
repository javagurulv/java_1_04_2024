package lv.javaguru.java1.student_nikita_paramonovs.lesson_4;

import java.util.Scanner;

public class Rankings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mark = scanner.nextInt();


        if ((mark >= 90) && (mark <=100)){
            System.out.println("A");
        } else if ((mark >= 80) && (mark <=89)){
            System.out.println("B");
        } else if ((mark >= 70) && (mark <=79)){
            System.out.println("C");
        } else if ((mark >= 60) && (mark <=69)){
            System.out.println("D");
        } else if ((mark >= 0) && (mark <=59)){
            System.out.println("F");
        }
    }
}



