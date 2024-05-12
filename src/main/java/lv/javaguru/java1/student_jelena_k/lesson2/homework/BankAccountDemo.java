package lv.javaguru.java1.student_jelena_k.lesson2.homework;



public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount =new BankAccount("Jelena" , 700);

        String owner = bankAccount.getOwner();

        int moneyAmount = bankAccount.getMoneyAmount();
        System.out.println("Owner = " + owner);
        System.out.println("Money amount = " + moneyAmount);


    }
}
