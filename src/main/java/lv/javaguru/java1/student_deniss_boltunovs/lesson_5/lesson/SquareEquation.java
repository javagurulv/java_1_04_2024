package lv.javaguru.java1.student_deniss_boltunovs.lesson_5.lesson;

import java.util.ArrayList;

class SquareEquation {

    public double findDiscriminant(int numA, int numB, int numC) {
        double numBSquared = Math.pow(numB, 2);
        return numBSquared - (4 * numA * numC);
    }

    private double findFirstRoot(int numA, int numB, int numC) {
        double discriminant = findDiscriminant(numA, numB, numC);
        double discriminantSquareRoot = Math.sqrt(discriminant);
        return  ((-numB) + discriminantSquareRoot) / (2 * numA);
    }

    private double findSecondRoot(int numA, int numB, int numC) {
        double discriminant = findDiscriminant(numA, numB, numC);
        double discriminantSquareRoot = Math.sqrt(discriminant);
        return  ((-numB) - discriminantSquareRoot) / (2 * numA);
    }

    ArrayList<Double>  findSquareRoots(int numA, int numB, int numC) {

        ArrayList<Double> squareRoots = new ArrayList<Double>();

        double discriminant = findDiscriminant(numA, numB, numC);
        double firstRoot = findFirstRoot(numA, numB, numC);
        double secondRoot = findSecondRoot(numA, numB, numC);

        if (discriminant > 0) {
             squareRoots.add(firstRoot);
             squareRoots.add(secondRoot);
         } else if (discriminant == 0) {
             squareRoots.add(firstRoot);
         }

        return squareRoots ;
    }

}
