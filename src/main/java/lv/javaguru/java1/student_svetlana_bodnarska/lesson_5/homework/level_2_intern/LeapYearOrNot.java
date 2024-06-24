package lv.javaguru.java1.student_svetlana_bodnarska.lesson_5.homework.level_2_intern;

class LeapYearOrNot
{
    String detectLeapYear (int year){
        if ((year % 4 == 0) && (year % 100 != 0)) {
            return "Leap Year";
        } else if (year % 400 == 0) {
            return "Leap Year";
        } else {
            return "Non-Leap Year";
        }
    }
}
