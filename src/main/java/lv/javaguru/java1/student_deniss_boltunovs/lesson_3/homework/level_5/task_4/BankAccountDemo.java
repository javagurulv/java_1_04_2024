package lv.javaguru.java1.student_deniss_boltunovs.lesson_3.homework.level_5.task_4;

class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Viktor", "Popov", 100000);

        String ownerFirstName = bankAccount.getOwnerFirstName();
        String ownerLastName = bankAccount.getOwnerLastName();
        int moneyAmount = bankAccount.getMoneyAmount();

        System.out.println("Owner first name = " + ownerFirstName);
        System.out.println("Owner last name = " + ownerLastName);
        System.out.println("Money amount = " + moneyAmount);

    }

}
