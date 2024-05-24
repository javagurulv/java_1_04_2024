package lv.javaguru.java1.student_pavels_zuriha.lesson_6.homework.level_4.task_1;

class FactorialForLoopTest {
    public static void main(String[] args) {
        FactorialForLoopTest test = new FactorialForLoopTest();
        test.factorialTest();


    }

    public void factorialTest() {
        FactorialForLoop factorialForLoop = new FactorialForLoop();
        int realResult = factorialForLoop.factorial(7);
        checkResult(realResult, 5040);

    }

    private void checkResult(int realResult, int expectedResult) {
        if (realResult == expectedResult) {
            System.out.println("Test is OK");
        } else {
            System.out.println("Test failed");
        }

    }

}
