package lv.javaguru.java1.student_igors_gergeleziu.lesson_3.level_1;

class RobotApp {
    public static void main(String[] args) {
        Robot robot1 = new Robot("R2D2");
        Robot robot2 = new Robot("R2D3");

        System.out.println("Robot1 name: " + robot1.get());
        System.out.println("Robot2 name: " + robot2.get());

        robot1.set("R3D2");
        robot2.set("R3D3");

        System.out.println("Robot1 name: " + robot1.get());
        System.out.println("Robot2 name: " + robot2.get());
    }
}
