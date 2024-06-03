package lv.javaguru.java1.student_maksims_latkovskis.level_6_unit_testing.homework.level_2_intern;

class MaxOfThreeNumbersTest {

    public static void main(String[] args){
        MaxOfThreeNumbersTest test = new MaxOfThreeNumbersTest();
        test.test1();
        test.test2();
        test.test3();
    }

    public void test1(){
        // Test case 2, 3, 7 results in 7
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        if (maxOfThreeNumbers.findMax(2, 3, 7) == 7) {
            System.out.println("PASS test 1");
        } else {
            System.out.println("FAIL test 1");
        }
    }

    public void test2(){
        // Test case -2, -3, -7 results in -2
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        if (maxOfThreeNumbers.findMax(-2, -3, -7) == -2) {
            System.out.println("PASS test 2");
        } else {
            System.out.println("FAIL test 2");
        }
    }

    public void test3(){
        // Test case 0, 4, 0 results in 4
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        if (maxOfThreeNumbers.findMax(0, 4, 0) == 4) {
            System.out.println("PASS test 3");
        } else {
            System.out.println("FAIL test 3");
        }
    }
}
