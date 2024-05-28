package lv.javaguru.java1.student_natalia_kochkina.lesson_6.lessoncode;

class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.fizzTest();
        test.buzzTest();
        test.fizzBuzzTest();
        test.unknownNumberTest();
    }

    // test case 1:  3 -> "Fizz"
    public void fizzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(3);
        checkResult(realResult, "Fizz",
                "Fizz");
    }

    // test case 2:  5 -> "Buzz"
    public void buzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(5);
        checkResult(realResult, "Buzz",
                "Buzz");
    }

    // test case 3:  15 -> "FizzBuzz"
    public void fizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(15);
        checkResult(realResult, "FizzBuzz",
                "FizzBuzz");
    }

    // test case 4:  17 -> "17"
    public void unknownNumberTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(17);
        checkResult(realResult, "17",
                "UnknownNumber");
    }


    private void checkResult(String realResult,
                             String expectedResult,
                             String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println("TEST " + testName + " = OK");
        } else {
            System.out.println("TEST " + testName + " = FAIL");
            System.out.println("Real result = " + realResult);
            System.out.println("Expected result = " + expectedResult);
        }
    }
}
