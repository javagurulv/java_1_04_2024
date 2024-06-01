package lv.javaguru.java1.student_nadezda_radigina.lesson_6.level_5_middle;

 class ColorWaveDetectorTest {
     public static void main(String[] args){
         ColorWaveDetectorTest test = new ColorWaveDetectorTest();
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
     }


     public void test1(){
         ColorWaveDetector colorWaveDetector = new ColorWaveDetector();
         String realResult = colorWaveDetector.colourWave(390);
         String expectedResult = "Violet";
         if (realResult.equals(expectedResult)){
             System.out.println("TEST 1 = OK");
         }else {
             System.out.println("TEST 1 = FAIL");
         }
         }
     public void test2(){
         ColorWaveDetector colorWaveDetector = new ColorWaveDetector();
         String realResult = colorWaveDetector.colourWave(452);
         String expectedResult = "Blue";
         if (realResult.equals(expectedResult)){
             System.out.println("TEST 2 = OK");
         }else {
             System.out.println("TEST 2 = FAIL");
         }
     }
     public void test3(){
         ColorWaveDetector colorWaveDetector = new ColorWaveDetector();
         String realResult = colorWaveDetector.colourWave(520);
         String expectedResult = "Green";
         if (realResult.equals(expectedResult)){
             System.out.println("TEST 3 = OK");
         }else {
             System.out.println("TEST 3 = FAIL");
         }
     }
     public void test4(){
         ColorWaveDetector colorWaveDetector = new ColorWaveDetector();
         String realResult = colorWaveDetector.colourWave(580);
         String expectedResult = "Yellow";
         if (realResult.equals(expectedResult)){
             System.out.println("TEST 4 = OK");
         }else {
             System.out.println("TEST 4 = FAIL");
         }
     }
     public void test5(){
         ColorWaveDetector colorWaveDetector = new ColorWaveDetector();
         String realResult = colorWaveDetector.colourWave(601);
         String expectedResult = "Orange";
         if (realResult.equals(expectedResult)){
             System.out.println("TEST 5 = OK");
         }else {
             System.out.println("TEST 5 = FAIL");
         }
     }
     public void test6(){
         ColorWaveDetector colorWaveDetector = new ColorWaveDetector();
         String realResult = colorWaveDetector.colourWave(700);
         String expectedResult = "Red";
         if (realResult.equals(expectedResult)){
             System.out.println("TEST 6 = OK");
         }else {
             System.out.println("TEST 6 = FAIL");
         }
     }
     public void test7(){
         ColorWaveDetector colorWaveDetector = new ColorWaveDetector();
         String realResult = colorWaveDetector.colourWave(200);
         String expectedResult = "Red";
         if (realResult.equals(expectedResult)){
             System.out.println("TEST 7 = OK");
         }else {
             System.out.println("TEST 7 = FAIL");
         }
     }
     public void test8(){
         ColorWaveDetector colorWaveDetector = new ColorWaveDetector();
         String realResult = colorWaveDetector.colourWave(500);
         String expectedResult = "Violet";
         if (realResult.equals(expectedResult)){
             System.out.println("TEST 8 = OK");
         }else {
             System.out.println("TEST 8 = FAIL");
         }
     }
     public void test9(){
         ColorWaveDetector colorWaveDetector = new ColorWaveDetector();
         String realResult = colorWaveDetector.colourWave(300);
         String expectedResult = "Green";
         if (realResult.equals(expectedResult)){
             System.out.println("TEST 9 = OK");
         }else {
             System.out.println("TEST 9 = FAIL");
         }
     }
     public void test10(){
         ColorWaveDetector colorWaveDetector = new ColorWaveDetector();
         String realResult = colorWaveDetector.colourWave(400);
         String expectedResult = "Orange";
         if (realResult.equals(expectedResult)){
             System.out.println("TEST 10 = OK");
         }else {
             System.out.println("TEST 10 = FAIL");
         }
     }
}
