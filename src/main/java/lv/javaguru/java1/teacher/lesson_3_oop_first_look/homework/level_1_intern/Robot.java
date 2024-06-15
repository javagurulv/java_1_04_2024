package lv.javaguru.java1.teacher.lesson_3_oop_first_look.homework.level_1_intern;

public class Robot {
    private String name;

    public Robot(String name) {
        this.name = name;
    }
    public void sayWhoYouAre() {
        System.out.println(name);
    }
    public String getRobotName() {
        return name;
    }
}
