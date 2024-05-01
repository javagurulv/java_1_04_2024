package lv.javaguru.java1.student_deniss_boltunovs.lesson_3.homework.level_1;

public class RobotApp {

    public static void main(String[] args) {

        Robot robot1 = new Robot("Bender");
        Robot robot2 = new Robot("Terminator");

        System.out.println("Robot name: " + robot1.getRobotName());
        System.out.println("Robot name: " + robot2.getRobotName());

        robot1.setRobotName("Johnny 5");
        robot2.setRobotName("Optimus Prime");

        System.out.println("Robot new name:" + robot1.getRobotName());
        System.out.println("Robot new name:" + robot2.getRobotName());

    }

}
