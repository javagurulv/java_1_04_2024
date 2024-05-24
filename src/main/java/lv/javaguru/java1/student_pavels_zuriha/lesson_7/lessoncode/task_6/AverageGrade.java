package lv.javaguru.java1.student_pavels_zuriha.lesson_7.lessoncode.task_6;

class AverageGrade {

    public int findAverageGrade(int[] studentGrades) {

        int sum = 0;
        for (int i = 0; i < studentGrades.length; i++) {
            sum = sum + studentGrades[i];
        }
        return sum / studentGrades.length;
    }
}
