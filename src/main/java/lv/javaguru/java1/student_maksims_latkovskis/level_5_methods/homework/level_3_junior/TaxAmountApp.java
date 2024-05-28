package lv.javaguru.java1.student_maksims_latkovskis.level_5_methods.homework.level_3_junior;


class TaxAmountApp {
    public static void main(String[] args){

        TaxAmount taxAmount = new TaxAmount();

        double[] moneyAmount = {3.55, 33333, -8, 100000, 100};

        for (double money : moneyAmount) {
            double taxCalculated = taxAmount.taxAmount(money);
            System.out.println("For the amount of " + money + " the tax is calculated to be:" + taxCalculated);
        }
    }



}
