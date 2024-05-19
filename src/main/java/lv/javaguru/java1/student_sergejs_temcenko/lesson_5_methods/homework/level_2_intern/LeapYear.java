package lv.javaguru.java1.student_sergejs_temcenko.lesson_5_methods.homework.level_2_intern;

class LeapYear {

    public boolean checkLeapYear (int year) {
        if (year % 4 == 0) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return false;
        }
    }
}
