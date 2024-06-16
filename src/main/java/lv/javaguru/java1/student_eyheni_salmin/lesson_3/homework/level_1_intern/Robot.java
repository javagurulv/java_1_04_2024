package lv.javaguru.java1.student_eyheni_salmin.lesson_3.homework.level_1_intern;

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
    public void setRobotName(String name) {
        this.name = name;
    }
}
