package lv.javaguru.java1.student_pavels_zuriha.project_3_apple_warehouse;

import java.util.List;

class AppleWarehouseTest {

    public static void main(String[] args) {

        AppleWarehouseTest test = new AppleWarehouseTest();
        test.testGreenAppleCount();

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


}
