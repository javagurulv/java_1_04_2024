package lv.javaguru.java1.teacher.project_3_apple_warehouse.step_13.applewarehouse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LightAppleSearchCriteriaTest {

    private LightAppleSearchCriteria criteria = new LightAppleSearchCriteria();

    @Test
    public void shouldSucceed() {
        Apple apple = new Apple("red", 100);
        assertTrue(criteria.test(apple));
    }

    @Test
    public void shouldFail() {
        Apple apple = new Apple("red", 200);
        assertFalse(criteria.test(apple));
    }

}