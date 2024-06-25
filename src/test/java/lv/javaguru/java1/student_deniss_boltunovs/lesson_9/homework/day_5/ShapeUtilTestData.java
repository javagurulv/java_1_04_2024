package lv.javaguru.java1.student_deniss_boltunovs.lesson_9.homework.day_5;

 class ShapeUtilTestData {

     public static Shape[] generateShapes() {
         Shape[] shapes = new Shape[4];
         shapes[0] = new Circle(4, "my circle");
         shapes[1] = new Square(4, "my square");
         shapes[2] = new Rectangle(4, 4,"my rectangle");
         shapes[3] = new Triangle(4, 4,4,"my triangle");
         return shapes;
     }

 }
