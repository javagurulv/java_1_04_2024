package lv.javaguru.java1.student_igors_gergeleziu.lesson_6.level_2.task_2;

class MaxOfThreeNumbersTest {
    public static void main(String[] args) {
        MaxOfThreeNumbersTest test= new MaxOfThreeNumbersTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
        test.test5();
    }
    void test1(){
        MaxOfThreeNumbers maxOfThreeNumbers= new MaxOfThreeNumbers();
        int actualResult= maxOfThreeNumbers.findMax(0,0,0);
        checkResult(actualResult, 0, "maxNumberIsZeroTest1");
    }
    void test2(){
        MaxOfThreeNumbers maxOfThreeNumbers= new MaxOfThreeNumbers();
        int actualResult= maxOfThreeNumbers.findMax(1,2,3);
        checkResult(actualResult, 3, "maxNumberIsThreeTest2");
    }
    void test3(){
        MaxOfThreeNumbers maxOfThreeNumbers= new MaxOfThreeNumbers();
        int actualResult= maxOfThreeNumbers.findMax(26,10,5);
        checkResult(actualResult, 26, "maxNumberIsFirstNumberTest3");
    }
    void test4(){
        MaxOfThreeNumbers maxOfThreeNumbers= new MaxOfThreeNumbers();
        int actualResult= maxOfThreeNumbers.findMax(3,12,5);
        checkResult(actualResult, 12, "maxNumberIsSecondNumberTest4");
    }
    void test5(){
        MaxOfThreeNumbers maxOfThreeNumbers= new MaxOfThreeNumbers();
        int actualResult= maxOfThreeNumbers.findMax(12,8,25);
        checkResult(actualResult, 25, "maxNumberIsThirdNumberTest5");
    }
    void checkResult(int actualResult, int expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }
}
