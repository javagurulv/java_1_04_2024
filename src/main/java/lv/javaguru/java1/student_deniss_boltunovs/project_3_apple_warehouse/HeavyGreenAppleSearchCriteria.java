package lv.javaguru.java1.student_deniss_boltunovs.project_3_apple_warehouse;

class HeavyGreenAppleSearchCriteria implements AppleSearchCriteria {

    private GreenAppleSearchCriteria searchGreen = new GreenAppleSearchCriteria();
    private HeavyAppleSearchCriteria searchHeavy = new HeavyAppleSearchCriteria();

    @Override
    public boolean searchCriteria(Apple apple){
        return searchGreen.searchCriteria(apple) && searchHeavy.searchCriteria(apple);
    }

}
