package lv.javaguru.java1.student_nadezda_radigina.lesson3.level_7_senior;

 class Circle {
     private double radius;

     Circle(double radius){
         this.radius = radius;
     }

     public double getRadius() {
         return radius;
     }

     double calculateArea(double radius) {
             double area = radius * radius * Math.PI;
        return area;
     }
}
