package lv.javaguru.java1.student_nadezda_radigina.lesson_6.level_4_junior;

public class FactorialForLoopTest {
    public static void main(String[] args){
        FactorialForLoopTest test = new FactorialForLoopTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
        test.test5();


    }
    public void test1(){
        FactorialForLoop factorialForLoop = new FactorialForLoop();
        int realResult = factorialForLoop.factorial(3);
        int expectedResult = 6;
        if (expectedResult ==  realResult) {
            System.out.println("TEST 1 = OK");
        }else {
            System.out.println("TEST 1 = FAIL");
        }
    }
    public void test2(){
        FactorialForLoop factorialForLoop = new FactorialForLoop();
        int realResult = factorialForLoop.factorial(4);
        int expectedResult = 24;
        if (expectedResult ==  realResult) {
            System.out.println("TEST 2 = OK");
        }else {
            System.out.println("TEST 2 = FAIL");
        }
    }
    public void test3(){
        FactorialForLoop factorialForLoop = new FactorialForLoop();
        int realResult = factorialForLoop.factorial(5);
        int expectedResult = 120;
        if (expectedResult ==  realResult) {
            System.out.println("TEST 3 = OK");
        }else {
            System.out.println("TEST 3 = FAIL");
        }
    }
    public void test4(){
        FactorialForLoop factorialForLoop = new FactorialForLoop();
        int realResult = factorialForLoop.factorial(5);
        int expectedResult = 70;
        if (expectedResult ==  realResult) {
            System.out.println("TEST 4 = OK");
        }else {
            System.out.println("TEST 4 = FAIL");
        }
    }
    public void test5(){
        FactorialForLoop factorialForLoop = new FactorialForLoop();
        int realResult = factorialForLoop.factorial(0);
        int expectedResult = 1;
        if (expectedResult ==  realResult) {
            System.out.println("TEST 5 = OK");
        }else {
            System.out.println("TEST 5 = FAIL");
        }
    }





}
