package lv.javaguru.java1.student_nikita_paramonovs.lesson_3;

class RobotApp {
    public static void main(String[] args) {
        Robot robot1 = new Robot("Progger");
        Robot robot2 = new Robot("Duster");

        System.out.println("Robot1 name is: " + robot1.name);
        System.out.println("Robot2 name is: " + robot2.name);

        robot1.set("Maxim");
        robot2.set("Galkin");

        System.out.println("Robot1 NewName is: " + robot1.name);
        System.out.println("Robot2 NewName is: " + robot2.name);

    }
}
