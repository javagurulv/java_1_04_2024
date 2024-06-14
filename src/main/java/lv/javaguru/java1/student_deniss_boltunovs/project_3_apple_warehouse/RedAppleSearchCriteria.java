package lv.javaguru.java1.student_deniss_boltunovs.project_3_apple_warehouse;

class RedAppleSearchCriteria implements AppleSearchCriteria {

    @Override
    public boolean searchCriteria(Apple apple) {
        String color = apple.getColor();
        return color.equals("red");
    }

}
