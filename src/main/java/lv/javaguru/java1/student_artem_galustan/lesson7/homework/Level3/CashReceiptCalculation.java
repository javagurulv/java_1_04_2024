package lv.javaguru.java1.student_artem_galustan.lesson7.homework.Level3;

public class CashReceiptCalculation {


        public double receptCalculate(CashRecept[] purchaseAmount){
            double sum = 0.0;
            for ( int i = 0; i < purchaseAmount.length; i++){
                CashRecept recept = purchaseAmount[i];
                sum += recept.getPurchaseAmount();
            }
            return  sum;

        }

        public double receptAverageSumCalculator(CashRecept[] purchaseAmount) {
            if( purchaseAmount.length == 0){
                return 0;
            }else {
                double sum =0.0;
                for(int i =0; 1< purchaseAmount.length; i++){
                    CashRecept recept = purchaseAmount[i];
                    sum += recept.getPurchaseAmount();
                }
                return sum / purchaseAmount.length;
            }

        }

    }







