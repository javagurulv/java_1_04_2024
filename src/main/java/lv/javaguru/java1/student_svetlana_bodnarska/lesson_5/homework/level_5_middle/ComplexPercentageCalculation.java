package lv.javaguru.java1.student_svetlana_bodnarska.lesson_5.homework.level_5_middle;

class ComplexPercentageCalculation
{
    public double calculate(double principalAmount,
                            double interestRatePerYear,
                            int numberOfYearsInvested) {
        return principalAmount * Math.pow((1 + interestRatePerYear), numberOfYearsInvested);

    }
}
