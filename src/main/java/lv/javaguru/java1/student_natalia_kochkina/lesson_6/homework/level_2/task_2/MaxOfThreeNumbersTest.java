package lv.javaguru.java1.student_natalia_kochkina.lesson_6.homework.level_2.task_2;

class MaxOfThreeNumbersTest {

    public static void main(String[] args) {

        MaxOfThreeNumbersTest test = new MaxOfThreeNumbersTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
    }

    public void test1() {
        int num1 = 5;
        int num2 = 7;
        int num3 = 0;
        int expectedMax = 7;
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int realMax = maxOfThreeNumbers.findMax(num1, num2, num3);
        if (expectedMax == realMax) {
            System.out.println("TEST1 = OK");
        } else {
            System.out.println("TEST1 = FAIL");
        }
    }

    public void test2() {
        int num1 = 0;
        int num2 = 777;
        int num3 = 0;
        int expectedMax = 777;
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int realMax = maxOfThreeNumbers.findMax(num1, num2, num3);
        if (expectedMax == realMax) {
            System.out.println("TEST2 = OK");
        } else {
            System.out.println("TEST2 = FAIL");
        }
    }

    public void test3() {
        int num1 = 44;
        int num2 = 3;
        int num3 = 2;
        int expectedMax = 44;
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int realMax = maxOfThreeNumbers.findMax(num1, num2, num3);
        if (expectedMax == realMax) {
            System.out.println("TEST3 = OK");
        } else {
            System.out.println("TEST3 = FAIL");
        }
    }

    public void test4() {
        int num1 = 5;
        int num2 = 5;
        int num3 = 5;
        int expectedMax = 5;
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int realMax = maxOfThreeNumbers.findMax(num1, num2, num3);
        if (expectedMax == realMax) {
            System.out.println("TEST4 = OK");
        } else {
            System.out.println("TEST4 = FAIL");
        }
    }
}
