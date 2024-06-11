package lv.javaguru.java1.student_artem_galustan.lesson7.homework.Level3;

class CashRecept {

private String checkNumber;
private double purchaseAmount;

CashRecept(String checkNumber, double purchaseAmount){
    this.checkNumber = checkNumber;
    this.purchaseAmount = purchaseAmount;
}
String getCheckNumber(){ return this.checkNumber; }

double getPurchaseAmount(){
    return this.purchaseAmount;}

}
