package lv.javaguru.java1.student_igors_gergeleziu.lesson_5.level_1;

class FizzBuzz {
    String fizzCheck(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        } else return " " + number;
    }

    String buzzCheck(int number) {
        if (number % 5 == 0) {
            return "Buzz";
        } else return " " + number;
    }

    String fizzBuzzCheck(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) {
            return "FizzBuzz";
        } else return " " + number;
    }
}
