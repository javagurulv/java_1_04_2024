package lv.javaguru.java1.teacher.lesson_7_array_for.lessoncode;

class MathGradeCalculator {

    int findMaxGrade(int[] grades) {
        int maxGrade = grades[0];
        for (int i = 0; i < grades.length; i++) {
            if (maxGrade < grades[i]) {
                maxGrade = grades[i];
            }
        }
        return maxGrade;
    }

}
