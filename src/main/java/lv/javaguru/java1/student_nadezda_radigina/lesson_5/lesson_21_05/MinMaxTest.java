package lv.javaguru.java1.student_nadezda_radigina.lesson_5.lesson_21_05;

 class MinMaxTest {

     public static void main(String[] args){
         MinMaxTest test = new MinMaxTest();
         test.test1();
         test.test2();
     }

     // 2, 5 -> 5
     public void test1(){
         MinMax maxNumber = new MinMax();
         int result = maxNumber.findMax(2, 5);
         if (result == 5){
             System.out.println("Test 1 = OK");
         } else {
             System.out.println("Test 1 = FAIL");
         }
     }
     // 5, 2 -> 5
     // 5, 5 -> 5
     // 3, 6 -> 5


     // 1, 2, 3 -> 3
     // 1, 3, 2 -> 3
     // 3, 2, 1 -> 3

     public void test2(){
         MinMax maxNumber = new MinMax();
         int result = maxNumber.findMax(1, 2, 3);
         if (result == 3){
             System.out.println("Test 2 = OK");
         } else {
             System.out.println("Test 2 = FAIL");
         }
     }
}
