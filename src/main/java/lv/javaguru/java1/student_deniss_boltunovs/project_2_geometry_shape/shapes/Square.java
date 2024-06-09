package lv.javaguru.java1.student_deniss_boltunovs.project_2_geometry_shape.shapes;

public class Square extends Shape {

       private double sideLength;

       public Square(String title, double sideLength) {
           super(title);
           this.sideLength = sideLength;
       }

       @Override
       public double calculateArea(){
           return Math.pow(sideLength,2);
       }

       @Override
       public double calculatePerimeter(){
           return sideLength * 4;
       }

       public double getSideLength(){
           return sideLength;
       }

}
