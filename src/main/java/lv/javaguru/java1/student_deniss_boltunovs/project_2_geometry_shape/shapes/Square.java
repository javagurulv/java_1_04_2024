package lv.javaguru.java1.student_deniss_boltunovs.project_2_geometry_shape.shapes;

class Square extends Shape {

       private double sideLength;

       Square(String title, double sideLength) {
           super(title);
           this.sideLength = sideLength;
       }

       @Override
       double calculateArea(){
           return Math.pow(sideLength,2);
       }

       @Override
       double calculatePerimeter(){
           return sideLength * 4;
       }


}
