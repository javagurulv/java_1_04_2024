package lv.javaguru.java1.student_igors_gergeleziu.lesson_3.level_1;

class Robot {
    private String robotName;

    Robot(String name) {
        this.robotName = name;
    }

    String get() {
        return robotName;
    }
    void set(String name){
        this.robotName=name;
    }
}
