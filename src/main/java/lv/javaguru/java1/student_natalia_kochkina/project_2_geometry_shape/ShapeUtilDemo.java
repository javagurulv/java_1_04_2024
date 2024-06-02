package lv.javaguru.java1.student_natalia_kochkina.project_2_geometry_shape;

class ShapeUtilDemo {

    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape square1 = shapeUtil.createRandomSquare();
        double square1Area = shapeUtil.calculateArea(square1);
        double square1Perimeter = shapeUtil.calculatePerimeter(square1);

        System.out.println("Square1 area = " + square1Area);
        System.out.println("Square1 perimeter = " + square1Perimeter);
    }

}
