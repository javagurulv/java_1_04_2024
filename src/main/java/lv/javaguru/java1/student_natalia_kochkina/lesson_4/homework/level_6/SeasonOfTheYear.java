package lv.javaguru.java1.student_natalia_kochkina.lesson_4.homework.level_6;

import java.util.Scanner;

class SeasonOfTheYear {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of month");
        int monthNumber = scanner.nextInt();

        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println("Winter");
                break;
            case 3, 4, 5:
                System.out.println("Spring");
                break;
            case 6, 7, 8:
                System.out.println("Summer");
                break;
            case 9, 10, 11:
                System.out.println("autumn");
                break;
            default:
                System.out.println("Unknown month");
        }
    }
}
