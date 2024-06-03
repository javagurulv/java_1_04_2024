package lv.javaguru.java1.student_natalia_kochkina.project_3_apple_warehouse;

class GreenApplesSearchCriteria implements AppleSearchCriteria{
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("green");
    }

}
