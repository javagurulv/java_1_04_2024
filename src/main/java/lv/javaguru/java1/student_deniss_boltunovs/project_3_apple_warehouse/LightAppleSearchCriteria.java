package lv.javaguru.java1.student_deniss_boltunovs.project_3_apple_warehouse;

class LightAppleSearchCriteria implements AppleSearchCriteria {

    public boolean searchCriteria(Apple apple){
        return apple.getWeight() < 150;
    }

}
