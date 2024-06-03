package lv.javaguru.java1.student_natalia_kochkina.project_3_apple_warehouse;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class AppleWarehouse {

    List<Apple> findGreenApples() {
        return getAllApples().stream()
                .filter(apple -> apple.getColor().equals("green"))
                .collect(Collectors.toList());
    }

    List<Apple> findRedApples() {
        return getAllApples().stream()
                .filter(apple -> apple.getColor().equals("red"))
                .collect(Collectors.toList());
    }

    private List<Apple> apples = getAllApples();

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