package lv.javaguru.java1.student_deniss_boltunovs.lesson_6.lesson;

class EvenNumberTest {

    public static void main(String[] args) {
        EvenNumberTest test = new EvenNumberTest();

        test.test1();
        test.test2();
        test.test3();
    }

    public void test1(){
        EvenNumber number = new EvenNumber();
        boolean realResult = number.isEven(1);
        boolean expectedResult = false;
        checkResult(realResult, expectedResult, "test1");
    }

    public void test2(){
        EvenNumber number = new EvenNumber();
        boolean realResult = number.isEven(2);
        boolean expectedResult = true;
        checkResult(realResult, expectedResult, "test2");
    }

    public void test3(){
        EvenNumber number = new EvenNumber();
        boolean realResult = number.isEven(0);
        boolean expectedResult = true;
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
