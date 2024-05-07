package lv.javaguru.java1.teacher.lesson_4_if_statement.lessoncode;

class StudentGradeTest {

    public static void main(String[] args) {
        StudentGradeTest test = new StudentGradeTest();
        test.test1();
        test.test2();
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

}
