package lv.javaguru.java1.student_nikita_paramonovs.lesson_3;

import java.util.Scanner;

class RobotApp {
    public static void main(String[] args) {
        Robot robot1 = new Robot("Progger");
        Robot robot2 = new Robot("Duster");

        System.out.println("Before changing names:");
        System.out.println("Robot1 name is: " + robot1.getName());
        System.out.println("Robot2 name is: " + robot2.getName());

        robot1.set("Maxim");
        robot2.set("Galkin");

        System.out.println("After changing names:");
        System.out.println("Robot1 NewName is: " + robot1.getName());
        System.out.println("Robot2 NewName is: " + robot2.getName());

        System.out.println("get method Robot1 name is: " + robot1.getName());
        System.out.println("get method Robot2 name is: " + robot2.getName());

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a new name for Robot1: ");
        String newName1 = scanner.nextLine();
        robot1.setName(newName1);

        System.out.print("Enter a new name for Robot2: ");
        String newName2 = scanner.nextLine();
        robot2.setName(newName2);


        System.out.println("New names:");
        System.out.println("Robot1 name is: " + robot1.getName());
        System.out.println("Robot2 name is: " + robot2.getName());




    }
}
