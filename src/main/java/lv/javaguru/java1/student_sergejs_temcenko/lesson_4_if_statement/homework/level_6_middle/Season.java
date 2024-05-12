package lv.javaguru.java1.student_sergejs_temcenko.lesson_4_if_statement.homework.level_6_middle;

import java.util.Scanner;

class Season {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number (from 1 to 12): ");
        int number = scanner.nextInt();

        String season;
        switch (number) {
            case 1:
            case 2:
            case 12:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "Incorrect number";
                break;
        }
        System.out.println("Season: " + season);
    }
}
