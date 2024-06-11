package lv.javaguru.java1.student_artem_galustan.fraud_detector1;

class Transaction {

    private Trader trader;
    private int amount;

 private Transaction(Trader trader, int amount){
     this.trader = trader;
     this.amount = amount;
 }


    Trader getTrader() {
        return trader;
 }
 int getAmount() {
     return amount;
 }

}

