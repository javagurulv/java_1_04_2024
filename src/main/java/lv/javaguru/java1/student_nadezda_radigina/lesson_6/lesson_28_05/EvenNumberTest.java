package lv.javaguru.java1.student_nadezda_radigina.lesson_6.lesson_28_05;

 class EvenNumberTest {
  // Podgotovka testovih dannih
     // 2 true  - test case 1
  // 0 ture - test case 2
  // -1 false - test case 3
  public static void main(String[]args){
   EvenNumberTest test = new EvenNumberTest();
   test.test1();
  }
  public void test1(){
   int number = 2;
   EvenNumber evenNumber = new EvenNumber();
   boolean realResult = evenNumber.isEven(number);
   if (realResult == true) {
    System.out.println("TEST 1 = OK");
   } else {
     System.out.println("TEST 1 = FAI");
    }


   }
  }

