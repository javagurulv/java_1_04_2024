package lv.javaguru.java1.student_maksims_latkovskis.level_6_unit_testing.homework.level_4_junior;

class FactorialForLoopTest {

    public static void main(String[] args) {
        FactorialForLoopTest test = new FactorialForLoopTest();

        test.test1();
        test.test2();
        test.test3();
    }

    private void test1() {
        FactorialForLoop factorialForLoop = new FactorialForLoop();
        int output = factorialForLoop.factorial(5);
        testResult("120", Integer.toString(output), "test 1");
    }

    private void test2() {
        FactorialForLoop factorialForLoop = new FactorialForLoop();
        int output = factorialForLoop.factorial(0);
        testResult("1", Integer.toString(output), "test 2");
    }

    private void test3() {
        FactorialForLoop factorialForLoop = new FactorialForLoop();
        int output = factorialForLoop.factorial(6);
        testResult("720", Integer.toString(output), "test 3");
    }


    public void testResult(String expectedOutput, String gainedOutput, String testName) {
        if (expectedOutput.equals(gainedOutput)) {
            System.out.println("PASS " + testName);
        } else {
            System.out.println("FAIL " + testName);
            System.out.println("The gained output is: " + gainedOutput);
        }
    }

}
