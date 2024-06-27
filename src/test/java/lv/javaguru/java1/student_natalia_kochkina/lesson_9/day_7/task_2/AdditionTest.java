package lv.javaguru.java1.student_natalia_kochkina.lesson_9.day_7.task_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

    @Test
    void shouldCalculate1() {
        Argument arg1 = new Argument(3);
        Argument arg2 = new Argument(4);
        Addition addition = new Addition(arg1, arg2);
        assertEquals(7, addition.calculate());
    }

    @Test
    void shouldCalculate2() {
        Argument arg1 = new Argument(13.5);
        Argument arg2 = new Argument(0);
        Addition addition = new Addition(arg1, arg2);
        assertEquals(13.5, addition.calculate());
    }

}