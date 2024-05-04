package lv.javaguru.java1.student_sergejs_temcenko.lesson_3_oop_first_look.homework.level_2_inter;

class Car {

    private String model;
    private String color;
    private int price;

    public Car(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
    public String getModel() {
        return  this.model;
    }
    public  String getColor() {
        return this.color;
    }
    public int getPrice() {
        return this.price;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setPrice(int price) {
        this.price = price;
    }



}
