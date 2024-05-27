package lv.javaguru.java1.student_natalia_kochkina.project1_fraud_detector;

class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        test.traderNameTest1();
        test.traderNameTest2();
    }

    //Trader's name = Pokemon -> false
    public void traderNameTest1() {
        FraudDetector detector = new FraudDetector();
        Transaction transaction = new Transaction(new Trader("Pokemon",
                "Tokio"), 10000);
        boolean realResult = detector.isFraud(transaction);
        checkResults(realResult, false, "traderNameTest1 ");
    }

    //Trader's name = Pikachu -> true
    public void traderNameTest2() {
        FraudDetector detector = new FraudDetector();
        Transaction transaction = new Transaction(new Trader("Pikachu",
                "Tokio"), 10000);
        boolean realResult = detector.isFraud(transaction);
        checkResults(realResult, true, "traderNameTest2 ");
    }


    private void checkResults(boolean realResult, boolean expectedResult,
                              String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + "TEST OK");
        } else {
            System.out.println(testScenarioName + "TEST FAIL");
        }
    }

}
