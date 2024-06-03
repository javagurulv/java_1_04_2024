package lv.javaguru.java1.student_maksims_latkovskis.level_6_unit_testing.homework.level_4_junior;

class FactorialRecursionTest {

    public static void main(String[] args){
        FactorialRecursionTest test = new FactorialRecursionTest();

        test.test1();
        test.test2();
        test.test3();
    }

    public void test1(){
        // input 5, expected output is 120
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int output = factorialRecursion.factorial(5);
        testResult("120", Integer.toString(output), "test 1");
    }

    public void test2(){
        // input 120, expected output is 5
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int output = factorialRecursion.factorial(1);
        testResult("1", Integer.toString(output), "test 2");
    }

    public void test3(){
        // input 0, expected output is 1
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int output = factorialRecursion.factorial(0);
        testResult("1", Integer.toString(output), "test 3");
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
