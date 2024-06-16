package lv.javaguru.java1.student_eyheni_salmin.lesson_3.homework.level_2_intern;

public class Car {
    private String name;
    private String color;
    private double price;

    public Car(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }


    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Car{" +
                "name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                ", price=" + getPrice() +
                '}';
    }
}
