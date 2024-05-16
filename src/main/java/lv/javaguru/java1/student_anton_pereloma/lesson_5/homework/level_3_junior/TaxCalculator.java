package lv.javaguru.java1.student_anton_pereloma.lesson_5.homework.level_3_junior;

public class TaxCalculator {
    int taxRate(int amount) {
        int rate = 0;
        if (amount > 0) {
            if ((amount >= 0) && (amount <= 10000)){
                rate = 30;
            } else if ((amount > 10000) && (amount <= 50000)){
                rate = 40;
            } else {
                rate = 50;
            }
        }
            return rate;
    }
}


