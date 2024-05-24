package lv.javaguru.java1.student_natalia_kochkina.lesson_5.homework.level_2;

class LeapYearTest {

    public static void main(String[] args) {
        LeapYearTest test = new LeapYearTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
    }

    //1900 -> false
    public void test1() {
        LeapYear leapYear = new LeapYear();
        boolean realResult = leapYear.isLeap(1900);
        checkResult(realResult, false,
                "test1 ");
    }

    //2000 -> true
    public void test2() {
        LeapYear leapYear = new LeapYear();
        boolean realResult = leapYear.isLeap(2000);
        checkResult(realResult, true,
                "test2 ");
    }

    //2024 -> true
    public void test3() {
        LeapYear leapYear = new LeapYear();
        boolean realResult = leapYear.isLeap(2024);
        checkResult(realResult, true,
                "test3 ");
    }

    //1977 -> false
    public void test4() {
        LeapYear leapYear = new LeapYear();
        boolean realResult = leapYear.isLeap(1977);
        checkResult(realResult, false,
                "test4 ");
    }


    private void checkResult(boolean realResult,
                             boolean expectedResult,
                             String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + "TEST OK");
        } else {
            System.out.println(testScenarioName + "TEST FAIL");
        }
    }

}
