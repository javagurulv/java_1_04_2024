package lv.javaguru.java1.student_eyheni_salmin.lesson_4.class_work;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        int mark = new Scanner(System.in).nextInt();

        if ((mark <= 100) && (mark >= 90)) System.out.println("A");
        else if ((mark <= 89) && (mark >= 80)) System.out.println("B");
        else if ((mark <= 79) && (mark >= 70)) System.out.println("C");
        else if ((mark <= 69) && (mark >= 60)) System.out.println("D");
        else if ((mark <= 59) && (mark >= 0)) System.out.println("F");
    }
}
