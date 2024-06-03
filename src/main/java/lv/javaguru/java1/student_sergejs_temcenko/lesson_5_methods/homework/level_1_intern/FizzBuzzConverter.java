package lv.javaguru.java1.student_sergejs_temcenko.lesson_5_methods.homework.level_1_intern;

class FizzBuzzConverter {

    private boolean divisibleByThree(int number) {
        return number % 3 == 0;
    }

    private boolean divisionByFive(int number) {
        return number % 5 == 0;
    }

    String convertToFizzBuzz(int number) {
        if (divisibleByThree(number) && divisionByFive(number)) {
            return "FizzBuzz";
        } else if (divisionByFive(number)) {
            return "Fizz";
        } else if (divisibleByThree(number)) {
            return "Buzz";
        } else {
            return "" + number;
        }
    }
}
