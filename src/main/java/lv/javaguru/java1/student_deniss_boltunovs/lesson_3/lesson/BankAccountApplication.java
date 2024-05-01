package lv.javaguru.java1.student_deniss_boltunovs.lesson_3.lesson;

import java.util.Scanner ;

class BankAccountApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Enter owner: ");
        String owner = scanner.nextLine();

        System.out.println("Enter money: ");
        int money = Integer.parseInt(scanner.nextLine()); //  //  scanner.nextInt()
        BankAccount account1 = new BankAccount("Deniss Boltunovs" , 1000000000) ;
        BankAccount account2 = new BankAccount("Test user") ;
        BankAccount account3 = new BankAccount(1345) ;
        BankAccount account4 = new BankAccount(owner, money) ;

        System.out.println(account1.getOwner());
        System.out.println(account1.getMoney());
        account1.addMoney(450) ;
        System.out.println(account1.getMoney());

        System.out.println(account1.getOwner());
        System.out.println(account2.getOwner());
        System.out.println(account3.getOwner());
        System.out.println(account4.getOwner());
        System.out.println(account4.setMoney(3456)) ;

    }
}
