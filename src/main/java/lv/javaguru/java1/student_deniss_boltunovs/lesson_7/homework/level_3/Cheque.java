package lv.javaguru.java1.student_deniss_boltunovs.lesson_7.homework.level_3;

class Cheque {
    private String chequeNumber;
    private double amount;

    public Cheque(String chequeNumber, double amount) {
        this.chequeNumber = chequeNumber;
        this.amount = amount;
    }

    public String getNumber() {return chequeNumber;}

    public double getAmount() {return amount;}

}
