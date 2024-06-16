package lv.javaguru.java1.student_eyheni_salmin.lesson_3.homework.level_1_intern;

public class RobotApp {
    public static void main(String[] args) {
        new Robot("Федор").sayWhoYouAre();
        new Robot("Петр").sayWhoYouAre();

        Robot robotOne = new Robot("Кузя");
        Robot robotTwo = new Robot("Вася");

        System.out.println(robotOne.getRobotName());
        System.out.println(robotTwo.getRobotName());

        robotOne.setRobotName("Кеша");
        robotTwo.setRobotName("Гриша");

        System.out.println(robotOne.getRobotName());
        System.out.println(robotTwo.getRobotName());
    }
}
