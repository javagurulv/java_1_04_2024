package lv.javaguru.java1.student_deniss_boltunovs.lesson_5.lesson;

class TriangleArea {

    double semiPerimeter(int sideA,
                         int sideB,
                         int sideC) {
         return (double) (sideA + sideB + sideC) / 2;
    }

    double calculateArea(int sideA,
                         int sideB,
                         int sideC) {
         double sPerimeter = semiPerimeter(sideA, sideB, sideC);
         return Math.sqrt(sPerimeter * (sPerimeter - sideA) * (sPerimeter - sideB) * (sPerimeter - sideC));
    }

}
