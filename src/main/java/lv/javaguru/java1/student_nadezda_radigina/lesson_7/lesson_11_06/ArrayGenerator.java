package lv.javaguru.java1.student_nadezda_radigina.lesson_7.lesson_11_06;

 class ArrayGenerator {
  int[] arrayOfInts(){
   int[] tenElements = new int[10];
   for (int i = 0; i < tenElements.length; i++) {
    tenElements[i] = 0;

   }
   return tenElements;

  }
  int[] arrayOfInts(int arrayLength){
   int[] arrayOfInts = new int[arrayLength];
   for (int i = 0; i < arrayOfInts.length; i++) {
    arrayOfInts[i] = 0;

   }
   return arrayOfInts;

  }


 }
