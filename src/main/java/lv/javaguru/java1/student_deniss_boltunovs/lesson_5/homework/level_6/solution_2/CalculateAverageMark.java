package lv.javaguru.java1.student_deniss_boltunovs.lesson_5.homework.level_6.solution_2;

class CalculateAverageMark {

    public double calculate(Subjects subjects) {
        int markSum = subjects.getMath() +
                      subjects.getEnglish() +
                      subjects.getEconomics() +
                      subjects.getArt() +
                      subjects.getSport() ;

        return (double) markSum / 5;
    }

}
