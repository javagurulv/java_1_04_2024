package lv.javaguru.java1.student_nadezda_radigina.lesson_6.level_3_junior;

 class SquareEquationTest {
     public static void main(String[] args){
         SquareEquationTest test = new SquareEquationTest();
         test.test1();
         test.test2();
         test.test3();
         test.test4();
         test.test5();
         test.test6();
         test.test7();
         test.test8();
         test.test9();
         test.test10();
         test.test11();

     }
     public void test1(){
         SquareEquation squareEquation = new SquareEquation();
         double realResult = squareEquation.discriminant(3, -4, 2);
         double expectedResult = -8;
         if (expectedResult ==  realResult) {
             System.out.println("TEST 1 = OK");
         }else {
             System.out.println("TEST 1 = FAIL");
         }
     }
     public void test2(){
         SquareEquation squareEquation = new SquareEquation();
         double realResult = squareEquation.discriminant(3, -4, 2);
         double expectedResult = 8;
         if (expectedResult ==  realResult) {
             System.out.println("TEST 2 = OK");
         }else {
             System.out.println("TEST 2 = FAIL");
         }
     }

     // D -> <0
     // D -> =0
     // D -> >0
     public void test3(){
         SquareEquation squareEquation = new SquareEquation();
         double expectedResult = squareEquation.discriminant(3, -4, 2);
         System.out.println(expectedResult);
         boolean realResult = squareEquation.isSquareRoot(3, -4, 2);
         if (realResult == true) {
             System.out.println("TEST 3 = OK");
         } else {
             System.out.println("TEST 3 = FAIL");
         }
     }
     public void test4(){
         SquareEquation squareEquation = new SquareEquation();
         double expectedResult = squareEquation.discriminant(1, -6, 9);
         System.out.println(expectedResult);
         boolean realResult = squareEquation.isSquareRoot(1, -6, 9);
         if (realResult == true) {
             System.out.println("TEST 4 = OK");
         } else {
             System.out.println("TEST 4 = FAIL");
         }
     }
     public void test5(){
         SquareEquation squareEquation = new SquareEquation();
         double expectedResult = squareEquation.discriminant(1, -15, 26);
         System.out.println(expectedResult);
         boolean realResult = squareEquation.isSquareRoot(1, -15, 26);
         if (realResult == true) {
             System.out.println("TEST 5 = OK");
         } else {
             System.out.println("TEST 5 = FAIL");
         }
     }
     // D -> <0, there is no decision
     // D -> =0, only 1 root
     // D -> >0, first root, second root

     public void test6(){
         SquareEquation squareEquation = new SquareEquation();
         double expectedResult = squareEquation.discriminant(3, -4, 2);
         System.out.println(expectedResult);
         double realResult = squareEquation.firstRoot(3, -4, 2);
         if (expectedResult >= 0) {
             System.out.println("TEST 6 = OK - first root is " + realResult);
         }else {
             System.out.println("TEST 6 = FAIL - there is no decision");
         }
     }
     public void test7(){
         SquareEquation squareEquation = new SquareEquation();
         double expectedResult = squareEquation.discriminant(1, -6, 9);
         System.out.println(expectedResult);
         double realResult = squareEquation.firstRoot(1, -6, 9);
         if (expectedResult >= 0) {
             System.out.println("TEST 7 = OK - first root is " + realResult);
         }else {
             System.out.println("TEST 7 = FAIL - there is no decision");
         }
     }
     public void test8(){
         SquareEquation squareEquation = new SquareEquation();
         double expectedResult = squareEquation.discriminant(1, -15, 26);
         System.out.println(expectedResult);
         double realResult = squareEquation.firstRoot(1, -15, 26);
         if (expectedResult >= 0) {
             System.out.println("TEST 8 = OK - first root is " + realResult);
         }else {
             System.out.println("TEST 8 = FAIL - there is no decision");
         }
     }
     public void test9(){
         SquareEquation squareEquation = new SquareEquation();
         double expectedResult = squareEquation.discriminant(1, -15, 26);
         System.out.println(expectedResult);
         double realResult = squareEquation.secondRoot(1, -15, 26);
         if (expectedResult > 0) {
             System.out.println("TEST 9 = OK - second root is " + realResult);
         }else if (expectedResult == 0){
             System.out.println("TEST 9 = OK - only one root is " + realResult);
         }else {
             System.out.println("TEST 9 = FAIL - there is no decision");
         }
     }
     public void test10(){
         SquareEquation squareEquation = new SquareEquation();
         double expectedResult = squareEquation.discriminant(1, -6, 9);
         System.out.println(expectedResult);
         double realResult = squareEquation.secondRoot(1, -6, 9);
         if (expectedResult > 0) {
             System.out.println("TEST 10 = OK - second root is " + realResult);
         }else if (expectedResult == 0){
             System.out.println("TEST 10 = OK - only one root is " + realResult);
         }else {
             System.out.println("TEST 10 = FAIL - there is no decision");
         }
     }
     public void test11(){
         SquareEquation squareEquation = new SquareEquation();
         double expectedResult = squareEquation.discriminant(3, -4, 2);
         System.out.println(expectedResult);
         double realResult = squareEquation.secondRoot(3, -4, 2);
         if (expectedResult > 0) {
             System.out.println("TEST 11 = OK - second root is " + realResult);
         }else if (expectedResult == 0){
             System.out.println("TEST 11 = OK - only one root is " + realResult);
         }else {
             System.out.println("TEST 11 = FAIL - there is no decision");
         }
     }

 }

