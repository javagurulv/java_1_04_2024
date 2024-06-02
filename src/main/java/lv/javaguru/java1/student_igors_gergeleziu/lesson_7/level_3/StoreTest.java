package lv.javaguru.java1.student_igors_gergeleziu.lesson_7.level_3;

class StoreTest {
    public static void main(String[] args) {
        StoreTest test = new StoreTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
        test.test5();
    }

    void test1() {
        Store store = new Store();
        CashReceipt[] receiptArray = store.createReceiptArray(3);
        checkResult(receiptArray.length == 3, true, "CreateArrayWithDefinedLengthTest1");
    }

    void test2() {
        Store store = new Store();
        CashReceipt[] receiptArray = store.createReceiptArray(1);
        receiptArray[0] = new CashReceipt(2, 10);
        checkResult(receiptArray[0].getReceiptID() == 2, true, "ReceiptHasIDInFilledArrayTest2");
    }

    void test3() {
        Store store = new Store();
        CashReceipt[] receiptArray = getTestArray(3);
        checkResult(store.calculatePurchaseAmount(receiptArray) == 30, true, "CalculatePurchaseAmountTest3");
    }

    void test4() {
        Store store = new Store();
        CashReceipt[] receiptArray = getTestArray(1);
        checkResult(store.calculatePurchaseAmount(receiptArray) == 10, true, "CalculatePurchaseAmountTest4");
    }

    void test5() {
        Store store = new Store();
        CashReceipt[] receiptArray = getTestArray(5);
        checkResult(store.calculateAveragePurchaseAmount(receiptArray) == 10.0, true, "CalculateAveragePurchaseAmountTest5");
    }

    CashReceipt[] getTestArray(int arraySize) {
        CashReceipt[] testArray = new CashReceipt[arraySize];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = new CashReceipt(i, 10);
        }
        return testArray;
    }


    void checkResult(boolean actualResult, boolean expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }
}
