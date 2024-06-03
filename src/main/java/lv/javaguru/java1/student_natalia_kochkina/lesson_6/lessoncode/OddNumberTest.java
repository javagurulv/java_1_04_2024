package lv.javaguru.java1.student_natalia_kochkina.lesson_6.lessoncode;

class OddNumberTest {

    public static void main(String[] args) {
        OddNumberTest test = new OddNumberTest();
        test.test1();
        test.test2();
        test.test3();
    }

    //2 -> false
    public void test1() {
        int number = 2;
        OddNumber oddNumber = new OddNumber();
        boolean realResult = oddNumber.isOdd(number);
        if (realResult == false) {
            System.out.println("TEST 1 OK");
        } else {
            System.out.println("TEST 1 FAIL");
        }
    }

    //0 -> false
    public void test2() {
        int number = 0;
        OddNumber oddNumber = new OddNumber();
        boolean realResult = oddNumber.isOdd(number);
        if (realResult == false) {
            System.out.println("TEST 2 OK");
        } else {
            System.out.println("TEST 2 FAIL");
        }
    }

    //-1 -> true
    public void test3() {
        int number = -1;
        OddNumber oddNumber = new OddNumber();
        boolean realResult = oddNumber.isOdd(number);
        if (realResult == true) {
            System.out.println("TEST 3 OK");
        } else {
            System.out.println("TEST 3 FAIL");
        }
    }
}
