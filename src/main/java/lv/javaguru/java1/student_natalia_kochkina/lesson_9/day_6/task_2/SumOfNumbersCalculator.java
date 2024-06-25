package lv.javaguru.java1.student_natalia_kochkina.lesson_9.day_6.task_2;

class SumOfNumbersCalculator {

    int calculateSumOfNumbers (int... numbers) {
        int sum = 0;
        for (int number: numbers) {
            sum += number;
        }
        return sum;
    }

}
