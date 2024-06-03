package lv.javaguru.java1.student_deniss_boltunovs.lesson_6.lesson;

class LeapYearTest {

    public static void main(String[] args) {
        LeapYearTest test = new LeapYearTest();

        test.test1();
        test.test2();
        test.test3();
        test.test4();
    }

    // test case 1:  2000 -> true
    public void test1(){
        LeapYear leapYear = new LeapYear();
        boolean realResult = leapYear.isLeapYear(2000);
        boolean expectedResult = true;
        checkResult(realResult, expectedResult, "test1");
    }

    // test case 2:  2016 -> true
    public void test2(){
        LeapYear leapYear = new LeapYear();
        boolean realResult = leapYear.isLeapYear(2016);
        boolean expectedResult = true;
        checkResult(realResult, expectedResult, "test2");
    }

    // test case 3:  2018 -> false
    public void test3(){
        LeapYear leapYear = new LeapYear();
        boolean realResult = leapYear.isLeapYear(2018);
        boolean expectedResult = false;
        checkResult(realResult, expectedResult, "test3");
    }

    // test case 4:  1900 -> false
    public void test4(){
        LeapYear leapYear = new LeapYear();
        boolean realResult = leapYear.isLeapYear(1900);
        boolean expectedResult = false;
        checkResult(realResult, expectedResult, "test4");
    }


    private void checkResult(boolean realResult,
                             boolean expectedResult,
                             String testName){
        if (realResult == expectedResult) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAILED");
        }
    }

}
