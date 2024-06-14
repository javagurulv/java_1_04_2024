package lv.javaguru.java1.student_maksims_latkovskis.level_7_array_for.homework.level_2_intern;

class RandomArrayApp {

    public static void main(String[] args){
        RandomIntArray randomIntArray = new RandomIntArray();

        int[] randomArray = randomIntArray.randomArray();
        randomIntArray.printIntArray(randomArray);
    }
}
