package lv.javaguru.java1.student_anton_pereloma.lesson_3.homework.level_2;

class Car {
    private String make;
    private String color;
    private int price;

    public Car(String make, String color, int price) {
        this.make = make;
        this.color = color;
        this.price = price;
    }

    public String getMake() {
        return this.make;
    }
    public String getColor() {
        return this.color;
    }
    public int getPrice() {
        return this.price;
    }

    public void changeMake(String make) {
        this.make = make;
    }
    public void changeColor(String color) {
        this.color = color;
    }
    public void changePrice(int price) {
        this.price = price;
    }






}
