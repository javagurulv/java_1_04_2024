package lv.javaguru.java1.student_svetlana_bodnarska.lesson_5.homework.level_3_junior;

class TaxAmmountApp
{
    public static void main(String[] args) {

        TaxAmount taxAmount = new TaxAmount();

        System.out.println("Income = 10000, Tax = " +taxAmount.taxCalculation(10000));
        System.out.println("Income = 11000, Tax = " +taxAmount.taxCalculation(11000));
        System.out.println("Income = 51000, Tax = " +taxAmount.taxCalculation(51000));
        System.out.println("Income = 10000, Tax = " +taxAmount.taxCalculation(10000));

    }
}
