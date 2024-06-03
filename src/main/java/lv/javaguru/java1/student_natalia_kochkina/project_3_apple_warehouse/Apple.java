package lv.javaguru.java1.student_natalia_kochkina.project_3_apple_warehouse;

import java.util.Objects;

class Apple {

    private String color;
    private int weight;

    public Apple (String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    String getColor() {
        return color;
    }

    int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return getWeight() == apple.getWeight() && Objects.equals(getColor(), apple.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColor(), getWeight());
    }
}
