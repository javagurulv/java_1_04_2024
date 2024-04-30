package lv.javaguru.java1.teacher.lesson_3_oop_first_look.lessoncode;

class BankAccountApplication {

    // Runtime

    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Vasja", 1);
        BankAccount bankAccount2 = new BankAccount("Petja", 2);
        BankAccount bankAccount3 = new BankAccount("Tanja", 3);

        BankAccount bankAccount4 = new BankAccount("Sanita");
        BankAccount bankAccount5 = new BankAccount("Didzis");

        BankAccount bankAccount6 = new BankAccount(100);
        BankAccount bankAccount7 = new BankAccount(200);

    }

}
