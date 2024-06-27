package lv.javaguru.java1.student_natalia_kochkina.lesson_9.homework.day_6.task_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfNumbersCalculatorTest {

    SumOfNumbersCalculator calculator = new SumOfNumbersCalculator();

    @Test
    void calculateSumOfNumbers1() {
        int sum = calculator.calculateSumOfNumbers(1, 2, 4, 1);
        assertEquals(8, sum);
    }

    @Test
    void calculateSumOfNumbers2() {
        int sum = calculator.calculateSumOfNumbers();
        assertEquals(0, sum);
    }

    @Test
    void calculateSumOfNumbers3() {
        int sum = calculator.calculateSumOfNumbers(10, 3, 7);
        assertEquals(20, sum);
    }

}