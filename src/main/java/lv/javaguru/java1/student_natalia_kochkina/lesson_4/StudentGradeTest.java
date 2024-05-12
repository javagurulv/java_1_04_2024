package lv.javaguru.java1.student_natalia_kochkina.lesson_4;


class StudentGradeTest {

    public static void main(String[] args) {
        StudentGradeTest test = new StudentGradeTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
        test.test5();
        test.test6();
    }

    public void test1() {
        int mark = 100;
        String expectedGrade = "A";

        StudentGrade studentGrade = new StudentGrade();
        String realGrade = studentGrade.calculateGrade(mark);

        if (expectedGrade.equals(realGrade)) {
            System.out.println("TEST 1 = OK");
        } else {
            System.out.println("TEST 1 = FAIL");
        }
    }

    public void test2() {
        int mark = 85;
        String expectedGrade = "B";

        StudentGrade studentGrade = new StudentGrade();
        String realGrade = studentGrade.calculateGrade(mark);

        if (expectedGrade.equals(realGrade)) {
            System.out.println("TEST 2 = OK");
        } else {
            System.out.println("TEST 2 = FAIL");
        }
    }

    public void test3() {
        int mark = 75;
        String expectedGrade = "C";

        StudentGrade studentGrade = new StudentGrade();
        String realGrade = studentGrade.calculateGrade(mark);

        if (expectedGrade.equals(realGrade)) {
            System.out.println("TEST 3 = OK");
        } else {
            System.out.println("TEST 3 = FAIL");
        }
    }

    public void test4() {
        int mark = 65;
        String expectedGrade = "D";

        StudentGrade studentGrade = new StudentGrade();
        String realGrade = studentGrade.calculateGrade(mark);

        if (expectedGrade.equals(realGrade)) {
            System.out.println("TEST 4 = OK");
        } else {
            System.out.println("TEST 4 = FAIL");
        }
    }

    public void test5() {
        int mark = 55;
        String expectedGrade = "F";

        StudentGrade studentGrade = new StudentGrade();
        String realGrade = studentGrade.calculateGrade(mark);

        if (expectedGrade.equals(realGrade)) {
            System.out.println("TEST 5 = OK");
        } else {
            System.out.println("TEST 5 = FAIL");
        }
    }

    public void test6() {
        int mark = 655;
        String expectedGrade = "unknown grade";

        StudentGrade studentGrade = new StudentGrade();
        String realGrade = studentGrade.calculateGrade(mark);

        if (expectedGrade.equals(realGrade)) {
            System.out.println("TEST 6 = OK");
        } else {
            System.out.println("TEST 6 = FAIL");
        }
    }

}
