package lv.javaguru.java1.teacher.project_3_apple_warehouse.step_10.applewarehouse;

class LightAppleSearchCriteria implements AppleSearchCriteria {
    @Override
    public boolean test (Apple apple) {
        return apple.getWeight() < 150;
    }
}
