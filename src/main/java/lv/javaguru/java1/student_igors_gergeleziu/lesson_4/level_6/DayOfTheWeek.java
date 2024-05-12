package lv.javaguru.java1.student_igors_gergeleziu.lesson_4.level_6;

class DayOfTheWeek {
    String checkDay(int number) {
        switch (number) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Out of range";
        }
    }
}
