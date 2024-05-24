package lv.javaguru.java1.student_natalia_kochkina.lesson_5.homework.level_7.task_2;

class AverageMarkCalculator {

    double getAverage(double[] grades) {
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }

        return sum / grades.length;
    }

}
