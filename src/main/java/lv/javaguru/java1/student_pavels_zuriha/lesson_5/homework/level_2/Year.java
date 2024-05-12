package lv.javaguru.java1.student_pavels_zuriha.lesson_5.homework.level_2;


class Year {

    String year(int a) {

        if (a < 0) {
            return "Wrong Year";
        } else if ((a % 4 == 0) || (a % 100 == 0) || (a % 400 == 0)) {
            return "Leap Year";
        } else {
            return "Not Leap Year";
        }
    }
}


