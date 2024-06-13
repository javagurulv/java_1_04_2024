package lv.javaguru.java1.student_deniss_boltunovs.project_3_apple_warehouse;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppleWarehouseTest {

    AppleWarehouse warehouse = new AppleWarehouse();

    @Test
    void shouldReturnGreenApples() {
        int result = warehouse.findApplesByColor("green").size();
        assertEquals(3,result);
    }

    @Test
    void shouldReturnRedApples() {
        int result = warehouse.findApplesByColor("red").size();
        assertEquals(3,result);
    }

    @Test
    void shouldReturnYellowApples() {
        int result = warehouse.findApplesByColor("yellow").size();
        assertEquals(2,result);
    }

}