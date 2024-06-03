package lv.javaguru.java1.student_natalia_kochkina.project_3_apple_warehouse;

import java.util.ArrayList;
import java.util.List;

class AppleWarehouseTest {

    public static void main(String[] args) {
    AppleWarehouseTest test = new AppleWarehouseTest();
    test.findGreenApplesTest();
    test.findRedApplesTest();
    test.findApplesByColorTest1();
    test.findApplesByColorTest2();
    test.findHeavyApplesTest();
    }

    public void findGreenApplesTest() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> realResult = appleWarehouse.findGreenApples();
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("green", 200));
        expectedResult.add(new Apple("green", 90));
        expectedResult.add(new Apple("green", 50));
        checkResult(realResult, expectedResult, "findGreenApples");
    }

    public void findRedApplesTest() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> realResult = appleWarehouse.findRedApples();
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("red", 100));
        expectedResult.add(new Apple("red", 160));
        expectedResult.add(new Apple("red", 200));
        checkResult(realResult, expectedResult, "findRedApples");
    }

    public void findApplesByColorTest1() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> realResult = appleWarehouse.findApplesByColor("yellow");
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("yellow", 50));
        expectedResult.add(new Apple("yellow", 170));
        checkResult(realResult, expectedResult, "findApplesByColor1");
    }

    public void findApplesByColorTest2() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> realResult = appleWarehouse.findApplesByColor("blue");
        List<Apple> expectedResult = new ArrayList<>();
        checkResult(realResult, expectedResult, "findApplesByColor2");
    }

    public void findHeavyApplesTest() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> realResult = appleWarehouse.findApplesHeavierThen(150);
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("red", 160));
        expectedResult.add(new Apple("red", 200));
        expectedResult.add(new Apple("green", 200));
        expectedResult.add(new Apple("yellow", 170));
        checkResult(realResult, expectedResult, "findHeavyApples");
    }

    private void checkResult(List realResult,
                             List expectedResult,
                             String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println("TEST " + testName + " = OK");
        } else {
            System.out.println("TEST " + testName + " = FAIL");
        }
    }

}
