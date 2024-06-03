package lv.javaguru.java1.student_pavels_zuriha.lesson_7.lessoncode.task_1;

import java.util.Scanner;

class OneToTenApp {
    public static void main(String[] args) {

        OneToTen oneToTen = new OneToTen();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array length: ");
        int length = scanner.nextInt();

        oneToTen.forMethod(length);

    }
}
