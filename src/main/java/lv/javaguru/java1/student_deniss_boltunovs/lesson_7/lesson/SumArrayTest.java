package lv.javaguru.java1.student_deniss_boltunovs.lesson_7.lesson;

class SumArrayTest {

    public static void main(String[] args) {
        SumArrayTest test = new SumArrayTest();
        test.test1();
    }

//    //// from 1 to 5, result 15
    public void test1() {
        SumArray array = new SumArray();
        int realResult = array.getSum(1,100);
        checkResult(realResult, 5050, "test1");
    }

    private void checkResult(int realResult,
                             int expectedResult,
                             String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + ": OK");
        } else {
            System.out.println(testName + ": FAILED " + "received " +realResult + " expected " + expectedResult) ;
        }
    }

}
