package lv.javaguru.java1.student_maksims_latkovskis.level_6_unit_testing.lessoncode;

class FizzBuzzTest {

    public static void main(String[] args){

        FizzBuzzTest test = new FizzBuzzTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
    }

    void test1(){
        int number = 45;
        Num2Str num2Str = new Num2Str();
        String output = num2Str.divNumber(number);
        testPrint(output,"FizzBuzz","Test 1");
    }

    void test2(){
        int number = 9;
        Num2Str num2Str = new Num2Str();
        String output = num2Str.divNumber(number);
        testPrint(output,"Fizz","Test 2");
    }

    void test3(){
        int number = 50;
        Num2Str num2Str = new Num2Str();
        String output = num2Str.divNumber(number);
        testPrint(output,"Buzz","Test 3");
    }
    void test4(){
        int number = 44;
        Num2Str num2Str = new Num2Str();
        String output = num2Str.divNumber(number);
        testPrint(output,"44","Test 4");
    }

    void testPrint(String realResult, String expectedResult, String testName){
        if(realResult.equals(expectedResult)){
            System.out.println(testName + " is OK");
        }
        else{
            System.out.println(testName + " is FAILED");
            System.out.println("real result is: " + realResult);
        }

    }


}
