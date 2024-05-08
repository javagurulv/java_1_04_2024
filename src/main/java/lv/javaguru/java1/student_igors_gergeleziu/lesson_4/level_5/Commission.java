package lv.javaguru.java1.student_igors_gergeleziu.lesson_4.level_5;

class Commission {
    float calculateCommission(float withdraw) {
        if (withdraw != 0 && withdraw > 0) {
            if (withdraw < 1000) withdraw *= 0.03f;
            else if (withdraw >= 1000 && withdraw < 5000) withdraw *= 0.04f;
            else if (withdraw >= 5000) withdraw *= 0.05f;
            return withdraw;
        } else return 0;
    }
}
