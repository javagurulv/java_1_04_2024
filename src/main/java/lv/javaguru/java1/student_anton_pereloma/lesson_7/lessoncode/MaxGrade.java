package lv.javaguru.java1.student_anton_pereloma.lesson_7.lessoncode;

class MaxGrade {
    public int findMaxGrade(int[] grades) {
        int maxGrade = grades[0];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > maxGrade) {
                maxGrade = grades[i];
            }
        }
        return maxGrade;
    }
}
