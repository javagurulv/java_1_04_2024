package lv.javaguru.java1.student_pavels_zuriha.lesson_3.homework.level_1;

class RobotApp {

    public static void main(String[] args) {

        Robot robot1 = new Robot("Name of the robot #1");
        Robot robot2 = new Robot("Name of the robot #2");

        System.out.println("Name: " + robot1.getName());
        System.out.println("Name: " + robot2.getName());



        robot1.setName("NewName#1");
        robot2.setName("NewName#2");
        System.out.println("New name: " + robot1.getName());
        System.out.println("New name: " + robot2.getName());
    }
}
