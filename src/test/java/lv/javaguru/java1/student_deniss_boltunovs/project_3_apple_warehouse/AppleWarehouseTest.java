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

    @Test
    void shouldReturnApplesHeavierThan150() {
        int result = warehouse.findApplesHeavierThan(150).size();
        assertEquals(4,result);
    }

    @Test
    void shouldReturnApplesHeavierThan170() {
        int result = warehouse.findApplesHeavierThan(170).size();
        assertEquals(2,result);
    }

    @Test
    void findApples(){

        ///////Green apples
        AppleSearchCriteria green = new GreenAppleSearchCriteria();
        int resultGreenApples = warehouse.findApples(green).size();
        assertEquals(3, resultGreenApples);

        ///////Red apples
        AppleSearchCriteria red = new RedAppleSearchCriteria();
        int resultRedApples = warehouse.findApples(red).size();
        assertEquals(3, resultRedApples);

        ///////Heavy apples
        AppleSearchCriteria heavy = new HeavyAppleSearchCriteria();
        int resultHeavyApples = warehouse.findApples(heavy).size();
        assertEquals(4, resultHeavyApples);

        ///////Light apples
        AppleSearchCriteria light = new LightAppleSearchCriteria();
        int resultLightApples = warehouse.findApples(light).size();
        assertEquals(4, resultLightApples);
    }


}