package lv.javaguru.java1.student_maksims_latkovskis.level_6_unit_testing.homework.level_1_intern;

class TriangleSquareTest {

    public static void main(String[] args) {

        TriangleSquareTest test = new TriangleSquareTest();
        test.testSquare1();
        test.testSquare2();
        test.testPerimeter1();
        test.testPerimeter2();
    }

    public void testSquare1() {
        //Sides of triangle3, 4, 5;
        TriangleSquare triangleSquare = new TriangleSquare();

        if (triangleSquare.calculateSquare(3, 4, 5) == 6) {
            System.out.println("PASS test square 1");
        } else {
            System.out.println("FAIL test square 1");
        }
    }

    public void testSquare2() {
        //Sides of triangle 6, 8, 10;
        TriangleSquare triangleSquare = new TriangleSquare();

        if (triangleSquare.calculateSquare(6, 8, 10) == 24) {
            System.out.println("PASS test square 2");
        } else {
            System.out.println("FAIL test square 2");
        }
    }

    public void testPerimeter1() {
        //Sides of triangle 3, 4, 5;
        TriangleSquare triangleSquare = new TriangleSquare();

        if (triangleSquare.calculateSemiPerimeter(3, 4, 5) == 6) {
            System.out.println("PASS test perimeter 1");
        } else {
            System.out.println("FAIL test perimeter 1");
        }
    }

    public void testPerimeter2() {
        //Sides of triangle 6, 8, 10
        TriangleSquare triangleSquare = new TriangleSquare();

        if (triangleSquare.calculateSemiPerimeter(6, 8, 10) == 12) {
            System.out.println("PASS test perimeter 2");
        } else {
            System.out.println("FAIL test perimeter 2");
        }
    }


}
