package lv.javaguru.java1.student_natalia_kochkina.lesson_9.homework.day_7.task_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {

    @Test
    void shouldCalculate1() {
        Argument arg1 = new Argument(10);
        Argument arg2 = new Argument(2);
        Division division = new Division(arg1, arg2);
        assertEquals(5, division.calculate(), 0.01);
    }

    @Test
    void shouldCalculate2() {
        Argument arg1 = new Argument(20);
        Argument arg2 = new Argument(5);
        Division division = new Division(arg1, arg2);
        assertEquals(4, division.calculate(), 0.01);
    }

}