package lv.javaguru.java1.student_nadezda_radigina.lesson_6.level_1_intern;

 class AverageFinderTest {
     public static void main(String[] args){
         AverageFinderTest test = new AverageFinderTest();
         test.test1();
         test.test2();
     }

     public void test1(){
         AverageFinder averageFinder = new AverageFinder();
         double realResult =averageFinder.findAverage(6, 8);
         double expectedResult = 7;
         if (expectedResult ==  realResult) {
             System.out.println("TEST 1 = OK");
         }else {
             System.out.println("TEST 1 = FAIL");
         }
     }

     public void test2(){
         AverageFinder averageFinder = new AverageFinder();
         double realResult =averageFinder.findAverage(6, 8);
         double expectedResult = 8.5;
         if (expectedResult ==  realResult) {
             System.out.println("TEST 2 = OK");
         }else {
             System.out.println("TEST 2 = FAIL");
         }
     }

}
