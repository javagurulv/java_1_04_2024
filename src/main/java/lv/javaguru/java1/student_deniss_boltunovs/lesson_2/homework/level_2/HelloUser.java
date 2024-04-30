package lv.javaguru.java1.student_deniss_boltunovs.lesson_2.homework.level_2;

import  java.util.Scanner;

/*
Написать консольную программу, которая запрашивает
имя пользователя и выводит на консоль текст:

Hello имя пользователя!
 */

public class HelloUser {

       public static void main(String[] args) {

           Scanner scanner = new Scanner(System.in);

           System.out.println("Please enter your username: ");
           String userName = scanner.nextLine();
           String userGreetings = "Hello " + userName + "!";

           System.out.println(userGreetings);

       }
}
