package lv.javaguru.java1.student_sergejs_temcenko.lesson_3_oop_first_look.homework.level_1;

public class RobotApp {

    public static void main(String[] args) {

        Robot robot1 = new Robot("Rob1");
        Robot robot2 = new Robot("Rob2");

        String nameRobot1 = "Robot1 name is: " + robot1.getName();
        String nameRobot2 = "Robot2 name is: " + robot2.getName();

        System.out.println(nameRobot1);
        System.out.println(nameRobot2);

        robot1.setName("Robot1.1");

        System.out.println("Robot1 go to Robot1.1: " + robot1.getName());
    }
}
