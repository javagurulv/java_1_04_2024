package lv.javaguru.java1.teacher.project_3_apple_warehouse.step_11.applewarehouse;

import java.util.ArrayList;
import java.util.List;

class AppleWarehouse {

    private List<Apple> apples = getAllApples();

    public List<Apple> findGreenApples() {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : apples) {
            if("green".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    public List<Apple> findRedApples() {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : apples) {
            if("red".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    public List<Apple> findApplesByColor(String color) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : apples) {
            if(apple.getColor().equals(color)) {
                result.add(apple);
            }
        }
        return result;
    }

    public List<Apple> findApplesHeavierThen(int weight) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : apples) {
            if(apple.getWeight() > weight) {
                result.add(apple);
            }
        }
        return result;
    }

    public List<Apple> findApples(AppleSearchCriteria searchCriteria) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : apples) {
            if(searchCriteria.test(apple)) {
                result.add(apple);
            }
        }
        return result;
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
