package lv.javaguru.java1.student_natalia_kochkina.lesson_7.lessoncode;

class MathGradeCalculator {

    int findMaxGrade(int[] mathGrades) {
        int maxGrade = mathGrades[0];
        for (int i = 0; i < mathGrades.length; i++) {
            if (maxGrade < mathGrades[i]) {
                maxGrade = mathGrades[i];
            }
        }
        return maxGrade;
    }

    int findMinGrade(int[] mathGrades) {
        int minGrade = mathGrades[0];
        for (int i = 0; i < mathGrades.length; i++) {
            if (minGrade > mathGrades[i]) {
                minGrade = mathGrades[i];
            }
        }
        return minGrade;
    }

}
