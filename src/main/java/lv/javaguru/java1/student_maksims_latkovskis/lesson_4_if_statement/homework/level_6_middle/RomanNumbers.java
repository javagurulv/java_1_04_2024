package lv.javaguru.java1.student_maksims_latkovskis.lesson_4_if_statement.homework.level_6_middle;
import java.util.Scanner;

class RomanNumbers {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in integer from 1 to 10:");
        int number = scanner.nextInt();

        System.out.print("Your number in Roman is: ");

        switch (number) {
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");

        }

    }
}
