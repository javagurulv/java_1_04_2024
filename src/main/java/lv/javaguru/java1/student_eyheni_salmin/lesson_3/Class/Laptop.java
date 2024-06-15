package lv.javaguru.java1.student_eyheni_salmin.lesson_3.Class;

public class Laptop {
    private String model;
    private double price;

    public Laptop () {}
    public Laptop (String model, double price) {
        this.model = model;
        this.price = price;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getModel() {
        return model;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Модель: " + model + "\n" + "Цена: " + price;
    }
}
