package lv.javaguru.java1.student_natalia_kochkina.lesson_7.lessoncode;

class SumCalculator {

    int calculateSumOfNumbers(int numberFrom, int numberTo) {
        int sum = 0;

        for (int i = numberFrom; i <= numberTo; i++) {
            sum = sum + i;
        }
        return sum;
    }

}
