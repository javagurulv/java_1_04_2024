package lv.javaguru.java1.student_artem_galustan.lesson5.homework.Task_2;

import java.util.Scanner;

class ColorDetectionApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
ColorDetection color = new ColorDetection();

        System.out.println(color.color(390));
        System.out.println(color.color(460));
        System.out.println(color.color(520));
        System.out.println(color.color(580));
        System.out.println(color.color(610));
        System.out.println(color.color(720));
        System.out.println(color.color(1000));

    }
}
