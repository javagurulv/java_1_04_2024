package lv.javaguru.java1.student_maksims_latkovskis.level_5_methods.homework.level_1_intern;

import java.util.Scanner;
class Num2StrApp {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        int number = scanner.nextInt();

        Num2Str num2Str = new Num2Str();
        System.out.println(num2Str.divNumber(number));
    }
}
