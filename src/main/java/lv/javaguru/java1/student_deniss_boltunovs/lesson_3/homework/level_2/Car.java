package lv.javaguru.java1.student_deniss_boltunovs.lesson_3.homework.level_2;

class Car {

      private String model;
      private String color;
      private int price;

      public Car(String model, String color, int price) {
          this.model = model;
          this.color = color;
          this.price = price;
      }

      public String getModel() {
          return this.model;
      }

      public void setModel(String model) {
          this.model = model;
      }

      public String getColor() {
          return this.color;
      }

      public void setColor(String color){
          this.color = color;
      }

      public int getPrice() {
          return this.price;
      }

      public void setPrice(int price) {
          this.price = price;
      }

}
