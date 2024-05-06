package lv.javaguru.java1.student_natalia_kochkina.lesson_3.homework.level_1;

class RobotApp {

    public static void main(String[] args) {

        Robot robot1 = new Robot("RD-D2");
        Robot robot2 = new Robot("C3-PO");

        System.out.println("Robot1 name: " + robot1.getName());
        System.out.println("Robot2 name: " + robot2.getName());

        robot1.setName("T-800");
        System.out.println("Robot1 name: " + robot1.getName());
        robot2.setName("T-1000");
        System.out.println("Robot2 name: " + robot2.getName());

    }
}
