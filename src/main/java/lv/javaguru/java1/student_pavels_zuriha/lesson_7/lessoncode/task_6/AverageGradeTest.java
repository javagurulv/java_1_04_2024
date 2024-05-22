package lv.javaguru.java1.student_pavels_zuriha.lesson_7.lessoncode.task_6;

class AverageGradeTest {

    public static void main(String[] args) {
        AverageGradeTest test = new AverageGradeTest();
        test.testAverage1();


    }

    public void testAverage1() {
        AverageGrade averageGrade = new AverageGrade();

        int[] studentsGrades = {10, 9, 8, 2, 4, 6, 2, 4, 9};
        double averageGradeOfStudents = averageGrade.findAverageGrade(studentsGrades);
        if (averageGradeOfStudents == 6) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAIL");
        }

    }
}
