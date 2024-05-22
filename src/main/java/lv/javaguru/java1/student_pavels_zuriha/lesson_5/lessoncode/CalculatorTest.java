package lv.javaguru.java1.student_pavels_zuriha.lesson_5.lessoncode;

class CalculatorTest {
    public static void main (String[] args) {
        CalculatorTest test = new CalculatorTest();
        test.maxOfThreeTest();
        test.maxOfThreeTest1();
        test.maxOfThreeTest2();
        test.maxOfThreeTest3();
        test.maxOfThreeTest4();

    }

    // 10, 7, 5 -> 10
    // 7, 10, 5 -> 10
    // 7, 5, 10 -> 10
    // 10, 10, 7 -> 10
    // 10, 7, 10 -> 10
    // 7, 10, 10 -> 10
    // 10, 10, 10 -> 10

    public void maxOfThreeTest() {
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumberV2(10, 7, 5);
        if (realResult == 10) {
            System.out.println("Test 1 OK");
        } else {
            System.out.println("Test 1 FAIL");
        }
    }

    public void maxOfThreeTest1() {
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumberV2(7, 10, 5);
        if (realResult == 10) {
            System.out.println("Test 1 OK");
        } else {
            System.out.println("Test 1 FAIL");
        }
    }

    public void maxOfThreeTest2() {
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumberV2(7, 5, 10);
        if (realResult == 10) {
            System.out.println("Test 1 OK");
        } else {
            System.out.println("Test 1 FAIL");
        }
    }

    public void maxOfThreeTest3() {
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumberV2(10, 10, 10);
        if (realResult == 10) {
            System.out.println("Test 1 OK");
        } else {
            System.out.println("Test 1 FAIL");
        }
    }

    public void maxOfThreeTest4() {
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumberV2(10, 7, 10);
        if (realResult == 10) {
            System.out.println("Test 1 OK");
        } else {
            System.out.println("Test 1 FAIL");
        }
    }

}
