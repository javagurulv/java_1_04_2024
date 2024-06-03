package lv.javaguru.java1.student_natalia_kochkina.project_3_apple_warehouse;

class RedApplesSearchCriteria implements AppleSearchCriteria {
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("red");
    }

}
