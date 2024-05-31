package lv.javaguru.java1.student_deniss_boltunovs.lesson_6.lesson;

class OddNumberTest {

    public static void main(String[] args) {
        OddNumberTest test = new OddNumberTest();

        test.test1();
        test.test2();
        test.test3();
    }

    public void test1(){
        OddNumber number = new OddNumber();
        boolean realResult = number.isOdd(1);
        boolean expectedResult = true;
        checkResult(realResult, expectedResult, "test1");
    }

    public void test2(){
        OddNumber number = new OddNumber();
        boolean realResult = number.isOdd(2);
        boolean expectedResult = false;
        checkResult(realResult, expectedResult, "test2");
    }

    public void test3(){
        OddNumber number = new OddNumber();
        boolean realResult = number.isOdd(0);
        boolean expectedResult = false;
        checkResult(realResult, expectedResult, "test3");
    }

    private void checkResult(boolean realResult,
                             boolean expectedResult,
                             String testName){
        if (realResult == expectedResult) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAILED");
        }
    }


}
