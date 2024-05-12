package lv.javaguru.java1.student_anton_pereloma.lesson_4.homework.level_5_middle;

class CommissionCalculator {
    int withdrawal;

    CommissionCalculator (int withdrawal) {
        this.withdrawal = withdrawal;
    }

    double getPercentage() {
        int percentage = 0;
        if (withdrawal < 1000) {
            percentage = 3;
        } else if ((withdrawal >= 1000) && (withdrawal < 5000)) {
            percentage = 4;
        } else if (withdrawal >= 5000) {
            percentage = 5;
        }
        return (double) percentage/100 ;
    }

}
