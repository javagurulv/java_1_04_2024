package lv.javaguru.java1.student_maksims_latkovskis.project_1_fraud_detector;

class FraudDetectorTest {

    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();

        test.test1();
        test.test2();
        test.test3();
        test.test4();
        test.test5();
        test.test6();
        test.test7();
        test.test8();
        test.test9();
    }

    void test1() {
        // case John, Sydney (invalid)
        testPrint("Test 1", "John", "Sydney", "Australia", 799, true);
    }

    void test2() {
        // case Pokemon (invalid)
        testPrint("Test 2", "Pokemon", "London", "UK", 40, true);
    }

    void test3() {
        // case pokemon (valid)
        testPrint("Test 3", "pokemon", "London", "UK", 60, false);
    }

    void test4() {
        // case 1000001 (invalid)
        testPrint("Test 4", "Fred", "NYC", "US", 1000001, true);
    }

    void test5() {
        // case 999 (valid)
        testPrint("Test 5", "Greg", "Memphis", "US", 999, false);
    }

    void test6() {
        // case Pokemon, 8888888 (invalid)
        testPrint("Test 6", "Pokemon", "Dallas", "US", 88888888, true);
    }

    void test7() {
        // case Pokemon, 8888888 (invalid)
        testPrint("Test 7", "Bob Marley", "Kingston", "Jamaica", 23, true);
    }

    void test8() {
        // case Hans, 1001, Germany (invalid)
        testPrint("Test 8", "Hans", "Stuttgart", "Germany", 1001, true);
    }

    void test9() {
        // case Ulrich, 1001, Germany (invalid)
        testPrint("Test 9", "Ulrich", "Bremen", "Germany", 659, false);
    }


    void testPrint(String testName, String fullName, String city, String country, int amount, boolean expectedOutput) {
        Trader trader = new Trader(fullName, city, country);
        Transaction transaction = new Transaction(trader, amount);
        FraudDetector fraudDetector = new FraudDetector();
        FraudDetectionResult isValid = fraudDetector.isFraud(transaction);
        if (isValid.isFraud() == expectedOutput) System.out.println(testName + " Pass");
        else System.out.println(testName + " Fail");
    }


}
