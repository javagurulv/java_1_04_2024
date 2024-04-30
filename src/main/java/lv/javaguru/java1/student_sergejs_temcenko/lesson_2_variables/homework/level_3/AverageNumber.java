package lv.javaguru.java1.student_sergejs_temcenko.lesson_2_variables.homework.level_3;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {

        Scanner newObject = new Scanner(System.in);
        System.out.println("Enter three integers: ");
        int first = newObject.nextInt();
        int second = newObject.nextInt();
        int third = newObject.nextInt();

        double averageResult = (first + second + third) / 3.0;

        System.out.println(averageResult);

    }
}
