package lv.javaguru.java1.student_anton_pereloma.lesson_5.homework.level_2_intern;

class LeapYearCalculator {
    String isLeapYear(int year) {
        String leapYear;
        if ((year % 4 == 0) && (year % 100 != 0) && (year % 5 == 0)) {
            leapYear = "Leap Year";
        } else if ((year % 100 == 0) && (year % 400 == 0)) {
            leapYear = "Leap Year";
        } else {
            leapYear = "Not Leap Year";
        }
        return leapYear;
    }
}
