package lv.javaguru.java1.student_pavels_zuriha.lesson_7.lessoncode.task_5;


class MinGradeTest {

    public static void main(String[] args) {

        MinGradeTest test = new MinGradeTest();
        test.minGradeTest();
        test.minGradeZeroTest();

    }

    public void minGradeTest() {

        MinGrade minGrade = new MinGrade();

        int[] array = {10, 5, 3, 9, 2, 4};

        int lowestGrade = minGrade.findMinGrade(array);
        if (lowestGrade == 2) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAIL");
        }
    }


    public void minGradeZeroTest() {

            MinGrade minGrade = new MinGrade();

            int[] array = {};
            int lowestGrade = minGrade.findMinGrade(array);
            if (lowestGrade == 0) {
                System.out.println("Test OK");
            } else {
                System.out.println("Test FAIL");
            }

    }
}
