package lv.javaguru.java1.student_pavels_zuriha.lesson_4.homework.level_6;

import java.util.Scanner;

class Months {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number between 1 to 12: ");
        int month = scanner.nextInt();

        switch (month) {
            case 1: case 2: case 12:
                System.out.println("Winter");
                break;
            case 3: case 4: case 5:
                System.out.println("Spring");
                break;
            case 6: case 7: case 8:
                System.out.println("Summer");
                break;
            case 9: case 10: case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Wrong number");
        }

    }
}
