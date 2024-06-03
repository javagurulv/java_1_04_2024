package lv.javaguru.java1.teacher.lesson_6_unit_testing.lessoncode;

public class EvenNumberTest {

    // 1. Подготовка тестовых данных.

    // 2 -> true (expected result) - test case 1
    // 0 -> true - test case 2
    // -1 -> false - test case 3

    // 2. Вызов продакшн кода (2) -> ? (real result)

    // 3. Проверка результата expected result == real result

    public static void main(String[] args) {
        EvenNumberTest test = new EvenNumberTest();
        test.test1();
        test.test2();
        test.test3();
    }

    public void test1() {
        int number = 2;
        EvenNumber evenNumber = new EvenNumber();
        boolean realResult = evenNumber.isEven(number);
        if (realResult == true) {
            System.out.println("TEST 1 = OK");
        } else {
            System.out.println("TEST 1 = FAIL");
        }
    }

    public void test2() {
        int number = 0;
        EvenNumber evenNumber = new EvenNumber();
        boolean realResult = evenNumber.isEven(number);
        if (realResult == true) {
            System.out.println("TEST 2 = OK");
        } else {
            System.out.println("TEST 2 = FAIL");
        }
    }

    public void test3() {
        int number = -1;
        EvenNumber evenNumber = new EvenNumber();
        boolean realResult = evenNumber.isEven(number);
        if (realResult == false) {
            System.out.println("TEST 3 = OK");
        } else {
            System.out.println("TEST 3 = FAIL");
        }
    }

}
