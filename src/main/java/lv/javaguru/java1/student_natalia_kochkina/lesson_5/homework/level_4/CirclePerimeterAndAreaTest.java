package lv.javaguru.java1.student_natalia_kochkina.lesson_5.homework.level_4;

import java.math.BigDecimal;

class CirclePerimeterAndAreaTest {

    public static void main(String[] args) {
        CirclePerimeterAndAreaTest test = new CirclePerimeterAndAreaTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
    }

    //0 -> 0
    public void test1() {
        CirclePerimeterAndArea circlePerimeterAndArea = new CirclePerimeterAndArea();
        BigDecimal realResult = circlePerimeterAndArea.calculatePerimeter(BigDecimal.ZERO);
        checkResult(realResult, new BigDecimal("0"),
                "perimeterTest1 ");
    }

    //7.5 -> 47.12
    public void test2() {
        CirclePerimeterAndArea circlePerimeterAndArea = new CirclePerimeterAndArea();
        BigDecimal radius = new BigDecimal("7.5");
        BigDecimal realResult = circlePerimeterAndArea.calculatePerimeter(radius);
        checkResult(realResult, new BigDecimal("47.12"),
                "perimeterTest2 ");
    }

    //0 -> 0
    public void test3() {
        CirclePerimeterAndArea circlePerimeterAndArea = new CirclePerimeterAndArea();
        BigDecimal realResult = circlePerimeterAndArea.calculateArea(BigDecimal.ZERO);
        checkResult(realResult, new BigDecimal("0"),
                "areaTest1 ");
    }

    //7.5 -> 176.63
    public void test4() {
        CirclePerimeterAndArea circlePerimeterAndArea = new CirclePerimeterAndArea();
        BigDecimal radius = new BigDecimal("7.5");
        BigDecimal realResult = circlePerimeterAndArea.calculateArea(radius);
        checkResult(realResult, new BigDecimal("176.71"),
                "areaTest2 ");
    }


    private void checkResult(BigDecimal realResult,
                             BigDecimal expectedResult,
                             String testScenarioName) {
        if ((realResult.compareTo(expectedResult)) == 0) {
            System.out.println(testScenarioName + "TEST OK");
        } else {
            System.out.println(testScenarioName + "TEST FAIL");
        }
    }

}
