package lv.javaguru.java1.student_igors_gergeleziu.lesson_5.level_2;

class LeapYear {
    String leapYearCheck(int year) {
        String yearType = "";
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    yearType = "Leap year";
                } else yearType = "Regular year";
            } else yearType = "Leap year";
        } else yearType = "Regular year";
        return yearType;
    }
}
