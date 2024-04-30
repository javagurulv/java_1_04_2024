package lv.javaguru.java1.student_nadezda_radigina.lesson2.level2;

import java.util.Scanner;

public class HelloNadezhda {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Name: ");
        String name = scanner.nextLine();

        System.out.println("Hello," + name + "!");
    }
}
