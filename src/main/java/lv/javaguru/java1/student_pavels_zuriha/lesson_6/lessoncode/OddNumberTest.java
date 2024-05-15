package lv.javaguru.java1.student_pavels_zuriha.lesson_6.lessoncode;

class OddNumberTest {
    public static void main(String[] args) {
        OddNumberTest test = new OddNumberTest();
        test.test1();
        test.test2();
        test.test3();

    }

    public void test1() {
        OddNumber oddNumber = new OddNumber();
        boolean isOdd = oddNumber.isOdd(3);
        if (isOdd) {
            System.out.println("TEST1 IS OK");
        } else {
            System.out.println("TEST1 IS FAIL");
        }


    }

    public void test2() {
        OddNumber oddNumber = new OddNumber();
        boolean notOdd = !oddNumber.isOdd(4);
        if (notOdd) {
            System.out.println("TEST1 IS OK");
        } else {
            System.out.println("TEST1 IS FAIL");
        }


    }

    public void test3() {
        OddNumber oddNumber = new OddNumber();
        boolean isOdd = oddNumber.isOdd(7);
        if (isOdd) {
            System.out.println("TEST1 IS OK");
        } else {
            System.out.println("TEST1 IS FAIL");
        }

    }
}
