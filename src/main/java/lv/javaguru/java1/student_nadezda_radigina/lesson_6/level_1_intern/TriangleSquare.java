package lv.javaguru.java1.student_nadezda_radigina.lesson_6.level_1_intern;

class TriangleSquare {
    public double calculateSquare(int a, int b, int c) {
        double s = calculateSemiPerimeter(a, b, c);
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    public double calculateSemiPerimeter(int a, int b, int c) {
        return (a + b + c) / (double) 2;

    }
}
