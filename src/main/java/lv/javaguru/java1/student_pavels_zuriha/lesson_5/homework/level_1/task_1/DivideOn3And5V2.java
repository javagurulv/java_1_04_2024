package lv.javaguru.java1.student_pavels_zuriha.lesson_5.homework.level_1.task_1;


class DivideOn3And5V2 {

    String scan(int number) {
        if (divide3(number) && divide5(number)) {
        return "FizzBuzz";
        } else if (divide3(number)) {
            return "Fizz";
        } else if (divide5(number)) {
            return "Buzz";
        } else {
            return "" + number;
        }
    }

    boolean divide3 (int a) {
        return a % 3 == 0;
    }

    boolean divide5 (int a) {
        return a % 5 == 0;
    }

}


