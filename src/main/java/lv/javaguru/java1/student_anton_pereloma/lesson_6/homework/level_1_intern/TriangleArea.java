package lv.javaguru.java1.student_anton_pereloma.lesson_6.homework.level_1_intern;

class TriangleArea {

    public double calculateArea(int a, int b, int c) {
        double s = calculateSemiPerimeter(a, b, c);
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double calculateSemiPerimeter(int a, int b, int c) {
        return (a + b + c) / (double) 2;
    }

}
