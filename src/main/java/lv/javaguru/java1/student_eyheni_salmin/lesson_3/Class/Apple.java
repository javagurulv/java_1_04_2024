package lv.javaguru.java1.student_eyheni_salmin.lesson_3.Class;

public class Apple {

    private String type;
    private String color;
    private int weight;

    public Apple() {}
    public Apple(String type, String color, int weight) {
        this.type = type;
        this.color = color;
        this.weight = weight;
    }
//  геттеры по умолчанию так же без this.
    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }
// перегрузка метода:
    public void printApple(String name) {
        System.out.print("Яблоки: " + name + " ");
    }
    public void printApple(int weight) {
        System.out.print("Яблоки: " + weight + " ");
    }
  }
