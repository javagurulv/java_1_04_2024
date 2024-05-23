package lv.javaguru.java1.student_natalia_kochkina.lesson_5.homework.level_1.task_1;

class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
    }

    //6 -> Fizz
    public void test1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.defineResult(6);
        checkResult(realResult, "Fizz",
                "test1 ");
    }

    //10 -> Buzz
    public void test2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.defineResult(10);
        checkResult(realResult, "Buzz",
                "test2 ");
    }

    //30 -> FizzBuzz
    public void test3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.defineResult(30);
        checkResult(realResult, "FizzBuzz",
                "test3 ");
    }

    //7 -> 7
    public void test4() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.defineResult(7);
        checkResult(realResult, "7",
                "test4 ");
    }

    private void checkResult(String realResult,
                                String expectedResult,
                                String testScenarioName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testScenarioName + "TEST OK");
        } else {
            System.out.println(testScenarioName + "TEST FAIL");
        }
    }

}
