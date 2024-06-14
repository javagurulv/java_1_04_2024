package lv.javaguru.java1.student_maksims_latkovskis.level_7_array_for.homework.level_2_intern;

import java.util.concurrent.ThreadLocalRandom;

public class RandomIntArray {

    int[] randomArray(){
        int [] numbers = new int[10];

        for(int i = 0; i<numbers.length; i++){
            numbers[i] = ThreadLocalRandom.current().nextInt(0, 101);
        }
        return numbers;
    }

    void printIntArray(int[] array){
        for(int i = 0; i<array.length; i++) System.out.print(array[i] + ", ");
    }

}
