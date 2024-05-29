package lv.javaguru.java1.student_deniss_boltunovs.lesson_6.lesson;

class MaxNumberTest {

    public static void main(String[] args) {
        MaxNumberTest test = new MaxNumberTest();

        test.test1();
        test.test2();
        test.test3();
    }

    public void test1(){
        MaxNumber number = new MaxNumber();
        int realResult = number.findMax(10,5);
        int expectedResult = 10;
        checkResult(realResult, expectedResult, "test1");
    }

    public void test2(){
        MaxNumber number = new MaxNumber();
        int realResult = number.findMax(1,5);
        int expectedResult = 5;
        checkResult(realResult, expectedResult, "test2");
    }

    public void test3(){
        MaxNumber number = new MaxNumber();
        int realResult = number.findMax(-4,-9);
        int expectedResult = -4;
        checkResult(realResult, expectedResult, "test3");
    }

    private void checkResult(int realResult,
                            int expectedResult,
                            String testName){
        if (realResult == expectedResult) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAILED");
        }
    }

}
