package lv.javaguru.java1.student_svetlana_bodnarska.lesson_4.homework.level_6_middle;

import java.util.Scanner;

class SeasonOfTheYear
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter number of month: ");
        int month = scanner.nextInt();

        switch (month){
            case 12:
            case 1:
            case 2:
            System.out.println("Winter");
            break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
        }
    }
}
