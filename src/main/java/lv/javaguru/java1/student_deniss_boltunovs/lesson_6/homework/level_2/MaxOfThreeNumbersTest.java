package lv.javaguru.java1.student_deniss_boltunovs.lesson_6.homework.level_2;

class MaxOfThreeNumbersTest {

    public static void main(String[] args) {
        MaxOfThreeNumbersTest test = new MaxOfThreeNumbersTest();
        test.testFirstNumberMax();
        test.testSecondNumberMax();
        test.testThirdNumberMax();
    }

   // input  - 10, 7, 3
   // output - 10
   public void testFirstNumberMax(){
        MaxOfThreeNumbers numbers = new MaxOfThreeNumbers();
        int result = numbers.findMax(10,7,3);
        int expectedResult = 10;
        if (result == expectedResult) {
            System.out.println("TEST 1 firstNumberMax: OK");
        } else {
            System.out.println("TEST 1 firstNumberMax: FAILED (expected " + expectedResult + ", received " + result + ")");
        }
   }

    // input  - 7, 10, 3
    // output - 10
    public void testSecondNumberMax(){
        MaxOfThreeNumbers numbers = new MaxOfThreeNumbers();
        int result = numbers.findMax(7,10,3);
        int expectedResult = 10;
        if (result == expectedResult) {
            System.out.println("TEST 2 secondNumberMax: OK");
        } else {
            System.out.println("TEST 2 secondNumberMax: FAILED (expected " + expectedResult + ", received " + result + ")");
        }
    }

    // input  - 7, 3, 10
    // output - 10
    public void testThirdNumberMax(){
        MaxOfThreeNumbers numbers = new MaxOfThreeNumbers();
        int result = numbers.findMax(7,3,10);
        int expectedResult = 10;
        if (result == expectedResult) {
            System.out.println("TEST 3 thirdNumberMax: OK");
        } else {
            System.out.println("TEST 3 thirdNumberMax: FAILED (expected " + expectedResult + ", received " + result + ")");
        }
    }

}
