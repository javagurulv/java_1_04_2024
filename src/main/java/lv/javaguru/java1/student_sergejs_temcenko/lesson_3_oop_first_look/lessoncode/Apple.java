package lv.javaguru.java1.student_sergejs_temcenko.lesson_3_oop_first_look.lessoncode;

class Apple {

    private  String type;
    private String color;
    private int weight;

    public Apple(String type, String color, int weight) {
        this.type = type;
        this.color = color;
        this.weight = weight;
    }

    public String getType() { //polucaem type
        return this.type;
    }
    public String getColor(){ //polucaem color
        return this.color;
    }

    public int getWeight() {
        return this.weight;
    }


}
