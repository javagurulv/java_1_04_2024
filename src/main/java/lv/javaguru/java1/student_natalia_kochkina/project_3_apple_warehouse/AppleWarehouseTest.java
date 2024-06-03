package lv.javaguru.java1.student_natalia_kochkina.project_3_apple_warehouse;

import java.util.ArrayList;
import java.util.List;

class AppleWarehouseTest {

    public static void main(String[] args) {
    AppleWarehouseTest test = new AppleWarehouseTest();
    test.greenApplesTest1();
    }

    public void greenApplesTest1() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> realResult = appleWarehouse.findGreenApples();
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("green", 200));
        expectedResult.add(new Apple("green", 90));
        expectedResult.add(new Apple("green", 50));
        checkResult(realResult, expectedResult, "greenApples");
    }

    private void checkResult(List realResult,
                             List expectedResult,
                             String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println("TEST" + testName + "= OK");
        } else {
            System.out.println("TEST" + testName + "= FAIL");
        }
    }

}
