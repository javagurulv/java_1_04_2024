package lv.javaguru.java1.student_deniss_boltunovs.lesson_6.homework.level_1;

class AverageFinderTest {

    public static void main(String[] args) {
        AverageFinderTest test = new AverageFinderTest();
        test.test1AverageWholeNumber();
        test.test2AverageDecimalNumber();
        test.test3AverageDecimalNumber();
    }

    // input  - 8,6
    // output - 7
    public void test1AverageWholeNumber(){
         AverageFinder finder = new AverageFinder();
         double result = finder.findAverage(8,6);
         double expectedResult = 7;
         if (result == expectedResult){
             System.out.println("TEST 1 averageWholeNumber: OK");
         } else {
             System.out.println("TEST 1 averageWholeNumber: FAILED (expected " + expectedResult + ", result " + result + ")");
         }
    }

    // input  - 8,7
    // output - 7.5
    public void test2AverageDecimalNumber(){
        AverageFinder finder = new AverageFinder();
        double result = finder.findAverage(8,7);
        double expectedResult = 7.5;
        if (result == expectedResult){
            System.out.println("TEST 2 averageDecimalNumber: OK");
        } else {
            System.out.println("TEST 2 averageDecimalNumber: FAILED (expected " + expectedResult + ", result " + result + ")");
        }
    }

    // input  - 6,133
    // output - 69.5
    public void test3AverageDecimalNumber(){
        AverageFinder finder = new AverageFinder();
        double result = finder.findAverage(6,133);
        double expectedResult = 69.5;
        if (result == expectedResult){
            System.out.println("TEST 3 averageDecimalNumber: OK");
        } else {
            System.out.println("TEST 3 averageDecimalNumber: FAILED (expected " + expectedResult + ", result " + result + ")");
        }
    }

}
