package lv.javaguru.java1.student_svetlana_bodnarska.lesson_7.homework.level_2_intern;

import java.util.Arrays;
import java.util.Random;

class RandomIntArray
{
    public int[] createAndFillArray() {
        int length = 10;
        int [] randomNumbers = new int [length];
        Random random = new Random();
        for (int i = 0; i < randomNumbers.length; i++){
            randomNumbers[i] = random.nextInt(100);
        }
        return randomNumbers;
    }

        public void printNumbers(int [] randomNumbers){
            for (int i = 0; i < randomNumbers.length; i++){
                System.out.println(randomNumbers[i]);
            }

    }


}
