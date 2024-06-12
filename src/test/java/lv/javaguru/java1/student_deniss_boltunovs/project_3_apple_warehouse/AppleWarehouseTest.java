package lv.javaguru.java1.student_deniss_boltunovs.project_3_apple_warehouse;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppleWarehouseTest {

    AppleWarehouse warehouse = new AppleWarehouse();

    @Test
    void shouldReturnThreeGreenApples() {
        int result = warehouse.getAllGreenApples().size();
        assertEquals(3,result);
    }


}