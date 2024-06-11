package lv.javaguru.java1.student_igors_gergeleziu.lesson_7.level_5;

class SaleTest {
    public static void main(String[] args) {
        SaleTest test = new SaleTest();
        test.test1();
        test.test2();
    }

    Sale[] createTestArray() {
        Sale[] testArray = {new Sale("Headphones", 25.0, 4),
                new Sale("Batteries", 5.0, 10),
                new Sale("Phone Case", 10.0, 3),
                new Sale("Flash Drive", 8.0, 5),
                new Sale("Phone", 250.0, 2),
                new Sale("Laptop", 400.0, 1),
                new Sale("Phone Charger", 15.0, 6),
                new Sale("Vacuum Cleaner", 150.0, 3),
                new Sale("Wireless Speaker", 18.0, 5)};
        return testArray;
    }

    void test1() {
        SaleReport saleReport = new SaleReport();
        String actualResult = saleReport.findBestSellingProductByUnitCount(createTestArray());
        checkResult(actualResult, "Batteries", "findBestSellingProductByUnitCountTest1");
    }

    void test2() {
        SaleReport saleReport = new SaleReport();
        String actualResult = saleReport.findBestSellingProductBySalesTurnover(createTestArray());
        checkResult(actualResult, "Phone", "findBestSellingProductBySalesTurnoverTest2");
    }

    void checkResult(String actualResult, String expectedResult, String testName) {
        if (actualResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }
}
