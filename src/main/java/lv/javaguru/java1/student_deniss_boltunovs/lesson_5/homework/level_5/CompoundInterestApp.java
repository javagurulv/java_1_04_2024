package lv.javaguru.java1.student_deniss_boltunovs.lesson_5.homework.level_5;

class CompoundInterestApp {

    public static void main(String[] args) {

        CompoundInterest interest = new CompoundInterest();

        interest.calculateInterest(5000,0.05,1,5);
        interest.calculateInterest(5000,0.05,2,5);
        interest.calculateInterest(5000,0.05,4,5);
        interest.calculateInterest(5000,0.05,12,5);

    }
}
