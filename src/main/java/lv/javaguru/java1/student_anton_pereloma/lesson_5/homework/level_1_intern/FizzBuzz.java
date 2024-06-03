package lv.javaguru.java1.student_anton_pereloma.lesson_5.homework.level_1_intern;

class FizzBuzz {
    String toFizzBuzz(int number) {
        String result;
        if ((divisibleBy3(number) && (divisibleBy5(number)))) {
            result = "FizzBuzz";
        } else if (divisibleBy3(number)) {
            result = "Fizz";
        } else if (divisibleBy5(number)) {
            result = "Fizz";
        } else {
            result = String.valueOf(number);
        }
        return result;
    }

    boolean divisibleBy3(int number) {
        return (number % 3) == 0;
    }

    boolean divisibleBy5(int number) {
        return (number % 5) == 0;
    }
}
