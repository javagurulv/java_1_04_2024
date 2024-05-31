package lv.javaguru.java1.student_natalia_kochkina.project1_fraud_detector;

class FraudRuleTest {

    public static void main(String[] args) {
        FraudRuleTest test = new FraudRuleTest();
        test.fraudRule1Test1();
        test.fraudRule1Test2();
        test.fraudRule2Test1();
        test.fraudRule2Test2();
        test.fraudRule3Test1();
        test.fraudRule3Test2();
        test.fraudRule4Test1();
        test.fraudRule4Test2();
        test.fraudRule5Test1();
        test.fraudRule5Test2();
    }

    public void fraudRule1Test1() {
        FraudRule1 fraudRule1 = new FraudRule1();
        Transaction transaction = new Transaction(new Trader("Pokemon",
                "Tokio", "Japan"), 10000);
        boolean realResult = fraudRule1.isFraud(transaction);
        checkResults(realResult, true, "fraudRule1Test1 ");
    }

    public void fraudRule1Test2() {
        FraudRule1 fraudRule1 = new FraudRule1();
        Transaction transaction = new Transaction(new Trader("Pikachu",
                "Tokio", "Japan"), 10000);
        boolean realResult = fraudRule1.isFraud(transaction);
        checkResults(realResult, false, "fraudRule1Test2 ");
    }

    public void fraudRule2Test1() {
        FraudRule2 fraudRule2 = new FraudRule2();
        Transaction transaction = new Transaction(new Trader("Pikachu",
                "Tokio", "Japan"), 1500000);
        boolean realResult = fraudRule2.isFraud(transaction);
        checkResults(realResult, true, "fraudRule2Test1 ");
    }

    public void fraudRule2Test2() {
        FraudRule2 fraudRule2 = new FraudRule2();
        Transaction transaction = new Transaction(new Trader("Pikachu",
                "Tokio", "Japan"), 15000);
        boolean realResult = fraudRule2.isFraud(transaction);
        checkResults(realResult, false, "fraudRule2Test2 ");
    }

    public void fraudRule3Test1() {
        FraudRule3 fraudRule3 = new FraudRule3();
        Transaction transaction = new Transaction(new Trader("Pikachu",
                "Tokio", "Japan"), 1500000);
        boolean realResult = fraudRule3.isFraud(transaction);
        checkResults(realResult, false, "fraudRule3Test1 ");
    }

    public void fraudRule3Test2() {
        FraudRule3 fraudRule3 = new FraudRule3();
        Transaction transaction = new Transaction(new Trader("Pikachu",
                "Sydney", "Australia"), 1500000);
        boolean realResult = fraudRule3.isFraud(transaction);
        checkResults(realResult, true, "fraudRule3Test2 ");
    }

    public void fraudRule4Test1() {
        FraudRule4 fraudRule4 = new FraudRule4();
        Transaction transaction = new Transaction(new Trader("Pikachu",
                "Tokio", "Japan"), 1500000);
        boolean realResult = fraudRule4.isFraud(transaction);
        checkResults(realResult, false, "fraudRule4Test1 ");
    }

    public void fraudRule4Test2() {
        FraudRule4 fraudRule4 = new FraudRule4();
        Transaction transaction = new Transaction(new Trader("Pikachu",
                "Kingston", "Jamaica"), 1500000);
        boolean realResult = fraudRule4.isFraud(transaction);
        checkResults(realResult, true, "fraudRule4Test2 ");
    }

    public void fraudRule5Test1() {
        FraudRule5 fraudRule5 = new FraudRule5();
        Transaction transaction = new Transaction(new Trader("Pikachu",
                "Berlin", "Germany"), 150);
        boolean realResult = fraudRule5.isFraud(transaction);
        checkResults(realResult, false, "fraudRule5Test1 ");
    }

    public void fraudRule5Test2() {
        FraudRule5 fraudRule5 = new FraudRule5();
        Transaction transaction = new Transaction(new Trader("Pikachu",
                "Berlin", "Germany"), 15000);
        boolean realResult = fraudRule5.isFraud(transaction);
        checkResults(realResult, true, "fraudRule5Test2 ");
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
