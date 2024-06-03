package lv.javaguru.java1.student_natalia_kochkina.lesson_5.homework.level_2;

class LeapYear {

    boolean isLeap(int year) {
        if (((year % 100) == 0) && ((year % 400 ) != 0)) {
            return false;
        } else {
            return (year % 4) == 0;
        }
    }

}
