package lv.javaguru.java1.student_maksims_latkovskis.level_6_unit_testing.lessoncode;

class MaxNumberTest {

    public static void main(String[] args){
        MaxNumberTest test = new MaxNumberTest();

        test.test1();
        test.test2();
        test.test3();
    }

    void test1(){
        int number1 = 5;
        int number2 = 8;
        Calculator calculator = new Calculator();
        testPrint(8,calculator.maxOfTwo(number1, number2), "Test 1" );
    }

    void test2(){
        int number1 = 5;
        int number2 = -8;
        Calculator calculator = new Calculator();
        testPrint(5,calculator.maxOfTwo(number1, number2), "Test 2" );
    }
    void test3(){
        int number1 = 0;
        int number2 = 0;
        Calculator calculator = new Calculator();
        testPrint(0,calculator.maxOfTwo(number1, number2), "Test 3" );
    }

    void testPrint(int realResult, int expectedResult, String testName){
        if(realResult == expectedResult){
            System.out.println(testName + " is OK");
        }
        else{
            System.out.println(testName + " is FAILED");
        }
    }



}
