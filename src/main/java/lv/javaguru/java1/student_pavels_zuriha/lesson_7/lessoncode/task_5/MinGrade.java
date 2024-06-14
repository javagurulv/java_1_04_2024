package lv.javaguru.java1.student_pavels_zuriha.lesson_7.lessoncode.task_5;

class MinGrade {

    public int findMinGrade(int[] studentGrades) {

        if (studentGrades.length == 0) {
            return 0;
        }
        int min = studentGrades[0];
        for (int i = 0; i < studentGrades.length; i++) {
            if (studentGrades[i] < min) {
                min = studentGrades[i];
            }
        }


        return min;
    }

}
