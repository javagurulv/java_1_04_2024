package lv.javaguru.java1.student_natalia_kochkina.lesson_3.lessoncode;


import java.util.Scanner;

class BankAccountApplication {

    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Vasja", 2);
        BankAccount bankAccount2 = new BankAccount("Petja", 3);
        BankAccount bankAccount3 = new BankAccount("Vanja", 4);

        BankAccount bankAccount4 = new BankAccount("Natalia");

        BankAccount bankAccount5 = new BankAccount(4);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String owner = scanner.nextLine();
        System.out.println("Enter your money");
        int money = scanner.nextInt();

        BankAccount bankAccount6 = new BankAccount(owner, money);

        String owner6 = bankAccount6.getOwner();
        System.out.println("Owner: " + owner6);

        String owner1 = bankAccount1.getOwner();
        System.out.println("Owner: " + owner1);

        int money1 = bankAccount1.getMoney();
        System.out.println("Money = " + money1);

        int money6 = bankAccount6.getMoney();
        System.out.println("Money = " + money6);

        bankAccount2.setMoney(555);
        System.out.println("Money = " + bankAccount2.getMoney());

        bankAccount2.addMoney(66);
        System.out.println("Money = " + bankAccount2.getMoney());

        bankAccount3.subMoney(4);
        System.out.println("Money = " + bankAccount2.getMoney());

    }

}
