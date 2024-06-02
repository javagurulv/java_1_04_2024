package lv.javaguru.java1.student_svetlana_bodnarska.lesson_6.homework.level_3_junior;

class SquareEquationTest
{
    // D: 2, 1, 3 -> -23
    // D: 2, 10, 3 -> 76
    // D: -4, -12, -20 -> -176

    public static void main(String[] args) {
        SquareEquationTest test = new SquareEquationTest();

        test.discriminantTest1();
        test.discriminantTest2();
        test.discriminantTest3();

        test.squareRootTest1();
        test.squareRootTest2();
        test.squareRootTest3();

        test.firstRootTest1();
        test.firstRootTest2();
        test.firstRootTest3();

        test.secondRootTest1();
        test.secondRootTest2();
        test.secondRootTest3();
    }

    public void discriminantTest1() {
        SquareEquation squareEquation = new SquareEquation();
        double realResult = squareEquation.discriminant(2, 1, 3);
        checkResult(realResult, -23,"discriminant 1");
    }
    public void discriminantTest2() {
        SquareEquation squareEquation = new SquareEquation();
        double realResult = squareEquation.discriminant(2, 10, 3);
        checkResult(realResult, 76,"discriminant 2");
    }
    public void discriminantTest3() {
        SquareEquation squareEquation = new SquareEquation();
        double realResult = squareEquation.discriminant(-4, -12, -20);
        checkResult(realResult, -176,"discriminant 3");
    }
    public void checkResult (double realResult, double expectedResult, String testName){
        if (realResult == expectedResult){
            System.out.println("Test " + testName + " OK");
        } else {
            System.out.println("Test " + testName + " FAIL");
        }
    }
    public void squareRootTest1(){
        SquareEquation squareEquation = new SquareEquation();
        boolean realResult = squareEquation.isSquareRoot(2,1,3);
        checkResult(realResult, false, "square root 1");

    }
    public void squareRootTest2(){
        SquareEquation squareEquation = new SquareEquation();
        boolean realResult = squareEquation.isSquareRoot(2,10,3);
        checkResult(realResult, true, "square root 2");

    }
    public void squareRootTest3(){
        SquareEquation squareEquation = new SquareEquation();
        boolean realResult = squareEquation.isSquareRoot(-4,-12,-20);
        checkResult(realResult, false, "square root 3");
    }

    public void checkResult (boolean realResult, boolean expectedResult, String testName){
        if (realResult == expectedResult){
            System.out.println("Test " + testName + " OK");
        } else {
            System.out.println("Test " + testName + " FAIL");
        }
    }
    public void firstRootTest1(){
        SquareEquation squareEquation = new SquareEquation();
        double realResult = squareEquation.firstRoot(2, 1, 3);
        if (squareEquation.discriminant(2,1,3) < 0){
            System.out.println("First root test 1: there is no roots");
        } else {
            System.out.println("First root test 1: there are two roots");
        }
    }
    public void firstRootTest2(){
        SquareEquation squareEquation = new SquareEquation();
        double realResult = squareEquation.firstRoot(2, 10, 3);
        if (squareEquation.discriminant(2,10,3) < 0){
            System.out.println("First root test 2: there is no roots");
        } else {
            System.out.println("First root test 2: there are two roots");
        }
    }
    public void firstRootTest3(){
        SquareEquation squareEquation = new SquareEquation();
        if (squareEquation.discriminant(-4,-12,-20) < 0){
            System.out.println("First root test 3: there is no roots");
        } else {
            System.out.println("First root test 3: there are two roots");
        }
    }
    public void secondRootTest1(){
        SquareEquation squareEquation = new SquareEquation();
        double realResult = squareEquation.secondRoot(2, 1, 3);
        if (squareEquation.discriminant(2,1,3) < 0){
            System.out.println("First root test 1: there is no roots");
        } else {
            System.out.println("First root test 1: there are two roots");
        }
    }
    public void secondRootTest2(){
        SquareEquation squareEquation = new SquareEquation();
        double realResult = squareEquation.secondRoot(2, 10, 3);
        if (squareEquation.discriminant(2,10,3) < 0){
            System.out.println("First root test 2: there is no roots");
        } else {
            System.out.println("First root test 2: there are two roots");
        }
    }
    public void secondRootTest3(){
        SquareEquation squareEquation = new SquareEquation();
        if (squareEquation.discriminant(-4,-12,-20) < 0){
            System.out.println("First root test 3: there is no roots");
        } else {
            System.out.println("First root test 3: there are two roots");
        }
    }
}
