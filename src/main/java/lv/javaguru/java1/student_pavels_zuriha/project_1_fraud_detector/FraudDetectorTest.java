package lv.javaguru.java1.student_pavels_zuriha.project_1_fraud_detector;

class FraudDetectorTest {

    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        test.testNameCheckerShouldReturnFalse();
        test.testNameCheckerShouldReturnTrue();
        test.testTransactionBelow1000000();
        test.testTransactionAbove1000000();
    }

    public void testNameCheckerShouldReturnFalse() {

        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Pokemon", "Riga");
        Transaction transaction = new Transaction(trader, 120);

        boolean realResult = fraudDetector.isFraud(transaction);
        if (realResult == false) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAILED");
        }
    }

    public void testNameCheckerShouldReturnTrue() {

        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Not Pokemon", "Riga");
        Transaction transaction = new Transaction(trader, 120);

        boolean realResult = fraudDetector.isFraud(transaction);
        if (realResult) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAILED");
        }
    }

    public void testTransactionBelow1000000() {

        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Not Pokemon", "Riga");
        Transaction transaction = new Transaction(trader, 100000);

        boolean realResult = fraudDetector.transactionAbove1Million(transaction);
        if (realResult) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAILED");
        }
    }

    public void testTransactionAbove1000000() {

        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Not Pokemon", "Riga");
        Transaction transaction = new Transaction(trader, 1000001);

        boolean realResult = fraudDetector.transactionAbove1Million(transaction);
        if (!realResult) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAILED");
        }
    }


}
