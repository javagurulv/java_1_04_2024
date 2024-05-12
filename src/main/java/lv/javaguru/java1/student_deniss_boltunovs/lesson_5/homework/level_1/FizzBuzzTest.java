package lv.javaguru.java1.student_deniss_boltunovs.lesson_5.homework.level_1;

class FizzBuzzTest {

    public static void main(String[] args) {

        FizzBuzzTest myFizzBuzz = new FizzBuzzTest();

        myFizzBuzz.testFizzBuzz();
        myFizzBuzz.testFizz();
        myFizzBuzz.testBuzz();
        myFizzBuzz.testNumber();

    }


    public void testFizzBuzz() {
        int realNumber = 30;
        String realResult = "FizzBuzz";

        FizzBuzz expectedFizzBuzz = new FizzBuzz();

        if (expectedFizzBuzz.calculateFizzBuzz(realNumber).equals(realResult)) {
            System.out.println("Test FizzBuzz - OK");
        } else {
            System.out.println("Test FizzBuzz - Failed");
        }
    }

    public void testFizz() {
        int realNumber = 21;
        String realResult = "Fizz";

        FizzBuzz expectedFizzBuzz = new FizzBuzz();

        if (expectedFizzBuzz.calculateFizzBuzz(realNumber).equals(realResult)) {
            System.out.println("Test Fizz - OK");
        } else {
            System.out.println("Test Fizz - Failed");
        }
    }


    public void testBuzz() {
        int realNumber = 20;
        String realResult = "Buzz";

        FizzBuzz expectedFizzBuzz = new FizzBuzz();

        if (expectedFizzBuzz.calculateFizzBuzz(realNumber).equals(realResult)) {
            System.out.println("Test Buzz - OK");
        } else {
            System.out.println("Test Buzz - Failed");
        }
    }

    public void testNumber() {
        int realNumber = 22;
        String realResult = "22";

        FizzBuzz expectedFizzBuzz = new FizzBuzz();

        if (expectedFizzBuzz.calculateFizzBuzz(realNumber).equals(realResult)) {
            System.out.println("Test Number - OK");
        } else {
            System.out.println("Test Number - Failed");
        }
    }

}
