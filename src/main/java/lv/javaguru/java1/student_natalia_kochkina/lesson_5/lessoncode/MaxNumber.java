package lv.javaguru.java1.student_natalia_kochkina.lesson_5.lessoncode;

class MaxNumber {

    int findMaxNumber(int number1, int number2) {
        return number1 > number2 ? number1 : number2;
    }

    public int findMaxOfThreeNumbers(int number1, int number2, int number3) {
        int maxNumber = findMaxNumber(number1, number2);
        maxNumber = findMaxNumber(maxNumber, number3);
        return maxNumber;
    }

}
