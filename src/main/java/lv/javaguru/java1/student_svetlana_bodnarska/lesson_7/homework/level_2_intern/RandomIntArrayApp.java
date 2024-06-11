package lv.javaguru.java1.student_svetlana_bodnarska.lesson_7.homework.level_2_intern;

class RandomIntArrayApp
{
    public static void main(String[] args) {
        RandomIntArray randomIntArray = new RandomIntArray();
        int [] array = randomIntArray.createAndFillArray();
        randomIntArray.printNumbers(array);
    }
}
