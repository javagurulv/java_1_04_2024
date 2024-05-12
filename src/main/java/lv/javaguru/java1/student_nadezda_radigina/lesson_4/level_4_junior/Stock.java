package lv.javaguru.java1.student_nadezda_radigina.lesson_4.level_4_junior;

 class Stock {


      private String name;
      private int currentPrice;
      private int minPrice;
      private int maxPrice;

      Stock (String name, int currentPrice){
       this.name = name;
       this.currentPrice = currentPrice;
       this.minPrice = currentPrice;
       this.maxPrice = currentPrice;

      }
     String getName() {

          return this.name;
     }
     int getCurrentPrice(){
          return this.currentPrice;
     }
     int getMinPrice(){
          return this.minPrice;
     }
     int getMaxPrice(){
          return this.maxPrice;
     }

     public void updatePrice(int newPrice){
          this.currentPrice = newPrice;
          if (newPrice < minPrice){
              minPrice = newPrice;
          }
          if (newPrice > maxPrice){
              maxPrice = newPrice;
     }
      }



}
