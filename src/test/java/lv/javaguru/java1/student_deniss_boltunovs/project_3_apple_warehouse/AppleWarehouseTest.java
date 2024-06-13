package lv.javaguru.java1.student_deniss_boltunovs.project_3_apple_warehouse;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

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
        List<Apple> green = warehouse.findApples(new GreenAppleSearchCriteria());
        assertEquals(3, green.size());

        ///////Red apples
        List<Apple> red = warehouse.findApples(new RedAppleSearchCriteria());
        assertEquals(3, red.size());

        ///////Heavy apples
        List<Apple> heavy = warehouse.findApples(new HeavyAppleSearchCriteria());
        assertEquals(4, heavy.size());

        ///////Light apples
        List<Apple> light = warehouse.findApples(new LightAppleSearchCriteria());
        assertEquals(4, light.size());

        ///////Heavy and Green apples
        List<Apple> heavyGreen = warehouse.findApples(new HeavyGreenAppleSearchCriteria());
        assertEquals(1, heavyGreen.size());

    }

    @Test
    void findApplesByAnonymousClass(){

        ///// Green apples
        List<Apple> green = warehouse.findApples( new AppleSearchCriteria() {
            @Override
            public boolean searchCriteria(Apple apple) {
                return apple.getColor().equals("green");
            }
        });
        assertEquals(3, green.size());

        ///// Red apples
        List<Apple> red = warehouse.findApples( new AppleSearchCriteria() {
            @Override
            public boolean searchCriteria(Apple apple) {
                return apple.getColor().equals("red");
            }
        });
        assertEquals(3, red.size());

        ///// Heavy apples
        List<Apple> heavy = warehouse.findApples( new AppleSearchCriteria() {
            @Override
            public boolean searchCriteria(Apple apple) {
                return apple.getWeight() > 150;
            }
        });
        assertEquals(4, heavy.size());

        ///// Light apples
        List<Apple> light = warehouse.findApples( new AppleSearchCriteria() {
            @Override
            public boolean searchCriteria(Apple apple) {
                return apple.getWeight() < 150;
            }
        });
        assertEquals(4, light.size());

        ///// Heavy and Green apples
        List<Apple> heavyGreen = warehouse.findApples( new AppleSearchCriteria() {
            @Override
            public boolean searchCriteria(Apple apple) {
                return (apple.getColor().equals("green")) && (apple.getWeight() > 150);
            }
        });
        assertEquals(1, heavyGreen.size());
    }


}