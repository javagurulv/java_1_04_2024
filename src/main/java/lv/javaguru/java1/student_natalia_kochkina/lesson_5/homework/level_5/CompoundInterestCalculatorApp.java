package lv.javaguru.java1.student_natalia_kochkina.lesson_5.homework.level_5;

class CompoundInterestCalculatorApp {

    public static void main(String[] args) {
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        System.out.println(compoundInterestCalculator.calculate(1000, 10, 3));
        System.out.println(compoundInterestCalculator.calculate(10000, 20, 10));
        System.out.println(compoundInterestCalculator.calculate(3000, 2, 5));
    }
}
