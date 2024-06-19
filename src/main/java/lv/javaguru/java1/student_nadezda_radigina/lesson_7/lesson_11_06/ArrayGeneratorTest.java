package lv.javaguru.java1.student_nadezda_radigina.lesson_7.lesson_11_06;

 class ArrayGeneratorTest {
     public static void main(String[] args){
         ArrayGeneratorTest test = new ArrayGeneratorTest();
         test.test1();
         test.test2();

     }

     void test1(){
         ArrayGenerator tenElements = new ArrayGenerator();
         int[] arr = tenElements.arrayOfInts();
         for (int i = 0; i < arr.length; i++){
             if (arr[i] != 0){
             System.out.println("TEST 1 = FAIL");
             }
         }
         System.out.println("TEST 1 = OK");

     }
     void test2(){
         ArrayGenerator tenElements = new ArrayGenerator();
         int[] arr = tenElements.arrayOfInts(20);
         for (int i = 0; i < arr.length; i++){
             if (arr[i] != 0){
                 System.out.println("TEST 2 = FAIL");
             }
         }
         System.out.println("TEST 2 = OK");

     }

}
