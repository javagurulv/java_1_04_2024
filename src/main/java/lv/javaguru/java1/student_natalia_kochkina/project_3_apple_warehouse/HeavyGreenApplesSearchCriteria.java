package lv.javaguru.java1.student_natalia_kochkina.project_3_apple_warehouse;

class HeavyGreenApplesSearchCriteria implements AppleSearchCriteria {

    private GreenApplesSearchCriteria appleIsGreen = new GreenApplesSearchCriteria();
    private HeavyApplesSearchCriteria appleIsHeavy = new HeavyApplesSearchCriteria();

    @Override
    public boolean test(Apple apple) {
        return appleIsGreen.test(apple) && appleIsHeavy.test(apple);
    }

}
