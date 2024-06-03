package lv.javaguru.java1.student_deniss_boltunovs.lesson_7.homework.level_5;

class SalesAnalyserTest {

    public static void main(String[] args) {
        SalesAnalyserTest test = new SalesAnalyserTest();
        test.testBestSellingProductC();
        test.testBestSellingProductB();
        test.testBestSellingProductWithEmptySalesArray();
    }

    // single sale, expected output -> Product C
    public void testBestSellingProductC(){
        Sale[] sales = {new Sale("Product C", 15.0, 5)};
        SalesAnalyser analyser = new SalesAnalyser();
        String realResult = analyser.bestSellingProduct(sales);
        String expectedResult = "Product C";
        checkResult(realResult,expectedResult, "testBestSellingProductC");
    }

   // multiple sales, expected output -> Product B
    public void testBestSellingProductB(){
        Sale[] sales = {
                new Sale("Product A", 10.0, 7),
                new Sale("Product B", 5.0, 5),
                new Sale("Product A", 20.0, 5),
                new Sale("Product C", 15.0, 5),
                new Sale("Product B", 8.0, 9)};
        SalesAnalyser analyser = new SalesAnalyser();
        String realResult = analyser.bestSellingProduct(sales);
        String expectedResult = "Product B";
        checkResult(realResult,expectedResult, "testBestSellingProductB");
    }

    // empty sales array, expected output -> null
    public void testBestSellingProductWithEmptySalesArray() {
        SalesAnalyser analyser = new SalesAnalyser();
        Sale[] sales = {};
        String realResult = analyser.bestSellingProduct(sales);
        String expectedResult = null;
        checkResultForNullOrEmptyArray(realResult, expectedResult,"testBestSellingProductWithEmptySalesArray");
    }

    private void checkResult(String realResult,
                             String expectedResult,
                             String testName) {
       if (realResult.equals(expectedResult)) {
          System.out.println(testName + ": OK");
       } else {
           System.out.println(testName + ": FAILED (expected " + expectedResult + ", received " + realResult +")");
       }
    }

    private void checkResultForNullOrEmptyArray(String realResult,
                                                String expectedResult,
                                                String testName) {
        if (realResult == null) {
            System.out.println(testName + ": OK");
        } else {
            System.out.println(testName + ": FAILED (expected " + expectedResult + ", received " + realResult +")");
        }
    }

}
