package lv.javaguru.java1.student_nadezda_radigina.lesson_5.level_6_middle;

class StudentGrades {
    public double averageGrade (int history,
                                int biology,
                                int mathematics,
                                int chemistry,
                                int physics){
        int sum = history + biology + mathematics + chemistry + physics;
        return (double) sum / 5;
    }
}
