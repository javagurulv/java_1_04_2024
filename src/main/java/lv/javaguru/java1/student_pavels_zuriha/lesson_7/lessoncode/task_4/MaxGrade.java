package lv.javaguru.java1.student_pavels_zuriha.lesson_7.lessoncode.task_4;

class MaxGrade {

    public int findMaxGrade(int[] studentGrades) {

        int max = studentGrades[0];
        for (int i = 0; i < studentGrades.length; i++) {
            if (studentGrades[i] > max) {
                max = studentGrades[i];
            }
        }
        return max;
    }

}
