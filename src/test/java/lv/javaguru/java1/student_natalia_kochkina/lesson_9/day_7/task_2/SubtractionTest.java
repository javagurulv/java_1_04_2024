package lv.javaguru.java1.student_natalia_kochkina.lesson_9.day_7.task_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubtractionTest {

    @Test
    void shouldCalculate1() {
        Argument arg1 = new Argument(10);
        Argument arg2 = new Argument(3);
        Subtraction subtraction = new Subtraction(arg1, arg2);
        assertEquals(7, subtraction.calculate());
    }

    @Test
    void shouldCalculate2() {
        Argument arg1 = new Argument(13.5);
        Argument arg2 = new Argument(5);
        Subtraction subtraction = new Subtraction(arg1, arg2);
        assertEquals(8.5, subtraction.calculate());
    }

}