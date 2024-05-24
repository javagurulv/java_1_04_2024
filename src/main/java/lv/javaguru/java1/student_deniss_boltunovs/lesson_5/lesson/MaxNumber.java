package lv.javaguru.java1.student_deniss_boltunovs.lesson_5.lesson;

class MaxNumber {

    int findMaxNumber(int number1, int number2) {
//        int maxNumber = number1;
//        if (number2 > maxNumber) {
//            maxNumber = number2;
//        }
//        return maxNumber ;
        return Math.max(number1, number2);
    }

    int findMaxNumber(int number1, int number2, int number3) {
        int maxNumber = findMaxNumber(number1, number2);
        maxNumber = findMaxNumber( maxNumber, number3);
        return maxNumber;
    }

}
