package lv.javaguru.java1.student_igors_gergeleziu.lesson_4.level_3;

class BiggestOfThreeNumbers {
    int findMaxNumber(int firstNumber, int secondNumber, int thirdNumber) {
        int maxNumber = 0;
        if ((firstNumber != secondNumber) && (secondNumber != thirdNumber) && (firstNumber != thirdNumber)) {
            if (firstNumber > maxNumber) {
                maxNumber = firstNumber;
            }
            if (secondNumber > maxNumber) {
                maxNumber = secondNumber;
            }
            if (thirdNumber > maxNumber) {
                maxNumber = thirdNumber;
            }
            return maxNumber;
        } else return firstNumber;
    }
}
