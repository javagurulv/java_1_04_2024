package lv.javaguru.java1.student_pavels_zuriha.lesson_4.homework.level_6;

import java.util.Scanner;

class RomeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number between 1 to 10: ");
        int romeNumber = scanner.nextInt();

        switch (romeNumber) {
            case 1:
                System.out.println("Rome Number: I");
                break;
            case 2:
                System.out.println("Rome Number: II");
                break;
            case 3:
                System.out.println("Rome Number: III");
                break;
            case 4:
                System.out.println("Rome Number: IV");
                break;
            case 5:
                System.out.println("Rome Number: V");
                break;
            case 6:
                System.out.println("Rome Number: VI");
                break;
            case 7:
                System.out.println("Rome Number: VII");
                break;
            case 8:
                System.out.println("Rome Number: VIII");
                break;
            case 9:
                System.out.println("Rome Number: IX");
                break;
            case 10:
                System.out.println("Rome Number: X");
                break;
            default:
                System.out.println("Wrong number");
        }


    }
}
