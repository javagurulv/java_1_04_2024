package lv.javaguru.java1.student_deniss_boltunovs.lesson_5.lesson;

class MaxNumberTest {

    public static void main(String[] args) {
         MaxNumberTest test = new MaxNumberTest();

         test.test1();
         test.test2();
         test.test3();
         test.test4();
         test.test5();
         test.test6();

    }

    // 2,5 -> 5
    public void test1() {
        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMaxNumber(2,5);
        if (result == 5) {
            System.out.println("test 1: OK") ;
        } else {
            System.out.println("test 1: FAILED") ;
        }
    }

    // 5,2 -> 5
    public void test2() {
        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMaxNumber(5,2);
        if (result == 5) {
            System.out.println("test 2: OK") ;
        } else {
            System.out.println("test 2: FAILED") ;
        }
    }

    // 5,5 -> 5
    public void test3() {
        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMaxNumber(5,5);
        if (result == 5) {
            System.out.println("test 3: OK") ;
        } else {
            System.out.println("test 3: FAILED") ;
        }
    }


    // 3,5,7 -> 7
    public void test4() {
        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMaxNumber(3,5,7);
        if (result == 7) {
            System.out.println("test 4: OK") ;
        } else {
            System.out.println("test 4: FAILED") ;
        }
    }

    // 7,4,3 -> 7
    public void test5() {
        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMaxNumber(7,4,3);
        if (result == 7) {
            System.out.println("test 5: OK") ;
        } else {
            System.out.println("test 5: FAILED") ;
        }
    }

    // 4,7,6 -> 7
    public void test6() {
        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMaxNumber(4,7,6);
        if (result == 7) {
            System.out.println("test 6: OK") ;
        } else {
            System.out.println("test 6: FAILED") ;
        }
    }

}
