package lv.javaguru.java1.student_svetlana_bodnarska.lesson_2._homework.level2;

import java.util.Scanner;

public class UsersName {
    public static void main(String[] args) {
        System.out.println("Введите имя пользователя");
        Scanner sc = new Scanner (System.in);
        String phrase1 = sc.nextLine();
        System.out.println("Hello " + phrase1);

    }
}
