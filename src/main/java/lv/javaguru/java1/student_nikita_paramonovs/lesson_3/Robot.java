package lv.javaguru.java1.student_nikita_paramonovs.lesson_3;

import javax.naming.Name;

class Robot {
    public String name;
    public Robot(String name){
        this.name = name;
    }




    public void set(String newName) {
        this.name = newName;
    }






    public String getName(){
        return name;
    }





    public void setName(String name) {
        this.name = name;
    }






    public static void main(String[] args) {
    Robot robot = new Robot("Progger");
    System.out.println("Robot name is:" +robot.getName());}
}

