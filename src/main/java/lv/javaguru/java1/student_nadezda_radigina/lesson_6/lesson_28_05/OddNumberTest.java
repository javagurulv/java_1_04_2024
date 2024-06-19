package lv.javaguru.java1.student_nadezda_radigina.lesson_6.lesson_28_05;

class OddNumberTest {

    public static void main(String[]args) {
        OddNumberTest test = new OddNumberTest();
        test.test1();
        test.test2();
    }

    public void test1(){
        int number = 2;
        OddNumber oddNumber = new OddNumber();
        boolean realResult = oddNumber.isOdd(number);
        if (realResult == false) {
            System.out.println("TEST 1 = OK");
        } else {
            System.out.println("TEST 1 = FAIL");
        }
    }
        public void test2(){
            int number = 0;
            OddNumber oddNumber = new OddNumber();
            boolean realResult = oddNumber.isOdd(number);
            if (realResult == false) {
                System.out.println("TEST 2 = OK");
            } else {
                System.out.println("TEST 2 = FAIL");
            }

}

}
