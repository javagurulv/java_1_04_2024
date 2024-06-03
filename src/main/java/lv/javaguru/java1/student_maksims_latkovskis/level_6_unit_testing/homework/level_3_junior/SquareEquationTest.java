package lv.javaguru.java1.student_maksims_latkovskis.level_6_unit_testing.homework.level_3_junior;

class SquareEquationTest {

    public static void main(String[] args){
        SquareEquationTest test = new SquareEquationTest();
        test.discriminator1();
        test.discriminator2();
        test.isSquareRoot1();
        test.isSquareRoot2();
        test.firstRoot1();
        test.secondRoot1();

    }

    public void discriminator1(){
        // inputs a = 1, b = 3, c = 2, D is 1
        SquareEquation squareEquation = new SquareEquation();
        double expectedOutput = squareEquation.discriminant(1,3,2);
        testResult("1.0", Double.toString(expectedOutput),"Discriminator 1");
    }

    public void discriminator2(){
        // inputs a = 2, b = -2, c = 2, D is -12
        SquareEquation squareEquation = new SquareEquation();
        double expectedOutput = squareEquation.discriminant(2,-2,2);
        testResult("-12.0", Double.toString(expectedOutput),"Discriminator 2");
    }

    public void isSquareRoot1(){
        // inputs a = 1, b = 3, c = 2, is true
        SquareEquation squareEquation = new SquareEquation();
        boolean expectedOutput = squareEquation.isSquareRoot(1,3,2);
        testResult("true", Boolean.toString(expectedOutput),"isSquareRoot 1");
    }

    public void isSquareRoot2(){
        // inputs a = 2, b = -2, c = 2, is false
        SquareEquation squareEquation = new SquareEquation();
        boolean expectedOutput = squareEquation.isSquareRoot(2,-2,2);
        testResult("false", Boolean.toString(expectedOutput),"isSquareRoot 2");
    }

    public void firstRoot1(){
        // inputs a = 1, b = 3, c = 2, root 1 is -2
        SquareEquation squareEquation = new SquareEquation();
        double expectedOutput = squareEquation.firstRoot(1, 3, 2);
        testResult("-2.0", Double.toString(expectedOutput),"FirstRoot 1");
    }

    public void secondRoot1(){
        // inputs a = 1, b = 3, c = 2, root 2 is -1
        SquareEquation squareEquation = new SquareEquation();
        double expectedOutput = squareEquation.secondRoot(1, 3, 2);
        testResult("-1.0", Double.toString(expectedOutput),"SecondRoot 1");
    }



    public void testResult(String expectedOutput, String gainedOutput, String testName){
        if (expectedOutput.equals(gainedOutput)) {
            System.out.println("PASS " + testName);
        } else {
            System.out.println("FAIL " + testName);
            System.out.println("The gained output is: " + gainedOutput);
        }
    }
}
