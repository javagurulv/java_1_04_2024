package lv.javaguru.java1.student_anton_pereloma.lesson_4.homework.level_6_middle;

class Weekday {

    String weekdaySelector(int number) {
        return switch (number) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "give proper weekday number";
        };
    }
}