package lv.javaguru.java1.student_pavels_zuriha.project_3_apple_warehouse;

import java.util.List;

class AppleWarehouseTest {

    public static void main(String[] args) {

        AppleWarehouseTest test = new AppleWarehouseTest();
        test.testGreenAppleCount();
        test.testRedAppleCount();
        test.testAppleCount();

    }

    void testGreenAppleCount() {

        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> apples = appleWarehouse.getAllApples();

        int realResult = appleWarehouse.countGreenApples(apples);
        if (realResult == 3) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAILED. Real Result: " + realResult);
        }
    }

    void testRedAppleCount() {

        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> apples = appleWarehouse.getAllApples();

        int realResult = appleWarehouse.countRedApples(apples);
        if (realResult == 3) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAILED. Real Result: " + realResult);
        }
    }

    void testAppleCount() {

        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> apples = appleWarehouse.getAllApples();

        int realResult = appleWarehouse.countAppleByColor("yellow", apples);
        if (realResult == 2) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAILED. Real Result: " + realResult);
        }
    }

}
