package lv.javaguru.java1.student_pavels_zuriha.lesson_6.lessoncode;

class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.shouldReturnFizz();
        test.shouldReturnBuzz();
        test.shouldReturnFizzBuzz();
        test.shouldReturn17();
    }

    public void shouldReturnFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(3);
        checkResult(realResult, "Fizz", "shouldReturnFizz");
    }

    public void shouldReturnBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(5);
        checkResult(realResult, "Buzz", "shouldReturnBuzz");
    }

    public void shouldReturnFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(15);
        checkResult(realResult, "FizzBuzz", "shouldReturnFizzBuzz");
    }

    public void shouldReturn17() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(17);
        checkResult(realResult, "" + 17, "shouldReturn17");
    }

    private void checkResult(String realResult,
                             String expectedResult,
                             String scenarioTitle) {
        if (realResult.equals(expectedResult)) {
            System.out.println(scenarioTitle + ": TEST OK");
        } else {
            System.out.println(scenarioTitle + ": TEST FAILED");
            System.out.println("Real result: " + realResult + " While Expected Result: " + expectedResult);
        }
    }
}
