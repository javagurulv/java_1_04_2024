package lv.javaguru.java1.student_nadezda_radigina.lesson_4.lesson_07_05;

class StudentMarkTest {
    public static void main(String[] args){
        StudentMarkTest test = new StudentMarkTest();
        test.test1();
        test.test2();
        test.test3();
    }

    public void test1(){
        int mark = 100;
        String expectedGrade = "A";

        StudentMark studentMark = new StudentMark();
        String realGrade = studentMark.calculateGrade(mark);

        if (expectedGrade.equals(realGrade)){
            System.out.println("TEST 1 = OK");
        } else {
            System.out.println("TEST 1 = FAIL");

        }

    }
    public void test2(){
        int mark = 85;
        String expectedGrade = "B";

        StudentMark studentMark = new StudentMark();
        String realGrade = studentMark.calculateGrade(mark);

        if (expectedGrade.equals(realGrade)){
            System.out.println("TEST 2 = OK");
        } else {
            System.out.println("TEST 2 = FAIL");

        }

    }

    public void test3(){
        int mark = 73;
        String expectedGrade = "C";

        StudentMark studentMark = new StudentMark();
        String realGrade = studentMark.calculateGrade(mark);

        if (expectedGrade.equals(realGrade)){
            System.out.println("TEST 3 = OK");
        } else {
            System.out.println("TEST 3 = FAIL");
        }
    }


}
