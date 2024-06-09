package lv.javaguru.java1.student_nikita_paramonovs.lesson_6;

public class Calculator {
    public static double calculateTax(double income) {
        double tax = 0.0;

        if (income <= 10000) {
            tax = income * 0.30;
        } else if (income <= 50000) {
            tax = (10000 * 0.30) + ((income - 10000) * 0.40);
        } else {
            tax = (10000 * 0.30) + (40000 * 0.40) + ((income - 50000) * 0.50);
        }

        return tax;
    }

    public static void main(String[] args) {
        double[] testIncomes = {5000, 10000, 20000, 50000, 70000};

        for (double income : testIncomes) {
            System.out.println("Income: " + income + " euros, Tax: " + calculateTax(income) + " euros");
        }
    }
}
