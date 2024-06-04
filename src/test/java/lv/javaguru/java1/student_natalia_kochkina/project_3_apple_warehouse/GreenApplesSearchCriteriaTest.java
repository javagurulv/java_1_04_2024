package lv.javaguru.java1.student_natalia_kochkina.project_3_apple_warehouse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreenApplesSearchCriteriaTest {

    private GreenApplesSearchCriteria criteria = new GreenApplesSearchCriteria();

    @Test
    void shouldReturnTrue() {
        Apple apple = new Apple("green", 160);
        assertTrue(criteria.test(apple));
    }

    @Test
    void shouldReturnFalse() {
        Apple apple = new Apple("red", 160);
        assertFalse(criteria.test(apple));
    }

}