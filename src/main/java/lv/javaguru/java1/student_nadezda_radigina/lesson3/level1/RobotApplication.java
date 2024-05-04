package lv.javaguru.java1.student_nadezda_radigina.lesson3.level1;

 class RobotApplication {
     public static void main(String[] args){
         Robot robot1 = new Robot("Boris");
         Robot robot2 = new Robot("Alex");

         String name1 = robot1.getName();
         System.out.println("Name: " + name1);

         String name2 = robot2.getName();
         System.out.println("Name: " + name2);

         System.out.println();

         System.out.println("Name: " + robot1.getName());
         System.out.println("Name: " + robot2.getName());


          //name1 = robot2.getName();
         //System.out.println("Name: " + name1);
         System.out.println();

         robot1.setName("Erik");
         robot2.setName("Tolik");
         System.out.println("Name: " + robot1.getName());
         System.out.println("Name: " + robot2.getName());

     }
}
