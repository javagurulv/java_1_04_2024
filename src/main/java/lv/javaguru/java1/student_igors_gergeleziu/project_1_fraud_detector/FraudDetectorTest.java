package lv.javaguru.java1.student_igors_gergeleziu.project_1_fraud_detector;

class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        test.shouldRejectTransactionByTradersNameTest1();
        test.shouldApproveTransactionTest2();
        test.shouldRejectTransactionByAmountTest3();
        test.shouldApproveTransactionTest4();
        test.shouldRejectTransactionByCityTest5();
        test.shouldApproveTransactionTest6();
        test.shouldRejectTransactionByCountryTest7();
        test.shouldApproveTransactionTest8();
        test.shouldRestrictTransactionByCountryAndAmountTest9();
    }

    void shouldRejectTransactionByTradersNameTest1() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Pokemon", "London");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetectionResult fraudDetectionResult=fraudDetector.isFraud(transaction);
        boolean actualResult = fraudDetectionResult.isFraud();
        checkResult(actualResult, true, "shouldRejectTransactionByTradersNameTest1");
        String actualRuleName=fraudDetectionResult.getRuleName();
        checkResult(actualRuleName, "Rule1", "shouldRejectTransactionByRule1Test1");
    }

    void shouldApproveTransactionTest2() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Jack Jones", "Paris");
        Transaction transaction = new Transaction(trader, 1500);
        FraudDetectionResult fraudDetectionResult=fraudDetector.isFraud(transaction);
        boolean actualResult = fraudDetectionResult.isFraud();
        checkResult(actualResult, false, "shouldApproveTransactionTest2");
    }
    void shouldRejectTransactionByAmountTest3(){
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Jim Carrey", "New York");
        Transaction transaction = new Transaction(trader, 1000001);
        FraudDetectionResult fraudDetectionResult=fraudDetector.isFraud(transaction);
        boolean actualResult = fraudDetectionResult.isFraud();
        checkResult(actualResult, true, "shouldRejectTransactionByAmountTest3");
        String actualRuleName=fraudDetectionResult.getRuleName();
        checkResult(actualRuleName, "Rule2", "shouldRejectTransactionByRule2Test3");
    }
    void shouldApproveTransactionTest4(){
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Emma Watson", "Boston");
        Transaction transaction = new Transaction(trader, 50000);
        FraudDetectionResult fraudDetectionResult=fraudDetector.isFraud(transaction);
        boolean actualResult = fraudDetectionResult.isFraud();
        checkResult(actualResult, false, "shouldApproveTransactionTest4");
    }
    void shouldRejectTransactionByCityTest5(){
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Rick James", "Sidney");
        Transaction transaction = new Transaction(trader, 12000);
        FraudDetectionResult fraudDetectionResult=fraudDetector.isFraud(transaction);
        boolean actualResult = fraudDetectionResult.isFraud();
        checkResult(actualResult, true, "shouldRestrictTransactionByCityTest5");
        String actualRuleName=fraudDetectionResult.getRuleName();
        checkResult(actualRuleName, "Rule3", "shouldRejectTransactionByRule3Test5");
    }
    void shouldApproveTransactionTest6(){
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Harry Potter", "California");
        Transaction transaction = new Transaction(trader, 5000);
        FraudDetectionResult fraudDetectionResult=fraudDetector.isFraud(transaction);
        boolean actualResult = fraudDetectionResult.isFraud();
        checkResult(actualResult, false, "shouldApproveTransactionTest6");
    }
    void shouldRejectTransactionByCountryTest7(){
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Lindsey Lohan", "Kingston", "Jamaica");
        Transaction transaction = new Transaction(trader, 165000);
        FraudDetectionResult fraudDetectionResult=fraudDetector.isFraud(transaction);
        boolean actualResult = fraudDetectionResult.isFraud();
        checkResult(actualResult, true, "shouldRejectTransactionByCountryTest7");
        String actualRuleName=fraudDetectionResult.getRuleName();
        checkResult(actualRuleName, "Rule4", "shouldRejectTransactionByRule4Test7");
    }
    void shouldApproveTransactionTest8(){
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Den Brown", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 800);
        FraudDetectionResult fraudDetectionResult=fraudDetector.isFraud(transaction);
        boolean actualResult = fraudDetectionResult.isFraud();
        checkResult(actualResult, false, "shouldApproveTransactionTest8");
    }
    void shouldRestrictTransactionByCountryAndAmountTest9(){
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Big Lebowski", "Munich", "Germany");
        Transaction transaction = new Transaction(trader, 2000);
        FraudDetectionResult fraudDetectionResult=fraudDetector.isFraud(transaction);
        boolean actualResult = fraudDetectionResult.isFraud();
        checkResult(actualResult, true, "shouldRestrictTransactionByCountryAndAmountTest9");
        String actualRuleName=fraudDetectionResult.getRuleName();
        checkResult(actualRuleName, "Rule5", "shouldRejectTransactionByRule5Test9");
    }

    void checkResult(boolean actualResult, boolean expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }
    void checkResult(String actualResult, String expectedResult, String testName) {
        if (actualResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }
}
