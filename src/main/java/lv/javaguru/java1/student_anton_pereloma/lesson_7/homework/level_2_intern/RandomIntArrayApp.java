package lv.javaguru.java1.student_anton_pereloma.lesson_7.homework.level_2_intern;



class RandomIntArrayApp {
    public static void main(String[] args) {
        RandomIntArray randomIntArray = new RandomIntArray();

        int[] randomNumbersArray = randomIntArray.generateArray(100);
        randomIntArray.addNumbersToArray(randomNumbersArray);

        randomIntArray.printArrayToConsole(randomNumbersArray);

    }
}