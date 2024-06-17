package lv.javaguru.java1.student_pavels_zuriha.project_3_apple_warehouse;

import java.util.ArrayList;
import java.util.List;

class AppleWarehouse {

    private List<Apple> apples = getAllApples();

    public List<Apple> findHeavyApples(int heavyWeight) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : apples) {
            if(apple.getWeight() > heavyWeight) {
                result.add(apple);
            }
        }
        return result;
    }

    public List<Apple> getAllApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        apples.add(new Apple("yellow", 170));
        return apples;
    }


    public int countGreenApples(List<Apple> apples) {

        int greenApplesCount = 0;
        for (Apple apple : apples) {
            if (apple.getColor().equals("green")) {
                greenApplesCount += 1;
            }
        }
        return greenApplesCount;
    }

    public int countRedApples(List<Apple> apples) {

        int redApplesCount = 0;
        for (Apple apple : apples) {
            if (apple.getColor().equals("red")) {
                redApplesCount += 1;
            }
        }
        return redApplesCount;
    }

    public int countAppleByColor(String color, List<Apple> apples) {

        int appleCount = 0;
        for (Apple apple : apples) {
            if (apple.getColor().equals(color)) {
                appleCount += 1;
            }
        }
        return appleCount;
    }

}
