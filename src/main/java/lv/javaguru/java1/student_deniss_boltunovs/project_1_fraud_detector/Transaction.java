package lv.javaguru.java1.student_deniss_boltunovs.project_1_fraud_detector;

class Transaction {

    private Trader trader;
    private int amount;

    Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    public Trader getTrader(){return  trader;}

    public int getAmount() {return amount;}


}
