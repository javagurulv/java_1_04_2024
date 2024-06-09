package lv.javaguru.java1.student_deniss_boltunovs.project_2_geometry_shape.shapes;

public class Rectangle extends Shape {

      private double length;
      private double width;

      public Rectangle(String title, double length, double width) {
          super(title);
          this.length = length;
          this.width = width;
      }

      @Override
      public double calculateArea(){
          return length * width;
      }

      @Override
      public double calculatePerimeter(){
          return (length + width) * 2;
      }

      public double getLength(){
          return length;
      }

      public double getWidth(){
          return width;
      }

}
