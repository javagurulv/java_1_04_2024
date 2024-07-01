package lv.javaguru.java1.student_eyheni_salmin.lesson_4.homework.level_4_junior;

class StockApp {
    public static void main(String[] args) {
        Stock google = new Stock("Goog", 10);
        google.printFullInfo();

        google.updatePrice(10);
        google.updatePrice(12);
        google.updatePrice(5);
        google.updatePrice(7);
        google.updatePrice(99);
        google.updatePrice(77);
        google.updatePrice(14);

        google.printFullInfo();

    }
}
