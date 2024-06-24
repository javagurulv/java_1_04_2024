package lv.javaguru.java1.student_svetlana_bodnarska.lesson_5.homework.level_1_intern;

class IntegerToString {
    boolean divideToThree(int number) {
        return (number % 3) == 0;
    }

    boolean divideToFive(int number) {
        return (number % 5) == 0;
    }

    String detect(int number) {
        if (divideToThree(number) && divideToFive(number)) {
            return "Fizz Buzz";
        } else if (divideToThree(number)) {
            return "Fizz";
        } else if (divideToFive(number)) {
            return "Buzz";
        } else {
            return "" + number;
        }
    }
}