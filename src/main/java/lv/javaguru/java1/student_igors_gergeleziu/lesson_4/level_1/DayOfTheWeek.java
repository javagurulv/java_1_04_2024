package lv.javaguru.java1.student_igors_gergeleziu.lesson_4.level_1;

class DayOfTheWeek {
    String dayOfTheWeek(int number) {
        if (number == 1) return "Monday";
        else if (number == 2) return "Tuesday";
        else if (number == 3) return "Wednesday";
        else if (number == 4) return "Thursday";
        else if (number == 5) return "Friday";
        else if (number == 6) return "Saturday";
        else if (number == 7) return "Sunday";
        else return "out of week days range!";
    }
}
