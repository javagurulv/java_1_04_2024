package lv.javaguru.java1.student_nadezda_radigina.lesson_7.lesson_04_06;

 class Numbers {
     public int numbers(){
         int sum = 0;
         for (int i = 1; i <= 100; i++ ){
            sum = sum + i;
            System.out.println(sum);
         }
         return sum;
     }
}
