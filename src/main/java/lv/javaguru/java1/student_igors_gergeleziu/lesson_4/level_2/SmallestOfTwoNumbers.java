package lv.javaguru.java1.student_igors_gergeleziu.lesson_4.level_2;

class SmallestOfTwoNumbers {
    int findSmallestNumber(int firstNumber, int secondNumber) {
        if (firstNumber != secondNumber) {
            if (firstNumber < secondNumber) return firstNumber;
            else return secondNumber;
        } else return firstNumber;
    }
}
