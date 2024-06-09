package lv.javaguru.java1.student_nadezda_radigina.lesson_7.level_2_intern;

import java.util.Random;

class RandomIntArray {

     public int [] valuesRandom(){
                int n = 10;

         // Create array
         int[] randomArray = new int[n];

         // Create Random object
         Random random = new Random();

         // Assign random values
          for (int i = 0; i < n; i++) {
             // number between 0 and 99
             randomArray[i] = random.nextInt(100);
         }
          return randomArray;

     }

    public void randomValues (int[] randomArray) {
        int n = 10;
        for (int i = 0; i <  n; i++) {
            System.out.println(randomArray[i]);
        }
    }
}
