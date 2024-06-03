package lv.javaguru.java1.student_nadezda_radigina.lesson_6.level_1_intern;

 class TriangleSquareTest {
     public static void main(String[] args){
         TriangleSquareTest test = new TriangleSquareTest();
         test.test1();
         test.test2();
         test.test3();
         test.test4();
         test.test5();

     }

     public void test1(){
         TriangleSquare triangleSquare = new TriangleSquare();
         double realResult = triangleSquare.calculateSemiPerimeter(1, 2, 3);
         double expectedResult = 3;
         if (expectedResult ==  realResult) {
             System.out.println("TEST 1 = OK");
         }else {
                 System.out.println("TEST 1 = FAIL");
             }
         }
     public void test2(){
         TriangleSquare triangleSquare = new TriangleSquare();
         double realResult = triangleSquare.calculateSemiPerimeter(-1, 2, 3);
         double expectedResult = 3;
         if (expectedResult ==  realResult) {
             System.out.println("TEST 2 = OK");
         }else {
             System.out.println("TEST 2 = FAIL");
         }
     }

     public void test3(){
         TriangleSquare triangleSquare = new TriangleSquare();
         double realResult = triangleSquare.calculateSemiPerimeter(0, 2, 3);
         double expectedResult = 3;
         if (expectedResult ==  realResult) {
             System.out.println("TEST 3 = OK");
         }else {
             System.out.println("TEST 3 = FAIL");
         }
     }

     public void test4(){
         TriangleSquare triangleSquare = new TriangleSquare();
         double realResult = triangleSquare.calculateSquare(3, 4, 5);
         double expectedResult = 6;
         System.out.println(realResult);
         if (expectedResult ==  realResult) {
             System.out.println("TEST 4 = OK");
         }else {
             System.out.println("TEST 4 = FAIL");
         }
     }
     public void test5(){
         TriangleSquare triangleSquare = new TriangleSquare();
         double realResult = triangleSquare.calculateSquare(3, 4, 5);
         double expectedResult = 7;
         System.out.println(realResult);
         if (expectedResult ==  realResult) {
             System.out.println("TEST 4 = OK");
         }else {
             System.out.println("TEST 4 = FAIL");
         }
     }
 }

