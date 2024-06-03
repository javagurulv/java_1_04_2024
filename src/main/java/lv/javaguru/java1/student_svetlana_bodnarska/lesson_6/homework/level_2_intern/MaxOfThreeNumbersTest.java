package lv.javaguru.java1.student_svetlana_bodnarska.lesson_6.homework.level_2_intern;

class MaxOfThreeNumbersTest
{
    // 1. 5, 6, 7 -> 7
    // 2. -1, -2, -3 -> -1
    // 3. 0, 0, 0 -> 0
    // 4. -1, 2, 3 -> 3

    public static void main(String[] args) {
        MaxOfThreeNumbersTest test = new MaxOfThreeNumbersTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
    }

    public void test1(){
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int realResult = maxOfThreeNumbers.findMax(5, 6, 7);
        if (realResult == 7){
            System.out.println("TEST1 = OK");
        } else {
            System.out.println("TEST1 = FAIL");
        }
    }
    public void test2(){
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int realResult = maxOfThreeNumbers.findMax(-1, -2, -3);
        if (realResult == -1){
            System.out.println("TEST2 = OK");
        } else {
            System.out.println("TEST2 = FAIL");
        }
    }
    public void test3(){
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int realResult = maxOfThreeNumbers.findMax(-1, 2, 3);
        if (realResult == 3){
            System.out.println("TEST3 = OK");
        } else {
            System.out.println("TEST3 = FAIL");
        }
    }
    public void test4(){
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int realResult = maxOfThreeNumbers.findMax(5, 6, 7);
        if (realResult == 7){
            System.out.println("TEST4 = OK");
        } else {
            System.out.println("TEST4 = FAIL");
        }
    }
}
