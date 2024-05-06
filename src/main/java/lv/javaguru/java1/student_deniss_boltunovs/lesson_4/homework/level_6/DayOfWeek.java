package lv.javaguru.java1.student_deniss_boltunovs.lesson_4.homework.level_6;

import java.util.Scanner;

class DayOfWeek {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number between 1 and 7.");
        int number = scanner.nextInt();

        String dayOfWeek;

        switch (number) {
            case 1 -> dayOfWeek = "Monday";
            case 2 -> dayOfWeek = "Tuesday";
            case 3 -> dayOfWeek = "Wednesday";
            case 4 -> dayOfWeek = "Thursday";
            case 5 -> dayOfWeek = "Friday";
            case 6 -> dayOfWeek = "Saturday";
            case 7 -> dayOfWeek = "Sunday";
            default -> dayOfWeek = "Incorrect number provided";
        }

//        switch (number) {
//            case 1:
//                dayOfWeek = "Monday";
//                break;
//            case 2:
//                dayOfWeek = "Tuesday";
//                break;
//            case 3:
//                dayOfWeek = "Wednesday";
//                break;
//            case 4:
//                dayOfWeek = "Thursday";
//                break;
//            case 5:
//                dayOfWeek = "Friday";
//                break;
//            case 6:
//                dayOfWeek = "Saturday";
//                break;
//            case 7:
//                dayOfWeek = "Sunday";
//                break;
//            default:
//                dayOfWeek = "Incorrect number provided";
//                break;
//        }

//        if (number == 1) {
//            dayOfWeek = "Monday";
//        } else if (number == 2) {
//            dayOfWeek = "Tuesday";
//        } else if (number == 3) {
//            dayOfWeek = "Wednesday";
//        } else if (number == 4) {
//            dayOfWeek = "Thursday";
//        } else if (number == 5) {
//            dayOfWeek = "Friday";
//        } else if (number == 6) {
//            dayOfWeek = "Saturday";
//        } else if (number == 7) {
//            dayOfWeek = "Sunday";
//        } else {
//            dayOfWeek = "Incorrect number provided";
//        }

        System.out.println("Day of week: " + dayOfWeek);

    }
}
