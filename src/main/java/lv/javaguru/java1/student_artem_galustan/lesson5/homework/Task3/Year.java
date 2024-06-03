package lv.javaguru.java1.student_artem_galustan.lesson5.homework.Task3;


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


