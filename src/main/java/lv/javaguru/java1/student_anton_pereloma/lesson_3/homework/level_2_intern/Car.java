package lv.javaguru.java1.student_anton_pereloma.lesson_3.homework.level_2_intern;

class Car {
    private String make;
    private String color;
    private int price;

    Car(String make, String color, int price) {
        this.make = make;
        this.color = color;
        this.price = price;
    }

    String getMake() {
        return this.make;
    }

    String getColor() {
        return this.color;
    }

    int getPrice() {
        return this.price;
    }

    void changeMake(String make) {
        this.make = make;
    }

    void changeColor(String color) {
        this.color = color;
    }

    void changePrice(int price) {
        this.price = price;
    }


}
