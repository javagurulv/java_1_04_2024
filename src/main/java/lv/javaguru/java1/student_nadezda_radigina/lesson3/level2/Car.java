package lv.javaguru.java1.student_nadezda_radigina.lesson3.level2;

 class Car {
     private String type;
     private String color;
     private int price;

     public Car(String type, String color, int price){
         this.type = type;
         this.color = color;
         this.price = price;
     }

     public String getType(){
         return this.type;
     }
     public String getColor(){
         return this.color;
     }
     public int getPrice(){
         return this.price;
     }
     public void setType(String type){
         this.type = type;

     }
     public void setColor(String color){
         this.color = color;
     }
     public void setPrice(int price){
         this.price = price;
     }

}
