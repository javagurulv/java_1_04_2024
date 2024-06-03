package lv.javaguru.java1.student_pavels_zuriha.lesson_7.homework.level_5;

class SaleTest {

    public static void main(String[] args) {
        SaleTest test = new SaleTest();
        test.shouldReturnMostSoldProduct1MostProfitSaleProduct2();
        test.shouldReturnMostSoldProduct2MostProfitSaleProduct1();
        test.shouldReturnMostSoldProduct2MostProfitSaleProduct2();
        test.shouldReturnMostSoldProduct1MostProfitSaleProduct1();
        test.shouldReturnNoSales();
        test.shouldReturnEquals();
        test.shouldReturnSingleProduct();
    }

    // test case 1: Product 1 (20,20) - Product 2 (100,10) = expectedResult (Most sale: product 1, Most profit: product 2)

    public void shouldReturnMostSoldProduct1MostProfitSaleProduct2() {
        SaleCalculator saleCalculator = new SaleCalculator();
        Sale[] sale = {
                new Sale("Product 1", 20, 20),
                new Sale("Product 2", 100, 10),
        };
        String realResultSale = saleCalculator.mostSoldUnit(sale);
        String realResultProfit = saleCalculator.mostProfitUnit(sale);
        checkResult(realResultSale, "Product 1", "shouldReturnMostSoldProduct1MostProfitSaleProduct2");
        checkResult(realResultProfit, "Product 2", "shouldReturnMostSoldProduct1MostProfitSaleProduct2");
    }

    // test case 2: Product 1 (100,10) - Product 2 (20,20) = expectedResult (Most sale: product 2, Most profit: product 1)

    public void shouldReturnMostSoldProduct2MostProfitSaleProduct1() {
        SaleCalculator saleCalculator = new SaleCalculator();
        Sale[] sale = {
                new Sale("Product 1", 100, 10),
                new Sale("Product 2", 20, 20),
        };
        String realResultSale = saleCalculator.mostSoldUnit(sale);
        String realResultProfit = saleCalculator.mostProfitUnit(sale);
        checkResult(realResultSale, "Product 2", "shouldReturnMostSoldProduct2MostProfitSaleProduct1");
        checkResult(realResultProfit, "Product 1", "shouldReturnMostSoldProduct2MostProfitSaleProduct1");
    }
    // test case 3: Product 1 (10,10) - Product 2 (20,20) = expectedResult (Most sale: product 2, Most profit: product 2)

    public void shouldReturnMostSoldProduct2MostProfitSaleProduct2() {
        SaleCalculator saleCalculator = new SaleCalculator();
        Sale[] sale = {
                new Sale("Product 1", 10, 10),
                new Sale("Product 2", 20, 20),
        };
        String realResultSale = saleCalculator.mostSoldUnit(sale);
        String realResultProfit = saleCalculator.mostProfitUnit(sale);
        checkResult(realResultSale, "Product 2", "shouldReturnMostSoldProduct2MostProfitSaleProduct2");
        checkResult(realResultProfit, "Product 2", "shouldReturnMostSoldProduct2MostProfitSaleProduct2");
    }

    // test case 4: Product 1 (20,20) - Product 2 (10,10) = expectedResult (Most sale: product 1, Most profit: product 1)

    public void shouldReturnMostSoldProduct1MostProfitSaleProduct1() {
        SaleCalculator saleCalculator = new SaleCalculator();
        Sale[] sale = {
                new Sale("Product 1", 20, 20),
                new Sale("Product 2", 10, 10),
        };
        String realResultSale = saleCalculator.mostSoldUnit(sale);
        String realResultProfit = saleCalculator.mostProfitUnit(sale);
        checkResult(realResultSale, "Product 1", "shouldReturnMostSoldProduct1MostProfitSaleProduct1");
        checkResult(realResultProfit, "Product 1", "shouldReturnMostSoldProduct1MostProfitSaleProduct1");
    }
    // test case 5: Product 1 (10,10) - Product 2 (10,10) = expectedResult ("Equals")

    public void shouldReturnEquals() {
        SaleCalculator saleCalculator = new SaleCalculator();
        Sale[] sale = {
                new Sale("Product 1", 10, 10),
                new Sale("Product 2", 10, 10),
        };
        String realResultSale = saleCalculator.mostSoldUnit(sale);
        String realResultProfit = saleCalculator.mostProfitUnit(sale);
        checkResult(realResultSale, "Equals", "shouldReturnEquals");
        checkResult(realResultProfit, "Equals", "shouldReturnEquals");
    }

    // test case 6: Product 1 (0,0) - Product 2 (0,0) = expectedResult ("No sales")

    public void shouldReturnNoSales() {
        SaleCalculator saleCalculator = new SaleCalculator();
        Sale[] sale = {
                new Sale("Product 1", 0, 0),
                new Sale("Product 2", 0, 0),
        };
        String realResultSale = saleCalculator.mostSoldUnit(sale);
        String realResultProfit = saleCalculator.mostProfitUnit(sale);
        checkResult(realResultSale, "No Sales", "shouldReturnNoSales");
        checkResult(realResultProfit, "No Sales", "shouldReturnNoSales");
    }

    // test case 7: Single Product 1 = expected result ("Product 1")

    public void shouldReturnSingleProduct() {
        SaleCalculator saleCalculator = new SaleCalculator();
        Sale[] sale = {
                new Sale("Product 1", 10, 10),
        };
        String realResultSale = saleCalculator.mostSoldUnit(sale);
        String realResultProfit = saleCalculator.mostProfitUnit(sale);
        checkResult(realResultSale, "Product 1", "shouldReturnSingleProduct");
        checkResult(realResultProfit, "Product 1", "shouldReturnSingleProduct");
    }


    private void checkResult(String realResult, String expectedResult, String scenarioTitle) {
        if (realResult.equals(expectedResult)) {
            System.out.println(scenarioTitle + " test: OK" );
        } else {
            System.out.println(scenarioTitle + " test: FAIL");
            System.out.println("Real Result: " + realResult + ". Expected Result: " + expectedResult);
        }


    }

}
