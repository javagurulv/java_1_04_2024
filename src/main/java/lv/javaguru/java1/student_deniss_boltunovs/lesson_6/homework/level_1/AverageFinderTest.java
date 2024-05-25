package lv.javaguru.java1.student_deniss_boltunovs.lesson_6.homework.level_1;

class AverageFinderTest {

    public static void main(String[] args) {
        AverageFinderTest test = new AverageFinderTest();
        test.test1();
        test.test2();
        test.test3();
    }

    // num1 = 8, num2 = 6, result = 7
    public void test1(){
         AverageFinder finder = new AverageFinder();
         double result = finder.findAverage(8,6);
         double expectedResult = 7;
         checkResult(result, expectedResult, "test1");
    }

    // num1 = 8, num2 = 7, result = 7.5
    public void test2(){
        AverageFinder finder = new AverageFinder();
        double result = finder.findAverage(8,7);
        double expectedResult = 7.5;
        checkResult(result, expectedResult, "test2");
    }

    // num1 = 6, num2 = -1, result = 2.5
    public void test3(){
        AverageFinder finder = new AverageFinder();
        double result = finder.findAverage(6,-1);
        double expectedResult = 2.5;
        checkResult(result, expectedResult, "test3");
    }

    public void checkResult(double realResult,
                            double expectedResult,
                            String testName) {
        if (realResult == expectedResult){
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " : FAILED" + " (result " + realResult + ", expected " + expectedResult + ")");
        }
    }


}
