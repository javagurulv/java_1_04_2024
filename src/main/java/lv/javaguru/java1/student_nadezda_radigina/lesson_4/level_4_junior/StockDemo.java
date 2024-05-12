package lv.javaguru.java1.student_nadezda_radigina.lesson_4.level_4_junior;

 class StockDemo {
     public static void main(String[] args){

         Stock cat = new Stock("Cat",10);

         System.out.println("Company = " + cat.getName());
         System.out.println("Current Price = " + cat.getCurrentPrice());
         System.out.println("Min Price = " + cat.getMinPrice());
         System.out.println("Max Price = " + cat.getMaxPrice());

         cat.updatePrice(15);
         cat.updatePrice(7);
         cat.updatePrice(14);
         //cat.updatePrice(13);
         //cat.updatePrice(25);
         System.out.println();

         System.out.println("Company = " + cat.getName());
         System.out.println("Current Price = " + cat.getCurrentPrice());
         System.out.println("Min Price = " + cat.getMinPrice());
         System.out.println("Max Price = " + cat.getMaxPrice());
     }
}
