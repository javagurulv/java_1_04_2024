package lv.javaguru.java1.student_natalia_kochkina.lesson_6.lessoncode;

class EvenNumberTest {

    public static void main(String[] args) {
        EvenNumberTest test = new EvenNumberTest();
        test.test1();
        test.test2();
        test.test3();
    }

    //2 -> true
    public void test1() {
        int number = 2;
        EvenNumber evenNumber = new EvenNumber();
        boolean realResult = evenNumber.isEven(number);
        if (realResult == true) {
            System.out.println("TEST 1 OK");
        } else {
            System.out.println("TEST 1 FAIL");
        }
    }

    //0 -> true
    public void test2() {
        int number = 0;
        EvenNumber evenNumber = new EvenNumber();
        boolean realResult = evenNumber.isEven(number);
        if (realResult == true) {
            System.out.println("TEST 2 OK");
        } else {
            System.out.println("TEST 2 FAIL");
        }
    }

    //-1 -> false
    public void test3() {
        int number = -1;
        EvenNumber evenNumber = new EvenNumber();
        boolean realResult = evenNumber.isEven(number);
        if (realResult == false) {
            System.out.println("TEST 3 OK");
        } else {
            System.out.println("TEST 3 FAIL");
        }
    }

}
