package lv.javaguru.java1.student_igors_gergeleziu.lesson_4.level_3;

class BiggestOfThreeNumbers {
    int findMaxNumber(int firstNumber, int secondNumber, int thirdNumber) {
        if ((firstNumber != secondNumber) && (secondNumber != thirdNumber) && (firstNumber != thirdNumber)) {
            if (firstNumber > secondNumber) {
                return firstNumber > thirdNumber ? firstNumber : thirdNumber;
            } else return secondNumber > thirdNumber ? secondNumber : thirdNumber;
        } else return firstNumber;
    }
}
