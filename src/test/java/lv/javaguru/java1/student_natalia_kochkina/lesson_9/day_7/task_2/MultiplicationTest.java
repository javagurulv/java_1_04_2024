package lv.javaguru.java1.student_natalia_kochkina.lesson_9.day_7.task_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest {

    @Test
    void shouldCalculate1() {
        Argument arg1 = new Argument(10);
        Argument arg2 = new Argument(3);
        Multiplication multiplication = new Multiplication(arg1, arg2);
        assertEquals(30, multiplication.calculate());
    }

    @Test
    void shouldCalculate2() {
        Argument arg1 = new Argument(0);
        Argument arg2 = new Argument(3);
        Multiplication multiplication = new Multiplication(arg1, arg2);
        assertEquals(0, multiplication.calculate());
    }

}