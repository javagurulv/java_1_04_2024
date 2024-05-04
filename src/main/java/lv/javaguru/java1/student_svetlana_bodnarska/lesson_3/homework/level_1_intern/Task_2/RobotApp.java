package lv.javaguru.java1.student_svetlana_bodnarska.lesson_3.homework.level_1_intern.Task_2;

class RobotApp {
    public static void main(String[] args) {
        Robot robot1 = new Robot("Zora");
        Robot robot2 = new Robot("Petja");

        System.out.println("Name: " + robot1.getName());
        System.out.println("Name: " + robot2.getName());

        robot1.setName("Mitja");
        robot2.setName("Masha");
        System.out.println("Robot1: " + robot1.getName());
        System.out.println("Robot2: " + robot2.getName());



    }




}
