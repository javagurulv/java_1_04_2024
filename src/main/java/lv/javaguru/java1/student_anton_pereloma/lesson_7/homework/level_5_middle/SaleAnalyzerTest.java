package lv.javaguru.java1.student_anton_pereloma.lesson_7.homework.level_5_middle;

class SaleAnalyzerTest {
    public static void main(String[] args) {
        SaleAnalyzerTest test = new SaleAnalyzerTest();
        test.findingBestSellerFromArrayOfMany();
        test.findingBestSellerFromArrayOfOne();
        test.findingBestSellerFromEmptyArray();
    }
    public void findingBestSellerFromArrayOfMany() {
        Sale[] testArr = {
                new Sale("Product1",10,10),
                new Sale("Product2",5,5),
                new Sale("Product3",1,1),

        };
        SaleAnalyser saleAnalyser = new SaleAnalyser();

        String result = saleAnalyser.findBestSeller(testArr);
        checkResult(result,"Product1","findingBestSellerFromArrayOfMany");

    }

    public void findingBestSellerFromArrayOfOne() {
        Sale[] testArr = {
                new Sale("Product1",10,1),
        };
        SaleAnalyser saleAnalyser = new SaleAnalyser();

        String result = saleAnalyser.findBestSeller(testArr);
        checkResult(result,"Product1","findingBestSellerFromArrayOfOne");

    }

    public void findingBestSellerFromEmptyArray() {
        Sale[] testArr = {};
        SaleAnalyser saleAnalyser = new SaleAnalyser();

        String result = saleAnalyser.findBestSeller(testArr);
        checkResult(result,"No Best Seller","findingBestSellerFromEmptyArray");
    }


    private void checkResult(String realResult,
                             String expectedResult,
                             String testScenarioName) {
        if (expectedResult.equals(realResult)) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }
}
