package lv.javaguru.java1.student_igors_gergeleziu.lesson_3.level_2;

class Car {
    private String brand;
    private String color;
    private int price;

    public Car(String brand, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    String getBrand() {
        return brand;
    }

    String getColor() {
        return color;
    }

    int getPrice() {
        return price;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price;
    }
}
