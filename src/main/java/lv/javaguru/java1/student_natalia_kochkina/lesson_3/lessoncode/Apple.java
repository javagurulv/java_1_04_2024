package lv.javaguru.java1.student_natalia_kochkina.lesson_3.lessoncode;

class Apple {

    private String color;
    private String type;
    private int weight;

    public Apple(String type, String color, int weight) {
        this.type = type;
        this.color = color;
        this.weight = weight;
    }

    public String getType() {
        return this.type;
    }

    public String getColor() {
        return this.color;
    }

    public int getWeight() {
        return this.weight;
    }
}
