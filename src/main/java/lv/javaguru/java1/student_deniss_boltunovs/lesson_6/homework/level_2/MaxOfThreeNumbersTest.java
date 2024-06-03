package lv.javaguru.java1.student_deniss_boltunovs.lesson_6.homework.level_2;

class MaxOfThreeNumbersTest {

    public static void main(String[] args) {
        MaxOfThreeNumbersTest test = new MaxOfThreeNumbersTest();
        test.testFirstNumberMax();
        test.testSecondNumberMax();
        test.testThirdNumberMax();
    }

    // num1 = 10, num2 = 7, num3 = 3, result = 10
   public void testFirstNumberMax(){
        MaxOfThreeNumbers numbers = new MaxOfThreeNumbers();
        int result = numbers.findMax(10,7,3);
        int expectedResult = 10;
        checkResult(result, expectedResult, "testFirstNumberMax");
   }

    // num1 = 7, num2 = 10, num3 = 3, result = 10
    public void testSecondNumberMax(){
        MaxOfThreeNumbers numbers = new MaxOfThreeNumbers();
        int result = numbers.findMax(7,10,3);
        int expectedResult = 10;
        checkResult(result, expectedResult, "testSecondNumberMax");
    }

    // num1 = 7, num2 = 3, num3 = 10, result = 10
    public void testThirdNumberMax(){
        MaxOfThreeNumbers numbers = new MaxOfThreeNumbers();
        int result = numbers.findMax(7,3,10);
        int expectedResult = 10;
        checkResult(result, expectedResult, "testSecondNumberMax");
    }

    public void checkResult(int realResult, int expectedResult, String testName){
        if (realResult == expectedResult) {
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " : FAILED" + " (result " + realResult + ", expected " + expectedResult + ")");
        }
    }

}
