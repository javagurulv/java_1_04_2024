package lv.javaguru.java1.student_maksims_latkovskis.lesson_3_oop_first_look.homework.level_1_intern;

class RobotApp {

    public static void main(String[] args){

        Robot Robot1 = new Robot("Wally");
        Robot Robot2 = new Robot("Eva");

        System.out.println("The name of the first Robot is: " + Robot1.getName());
        System.out.println("The name of the second Robot is: " + Robot2.getName());

        Robot1.setName("R2-D2");
        Robot2.setName("C-3PO");

        System.out.println("The new name of the first Robot is: " + Robot1.getName());
        System.out.println("The new name of the second Robot is: " + Robot2.getName());
    }

}
