package lv.javaguru.java1.student_natalia_kochkina.project_3_apple_warehouse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LightweightApplesSearchCriteriaTest {

    LightweightApplesSearchCriteria criteria = new LightweightApplesSearchCriteria();

    @Test
    void shouldReturnTrue() {
        Apple apple = new Apple("green", 100);
        assertTrue(criteria.test(apple));
    }

    @Test
    void shouldReturnFalse() {
        Apple apple = new Apple("red", 160);
        assertFalse(criteria.test(apple));
    }

}