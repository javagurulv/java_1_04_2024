package lv.javaguru.java1.student_svetlana_bodnarska.lesson_4.homework.level_5_middle;

import java.util.Scanner;

class Comission
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cash withdrawal amount: ");
        int number = scanner.nextInt();

        if (number < 1000){
            System.out.println(number * 0.03);
        } else if ((number >= 1000) && (number < 5000)){
            System.out.println(number * 0.04);
        } else {
            System.out.println(number * 0.05);
        }
    }


}
