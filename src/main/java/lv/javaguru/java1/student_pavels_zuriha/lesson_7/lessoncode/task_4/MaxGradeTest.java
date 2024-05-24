package lv.javaguru.java1.student_pavels_zuriha.lesson_7.lessoncode.task_4;

class MaxGradeTest {

    public static void main(String[] args) {

        MaxGradeTest test = new MaxGradeTest();
        test.maxGradeTest();
    }

    public void maxGradeTest() {

        MaxGrade maxGrade = new MaxGrade();

        int[] array = {10, 5, 3, 9, 2, 4};

        int highestGrade = maxGrade.findMaxGrade(array);
        if (highestGrade == 10) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAIL");
        }

    }
}
