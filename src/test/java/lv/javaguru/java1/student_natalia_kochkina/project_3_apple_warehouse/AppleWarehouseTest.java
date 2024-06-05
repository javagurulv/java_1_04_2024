package lv.javaguru.java1.student_natalia_kochkina.project_3_apple_warehouse;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppleWarehouseTest {

    private AppleWarehouse appleWarehouse = new AppleWarehouse();

    @Test
    void shouldFindGreenApples() {
        List<Apple> result = appleWarehouse.findGreenApples();
        assertEquals(result.size(), 3);
    }

    @Test
    void shouldFindRedApples() {
        List<Apple> result = appleWarehouse.findRedApples();
        assertEquals(result.size(), 3);
    }

    @Test
    void shouldFindApplesByColor() {
        List<Apple> result = appleWarehouse.findApplesByColor("yellow");
        assertEquals(result.size(), 2);
    }

    @Test
    void findApplesHeavierThen() {
        List<Apple> result = appleWarehouse.findApplesHeavierThen(150);
        assertEquals(result.size(), 4);
    }

    @Test
    void shouldFindApplesBySearchCriteria() {
        List<Apple> greenApples = appleWarehouse.findApples(new GreenApplesSearchCriteria());
        assertEquals(greenApples.size(), 3);

        List<Apple> redApples = appleWarehouse.findApples(new RedApplesSearchCriteria());
        assertEquals(redApples.size(), 3);

        List<Apple> heavyApples = appleWarehouse.findApples(new HeavyApplesSearchCriteria());
        assertEquals(heavyApples.size(), 4);

        List<Apple> lightweightApples = appleWarehouse.findApples(new LightweightApplesSearchCriteria());
        assertEquals(lightweightApples.size(), 4);

    }

    @Test
    void shouldFindApplesByAnonymousClass() {
        List<Apple> greenApples = appleWarehouse.findApples(new AppleSearchCriteria() {
            @Override
            public boolean test(Apple apple) {
                return "green".equals(apple.getColor());
            }
        });
        assertEquals(greenApples.size(), 3);

        List<Apple> redApples = appleWarehouse.findApples(new AppleSearchCriteria() {
            @Override
            public boolean test(Apple apple) {
                return "red".equals(apple.getColor());
            }
        });
        assertEquals(redApples.size(), 3);

        List<Apple> heavyApples = appleWarehouse.findApples(new AppleSearchCriteria() {
            @Override
            public boolean test(Apple apple) {
                return 150 < apple.getWeight();
            }
        });
        assertEquals(heavyApples.size(), 4);

        List<Apple> lightweightApples = appleWarehouse.findApples(new AppleSearchCriteria() {
            @Override
            public boolean test(Apple apple) {
                return 150 > apple.getWeight();
            }
        });
        assertEquals(lightweightApples.size(), 4);
    }

    @Test
    void shouldFindApplesByLambdaExpression() {
        List<Apple> greenApples = appleWarehouse.findApples(
                (Apple apple) -> "green".equals(apple.getColor()));
        assertEquals(greenApples.size(), 3);

        List<Apple> redApples = appleWarehouse.findApples(
                (Apple apple) -> "red".equals(apple.getColor()));
        assertEquals(redApples.size(), 3);

        List<Apple> heavyApples = appleWarehouse.findApples(
                (Apple apple) -> 150 < apple.getWeight());
        assertEquals(heavyApples.size(), 4);

        List<Apple> lightweightApples = appleWarehouse.findApples(
                (Apple apple) -> 150 > apple.getWeight());
        assertEquals(lightweightApples.size(), 4);
    }

}