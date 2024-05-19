package lv.javaguru.java1.student_jelena_k.lesson3;

public class Car {
    private String model;
    private String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }
    public String getModel() {return this.model; }
    public String getColor() {return this.color; }

    public void setModel(String model) {this.model = model; }
    public void setColor(String color) {this.color = color; }
}
