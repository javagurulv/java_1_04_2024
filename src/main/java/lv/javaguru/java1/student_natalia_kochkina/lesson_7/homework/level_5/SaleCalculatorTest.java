package lv.javaguru.java1.student_natalia_kochkina.lesson_7.homework.level_5;

class SaleCalculatorTest {

    public static void main(String[] args) {
        SaleCalculatorTest test = new SaleCalculatorTest();
        test.test1();
        test.test2();
    }

    public void test1() {
        SaleCalculator calculator = new SaleCalculator();
        Sale sale1 = new Sale("Potato", 5, 100);
        Sale sale2 = new Sale("Tomato", 8, 10);
        Sale sale3 = new Sale("Potato", 5, 16);
        Sale sale4 = new Sale("Apple", 15, 1);
        Sale[] sales = {sale1, sale2, sale3, sale4};
        String realResult = calculator.findMostSelling(sales);
        checkResults(realResult, "Potato", "MostSellingTest1 ");
    }

    public void test2() {
        SaleCalculator calculator = new SaleCalculator();
        Sale sale1 = new Sale("Potato", 5, 100);
        Sale sale2 = new Sale("Tomato", 888, 10);
        Sale sale3 = new Sale("Potato", 5, 16);
        Sale sale4 = new Sale("Apple", 15, 1);
        Sale[] sales = {sale1, sale2, sale3, sale4};
        String realResult = calculator.findProductWithBestTurnover(sales);
        checkResults(realResult, "Tomato",
                "FindProductWithBestTurnoverTest1 ");
    }

    private void checkResults(String realResult, String expectedResult,
                              String testScenarioName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testScenarioName + "TEST OK");
        } else {
            System.out.println(testScenarioName + "TEST FAIL");
        }
    }

}
