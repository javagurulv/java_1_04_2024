package lv.javaguru.java1.student_natalia_kochkina.lesson_6.lessoncode;

class MaxNumberTest {

    public static void main(String[] args) {
        MaxNumberTest test = new MaxNumberTest();
        test.secondNumberIsMaxTest();
        test.firstNumberIsMaxTest();
        test.numbersAreEqualsTest();
    }

    //2, 3 -> 3
    public void secondNumberIsMaxTest() {
        MaxNumber maxNumber = new MaxNumber();
        int realResult = maxNumber.findMaxNumber(2, 3);
        checkResult(realResult, 3, " 1 ");
    }

    //2, 1 -> 1
    public void firstNumberIsMaxTest() {
        MaxNumber maxNumber = new MaxNumber();
        int realResult = maxNumber.findMaxNumber(2, 1);
        checkResult(realResult, 2, " 2 ");
    }

    //2, 2 -> 2
    public void numbersAreEqualsTest() {
        MaxNumber maxNumber = new MaxNumber();
        int realResult = maxNumber.findMaxNumber(2, 2);
        checkResult(realResult, 2, " 3 ");
    }

    private void checkResult(int realResult,
                             int expectedResult,
                             String testName) {
        if (realResult == expectedResult) {
            System.out.println("TEST" + testName + "= OK");
        } else {
            System.out.println("TEST" + testName + "= FAIL");
            System.out.println("Real result = " + realResult);
            System.out.println("Expected result = " + expectedResult);
        }
    }
}
