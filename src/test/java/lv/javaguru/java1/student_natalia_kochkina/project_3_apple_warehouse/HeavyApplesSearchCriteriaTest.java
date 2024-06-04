package lv.javaguru.java1.student_natalia_kochkina.project_3_apple_warehouse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeavyApplesSearchCriteriaTest {

    private HeavyApplesSearchCriteria criteria = new HeavyApplesSearchCriteria();

    @Test
    void shouldReturnTrue() {
        Apple apple = new Apple("green", 160);
        assertTrue(criteria.test(apple));
    }

    @Test
    void shouldReturnFalse() {
        Apple apple = new Apple("red", 100);
        assertFalse(criteria.test(apple));
    }

}