package lv.javaguru.java1.student_anton_pereloma.lesson_3.homework.level_1;

public class RobotApp {
    public static void main(String[] args) {
        Robot robot1 = new Robot("Vanya");
        Robot robot2 = new Robot("Borogozin");


        System.out.println("Robot 1 name: " + robot1.getName());
        System.out.println("Robot 2 name: " + robot2.getName());

        robot1.changeName("Klavdia");
        robot2.changeName("MA-9 \"Belyash\"");

        System.out.println("Robot 1 name changed to: " + robot1.getName());
        System.out.println("Robot 2 name changed to: " + robot2.getName());

    }

}
