package lv.javaguru.java1.student_igors_gergeleziu.lesson_8.day_5;

class Product {
    private String title;
    private double price;

    public Product(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title + " " +
                price + "$";

    }
}
