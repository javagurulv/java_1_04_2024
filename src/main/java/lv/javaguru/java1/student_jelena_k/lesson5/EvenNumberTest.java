package lv.javaguru.java1.student_jelena_k.lesson5;

public class EvenNumberTest {


    public static void main(String[] args) {
        EvenNumberTest test = new EvenNumberTest();
        test.test1();
        test.test2();
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
}