package lv.javaguru.java1.student_deniss_boltunovs.lesson_7.lesson;

class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();

        test.test1();
        test.test2();
        test.test3();
        test.test4();
    }

    // test case 1:  3 -> "Fizz"
    public void test1(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(3);
        String expectedResult = "Fizz";
        checkResult(realResult, expectedResult, "test1");
    }

    // test case 2:  5 -> "Buzz"
    public void test2(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(5);
        String expectedResult = "Buzz";
        checkResult(realResult, expectedResult, "test2");
    }

    // test case 3:  15 -> "FizzBuzz"
    public void test3(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(15);
        String expectedResult = "FizzBuzz";
        checkResult(realResult, expectedResult, "test3");
    }

    // test case 4:  17 -> "17"
    public void test4(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(17);
        String expectedResult = "17";
        checkResult(realResult, expectedResult, "test4");
    }

    private void checkResult(String realResult,
                             String expectedResult,
                             String testName){
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAILED");
        }
    }

}
