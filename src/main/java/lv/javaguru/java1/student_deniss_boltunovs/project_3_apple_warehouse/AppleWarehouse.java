package lv.javaguru.java1.student_deniss_boltunovs.project_3_apple_warehouse;

import java.util.ArrayList;
import java.util.List;

class AppleWarehouse {

    private List<Apple> apples = getAllApples();

    List<Apple> findApplesByColor(String color) {
        List<Apple> applesArray = new ArrayList<>();
        for (Apple apple : apples) {
            String appleColor = apple.getColor();
            if (appleColor.equals(color)) {
                applesArray.add(apple);
            }
        }
        return applesArray;
    }


    private List<Apple> getAllApples() {
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

}
