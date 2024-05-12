package lv.javaguru.java1.student_natalia_kochkina.lesson_5.homework.level_2;

class LeapYear {

    public String leapOrNot(int year) {
        if (((year % 100) == 0) && ((year % 400 ) != 0)) {
            return "Not leap year";
        } else if ((year % 4) == 0) {
            return "Leap year";
        } else {
            return "Not leap year";
        }
    }
}
