package lv.javaguru.java1.student_natalia_kochkina.lesson_6.homework.level_1.task_1;

class TriangleSquareTest {

    public static void main(String[] args) {
        TriangleSquareTest test = new TriangleSquareTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
        test.test5();
        test.test6();
    }

    public void test1() {
        int a = 20;
        int b = 16;
        int c = 12;
        double expectedSquare = 96;

        TriangleSquare triangleSquare = new TriangleSquare();
        double realSquare = triangleSquare.calculateSquare(a, b, c);

        if (expectedSquare == realSquare) {
            System.out.println("TEST1 = OK");
        } else {
            System.out.println("TEST1 = FAIL");
        }
    }

    public void test2() {
        int a = 13;
        int b = 14;
        int c = 15;
        double expectedSquare = 84;

        TriangleSquare triangleSquare = new TriangleSquare();
        double realSquare = triangleSquare.calculateSquare(a, b, c);

        if (expectedSquare == realSquare) {
            System.out.println("TEST2 = OK");
        } else {
            System.out.println("TEST2 = FAIL");
        }
    }

    public void test3() {
        int a = 28;
        int b = 26;
        int c = 30;
        double expectedSquare = 336;

        TriangleSquare triangleSquare = new TriangleSquare();
        double realSquare = triangleSquare.calculateSquare(a, b, c);

        if (expectedSquare == realSquare) {
            System.out.println("TEST3 = OK");
        } else {
            System.out.println("TEST3 = FAIL");
        }
    }

    public void test4() {
        int a = 28;
        int b = 46;
        int c = 51;
        double expectedSemiPerimeter = 62.5;

        TriangleSquare triangleSquare = new TriangleSquare();
        double realSemiPerimeter = triangleSquare.calculateSemiPerimeter(a, b, c);

        if (expectedSemiPerimeter == realSemiPerimeter) {
            System.out.println("TEST4 = OK");
        } else {
            System.out.println("TEST4 = FAIL");
        }
    }

    public void test5() {
        int a = 23;
        int b = 23;
        int c = 23;
        double expectedSemiPerimeter = 34.5;

        TriangleSquare triangleSquare = new TriangleSquare();
        double realSemiPerimeter = triangleSquare.calculateSemiPerimeter(a, b, c);

        if (expectedSemiPerimeter == realSemiPerimeter) {
            System.out.println("TEST5 = OK");
        } else {
            System.out.println("TEST5 = FAIL");
        }
    }

    public void test6() {
        int a = 14;
        int b = 14;
        int c = 9;
        double expectedSemiPerimeter = 18.5;

        TriangleSquare triangleSquare = new TriangleSquare();
        double realSemiPerimeter = triangleSquare.calculateSemiPerimeter(a, b, c);

        if (expectedSemiPerimeter == realSemiPerimeter) {
            System.out.println("TEST6 = OK");
        } else {
            System.out.println("TEST6 = FAIL");
        }
    }
}
