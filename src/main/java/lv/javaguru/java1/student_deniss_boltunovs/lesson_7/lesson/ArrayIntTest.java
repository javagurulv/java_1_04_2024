package lv.javaguru.java1.student_deniss_boltunovs.lesson_7.lesson;

class ArrayIntTest {

    public static void main(String[] args) {
         ArrayIntTest test = new ArrayIntTest();
         test.arrayLengthTen();
    }

    void arrayLengthTen() {
        ArrayInt arr = new ArrayInt();
        int result = arr.generateArray(10).length;
        checkResult(result, 10, "arrayLengthTen");
    }

    private void checkResult(int realResult, int expectedResult, String testName){
        if (realResult == expectedResult) {
            System.out.println(testName + ": OK");
        } else {
            System.out.println(testName + ": FAILED " + "(expected " + expectedResult + ", received " +realResult + ")");
        }
    }

}
