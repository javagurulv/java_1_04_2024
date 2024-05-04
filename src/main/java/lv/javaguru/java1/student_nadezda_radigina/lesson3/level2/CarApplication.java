package lv.javaguru.java1.student_nadezda_radigina.lesson3.level2;

 class CarApplication {
     public static void main(String[] args){
         Car car1 = new Car("Nissan", "grey", 8000);
         Car car2 = new Car("Renault", "green", 2000);
         Car car3 = new Car("Kia", "silver", 3000);

         System.out.println("Car 1 type " + car1.getType());
         System.out.println("Car 1 color " + car1.getColor());
         System.out.println("Car 1 price " + car1.getPrice());

         System.out.println();

         System.out.println("Car 2 type " + car2.getType());
         System.out.println("Car 2 color " + car2.getColor());
         System.out.println("Car 2 price " + car2.getPrice());
         System.out.println();

         System.out.println("Car 3 type " + car3.getType());
         System.out.println("Car 3 color " + car3.getColor());
         System.out.println("Car 3 price " + car3.getPrice());
         System.out.println();

         car1.setType("Toyota");
         System.out.println("Car 1 type " + car1.getType());
         car1.setColor("red");
         System.out.println("Car 1 color " + car1.getColor());
         car1.setPrice(3500);
         System.out.println("Car 1 price " + car1.getPrice());
         System.out.println();

         car2.setType("Audi");
         car2.setColor("black");
         car2.setPrice(6500);
         System.out.println("Car 2 type " + car2.getType());
         System.out.println("Car 2 color " + car2.getColor());
         System.out.println("Car 2 price " + car2.getPrice());
         System.out.println();

         car3.setType("Honda");
         car3.setColor("blue");
         car3.setPrice(2500);
         System.out.println("Car 3 type " + car3.getType());
         System.out.println("Car 3 color " + car3.getColor());
         System.out.println("Car 3 price " + car3.getPrice());
         System.out.println();

     }

}
