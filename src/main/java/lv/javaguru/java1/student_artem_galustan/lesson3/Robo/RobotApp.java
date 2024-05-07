package lv.javaguru.java1.student_artem_galustan.lesson3.Robo;

public class RobotApp {
    public static void main(String[] args) {

        Robot robot1 = new Robot("TESLA", 1);
        SecRobot robot2 = new SecRobot("SPUTNIK", 15);

        System.out.println("Robot1 has name " + robot1.Name);
        System.out.println("Robot2 has diffrent name " + robot2.Name);

        System.out.println("Get method robot1 name is " + robot1.getName());
        System.out.println("Get method robot2 name is " + robot2.getName());

        robot1.set("boba");

        robot2.set("GO");
    }
}
