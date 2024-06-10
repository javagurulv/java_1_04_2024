package lv.javaguru.java1.student_nadezda_radigina.lesson_7.lesson_04_06;

 class IntArrayExample {
     public static void main(String[] args){

         int[] marks = new int[5];
         System.out.println(marks[0]);
         System.out.println(marks[1]);
         System.out.println(marks[2]);
         System.out.println(marks[3]);
         System.out.println(marks[4]);
          marks[0] = 1;
          marks[1] = 10;
          marks[2] = 9;
          marks[3] = 7;
          marks[4] = 5;
         System.out.println(marks[0]);
         System.out.println(marks[1]);
         System.out.println(marks[2]);
         System.out.println(marks[3]);
         System.out.println(marks[4]);

         marks[2] = marks[1] + marks[3];
         marks[2] = marks[1] + marks[4];

         System.out.println("Length = " + marks.length);

         int[] arr = {1, 2, 5, 6};
         System.out.println("Arr = " + arr[0]);
         System.out.println("Arr = " + arr[1]);
         System.out.println("Arr = " + arr[2]);
         System.out.println("Arr = " + arr[3]);

         //for ( ; ; ){}
         // 0, 1, 2 ... 98, 99, 100

         for (int i = 1; i <= 100; i++){
             System.out.println(i);
         }
         // 100, 99, 98 ... 2, 1, 0

         for (int i = 100; i >= 1; i--){
             System.out.println(i);
         }

         // 0, 50, 10 ... 1000

         for (int i = 0; i <= 1000; i = i + 50){
             System.out.println(i);
         }

         // 1, 2 .... 9, 10

         for (int i = 1; i <= 10; i++){
             System.out.print(i);
             System.out.print(" ");
         }

         for (int i = 0; i < marks.length; i++){
           System.out.println(marks[i]);
         }

     }

}
