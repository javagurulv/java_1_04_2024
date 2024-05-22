package lv.javaguru.java1.student_deniss_boltunovs.lesson_5.lesson;

import java.util.ArrayList;

class SquareEquationTest {

    public static void main(String[] args) {

        SquareEquationTest test = new SquareEquationTest();

        test.test1();
        test.test2();
        test.test3();

    }

    // two roots
    // 1,9,5 -> -0.594875162046673, -8.405124837953327
    public void test1(){
       SquareEquation equation = new SquareEquation();
       ArrayList<Double> result = equation.findSquareRoots(1,9,5);

       if ( (result.get(0) == -0.594875162046673) && (result.get(1) == -8.405124837953327) ) {
           System.out.println("test 1: OK");
       } else {
           System.out.println("test 1: FAILED");
       }
    }

    // one root
    // 1,-4,4 ->  2
    public void test2(){
        SquareEquation equation = new SquareEquation();
        ArrayList<Double> result = equation.findSquareRoots(1,-4,4);

        if (result.get(0) == 2) {
            System.out.println("test 2: OK");
        } else {
            System.out.println("test 2: FAILED");
        }
    }

    // no roots
    // 1,-4,11 ->  no roots
    public void test3(){
        SquareEquation equation = new SquareEquation();
        ArrayList<Double> result = equation.findSquareRoots(1,-4,11);

        if (result.isEmpty()) {
            System.out.println("test 3: OK");
        } else {
            System.out.println("test 3: FAILED");
        }
    }


}
